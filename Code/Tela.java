import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Tela extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setMinimumSize(new Dimension(900,70));
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public Tela() {
		final JFileChooser fc = new JFileChooser();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 919, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel painelBarraDeFerramentas = new JPanel();
		painelBarraDeFerramentas.setBackground(Color.WHITE);
		
		JTextArea txtaEditor = new JTextArea();
		txtaEditor.setBorder(new NumberedBorder());
		
		JTextArea txtaMensagens = new JTextArea();
		txtaMensagens.setEditable(false);
		
		JLabel lblStatus = new JLabel("StatusBar");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(txtaEditor, GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
				.addComponent(txtaMensagens, GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(1)
					.addComponent(lblStatus, GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE))
				.addComponent(painelBarraDeFerramentas, GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(painelBarraDeFerramentas, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtaEditor, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
					.addGap(7)
					.addComponent(txtaMensagens, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
					.addGap(15)
					.addComponent(lblStatus, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
		);
		
		JButton btnNovo = new JButton("Novo [ctrl-n]");
		btnNovo.setBounds(0, 0, 95, 60);
		btnNovo.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            txtaEditor.setText("");
	            lblStatus.setText("Novo documento criado");
			}
		});
		
		
		JButton btnAbrir = new JButton("Abrir [ctrl-o]");
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnAbrir) {
			        int returnVal = fc.showOpenDialog(btnAbrir);
	
			        if (returnVal == JFileChooser.APPROVE_OPTION) {
			            File file = fc.getSelectedFile();
			            FileReader fr;
			            String texto = "";
			            String textoAtual = "";
						try {
							fr = new FileReader(file);
				            BufferedReader br = new BufferedReader(fr);
							while((textoAtual = br.readLine()) != null){
								texto += textoAtual;
							}
                            br.close();
						} catch (FileNotFoundException e2) {
                            txtaMensagens.setText("Arquivo não encontrado");
							e2.printStackTrace();
						} catch (IOException e1) {
						    txtaMensagens.setText("Excessão não esperada");
						}
			            txtaEditor.setText(texto);
			            lblStatus.setText("Opening: " + file.getName() + " -- on path: " + file.getAbsolutePath());
			        } else {
			        	lblStatus.setText("Open command cancelled by user.");
			        }
			   }
			}
		});
		btnAbrir.setBounds(101, 0, 93, 60);
		btnAbrir.setFont(new Font("Tahoma", Font.PLAIN, 8));
		
		JButton btnSalvar = new JButton("Salvar [ctrl-s]");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnSalvar.setBounds(200, 0, 99, 60);
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 8));
		
		JButton btnCopiar = new JButton("Copiar [ctrl-c]");
		btnCopiar.setBounds(305, 0, 85, 60);
		btnCopiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCopiar.setFont(new Font("Tahoma", Font.PLAIN, 8));
		
		JButton btnColar = new JButton("Colar [ctrl-v]");
		btnColar.setBounds(396, 0, 95, 60);
		btnColar.setFont(new Font("Tahoma", Font.PLAIN, 8));
		
		JButton btnRecortar = new JButton("Recortar [ctrl-x]");
		btnRecortar.setBounds(497, 0, 113, 60);
		btnRecortar.setFont(new Font("Tahoma", Font.PLAIN, 8));
		
		JButton btnCompilar = new JButton("Compilar [F7]");
        btnCompilar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = txtaEditor.getText();
                
				Lexico lexico = new Lexico();
				Sintatico sintatico = new Sintatico();
				Semantico semantico = new Semantico();

				lexico.setInput( texto );

				try
				{
					sintatico.parse(lexico, semantico);
                    txtaMensagens.setText("Programa compilado com sucesso");
				}
		
				catch ( LexicalError ex )
				{
					String textoLido = txtaEditor.getText().substring(0, ex.getPosition());
                    txtaMensagens.setText("Erro na linha" + (contarOcorrencias(textoLido, "\n") + 1) + " - " + ex.getMessage());
				}
				catch ( SyntaticError ex )
				{
		     		System.out.println(ex.getPosition() + " símbolo encontrado: na entrada " + ex.getMessage()); 
			 
					//Trata erros sintáticos
					//linha 				sugestão: converter getPosition em linha
					//símbolo encontrado    sugestão: implementar um método getToken no sintatico
					//mensagem - símbolos esperados,   alterar ParserConstants.java, String[] PARSER_ERROR		
				}
				catch ( SemanticError ex )
				{
					//Trata erros semânticos
				}
				
				
				/*Lexico lexico = new Lexico();
                lexico.setInput(texto);

                try 
				{
                    Token token =  lexico.nextToken();
                    while(token != null){
                        token = lexico.nextToken();
                    }
                    txtaMensagens.setText("programa compilado com sucesso :)");
                } 
				catch (LexicalError ex) 
				{
                    String textoLido = txtaEditor.getText().substring(0, ex.getPosition());
                    txtaMensagens.setText("Erro na linha" + (contarOcorrencias(textoLido, "\n") + 1) + " - " + ex.getMessage());
			    }*/
            }
		});
        
		btnCompilar.setBounds(616, 0, 99, 60);
		btnCompilar.setFont(new Font("Tahoma", Font.PLAIN, 8));
		
		JButton btnEquipe = new JButton("Equipe [F1]");
		btnEquipe.setBounds(721, 0, 89, 60);
		btnEquipe.setFont(new Font("Tahoma", Font.PLAIN, 8));
		painelBarraDeFerramentas.setLayout(null);
		painelBarraDeFerramentas.add(btnNovo);
		painelBarraDeFerramentas.add(btnAbrir);
		painelBarraDeFerramentas.add(btnSalvar);
		painelBarraDeFerramentas.add(btnCopiar);
		painelBarraDeFerramentas.add(btnColar);
		painelBarraDeFerramentas.add(btnRecortar);
		painelBarraDeFerramentas.add(btnCompilar);
		painelBarraDeFerramentas.add(btnEquipe);
		contentPane.setLayout(gl_contentPane);
	}

    private long contarOcorrencias(String Texto, String alvo) {
    
    return Pattern.compile(alvo).matcher(Texto).results().count();
    }
}