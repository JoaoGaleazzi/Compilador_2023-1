package resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Semantico
{
	public StringBuilder codigoGerado = new StringBuilder();
	public Stack<String> pilhaMain = new Stack<String>();
	public ArrayList<String> identificadores = new ArrayList<>();
	public Stack<String> pilhaRotulos = new Stack<String>();
	public String operador;
	public Token identificador;
	public HashMap<String, String> tabelaSimbolos = new HashMap<>();
	public String rotulo;
	public int indice = 1;
	
    public void executeAction(int action, Token token)	throws SemanticError
    {
    	switch (action) {
		case 100:
			acao100();
			break;
		case 101:
			acao101();
			break;

		case 102:
			acao102();
			break;

		case 103:
			acao103();
			break;
		case 104:
			acao104();
			break;

		case 105:
			acao105();
			break;
		case 106:
			acao106();
			break;

		case 107:
			acao107();
			break;

		case 108:
			acao108(token);
			break;
		case 109:
			acao109();
			break;

		case 110:
			acao110();
			break;
		case 111:
			acao111();
			break;

		case 112:
			acao112();
			break;

		case 113:
			acao113();
			break;
		case 114:
			acao114(token);
			break;

		case 115:
			acao115(token);
			break;
			
		case 116:
			acao116(token);
			break;

		case 117:
			acao117();
			break;

		case 118:
			acao118();
			break;

		case 119:
			acao119();
			break;

		case 120:
			acao120();
			break;
		
		default:
			throw new SemanticError("Ação " + action + " não existe");
		}

    }	
    
    private void acao100() {//
		this.codigoGerado.append(
				".assembly extern mscorlib {} .assembly _codigo_objeto{} .module   _codigo_objeto.exe .class public _UNICA{  .method static public void _principal() { .entrypoint\n");
	}

	private void acao101() {//
		this.codigoGerado.append("ret } }");
	}
	
	private void acao102() {//
		String tipo = this.tabelaSimbolos.get(identificador.getLexeme());

		switch (tipo) {
		case "int64":
			this.codigoGerado.append("conv.i8\n");
			this.codigoGerado.append("stloc " + identificador.getLexeme() + "\n");
			break;

		default:
			this.codigoGerado.append("stloc " + identificador.getLexeme() + "\n");
			break;
		}
	}
	
	private void acao103() throws SemanticError {//
		String tipo1 = this.pilhaMain.pop();
		String tipo2 = this.pilhaMain.pop();

		if (!tipo1.equals("bool") || !tipo2.equals("bool")) {
			throw new SemanticError("tipo esperado: bool");
		}

		this.codigoGerado.append("and\n");
	}

	private void acao104() throws SemanticError {//
		String tipo1 = this.pilhaMain.pop();
		String tipo2 = this.pilhaMain.pop();

		if (!tipo1.equals("bool") || !tipo2.equals("bool")) {
			throw new SemanticError("tipo esperado: bool");
		}

		this.codigoGerado.append("or\n");
	}
	
	private void acao105() {//
		this.pilhaMain.push("bool");
		this.codigoGerado.append("ldc.i4.1\n");
	}

	private void acao106() {//
		this.pilhaMain.push("bool");
		this.codigoGerado.append("ldc.i4.0\n");
	}

	private void acao107() throws SemanticError {//
		String tipo = this.pilhaMain.pop();

		if (!tipo.equals("bool")) {
			throw new SemanticError("tipo esperado: bool");
		}

		this.pilhaMain.push("bool");
		this.codigoGerado.append("ldc.i4.1\n");
		this.codigoGerado.append("xor\n");
	}
	
	
	private void acao108(Token token) throws SemanticError {
		if (!this.tabelaSimbolos.containsKey(token.getLexeme())) {
			throw new SemanticError(token.getLexeme() + " não declarado.");
		}
		this.identificador = token;
	}

	private void acao109() {
		String tipo = this.tabelaSimbolos.get(identificador.getLexeme());

		switch (tipo) {
		case "int64":
			this.codigoGerado.append("conv.i8\n");
			this.codigoGerado.append("stloc " + identificador.getLexeme() + "\n");
			break;

		default:
			this.codigoGerado.append("stloc " + identificador.getLexeme() + "\n");
			break;
		}
	}
	
	
	
	
	private void acao110() { //
		String tipo1 = this.pilhaMain.pop();
		String tipo2 = this.pilhaMain.pop();

		if (tipo1.equals("float64") || tipo2.equals("float64")) {
			this.pilhaMain.push("float64");
		} else {
			this.pilhaMain.push("int64");
		}
		this.codigoGerado.append("add\n");
	}

	private void acao111() {//
		String tipo1 = this.pilhaMain.pop();
		String tipo2 = this.pilhaMain.pop();

		if (tipo1.equals("float64") || tipo2.equals("float64")) {
			this.pilhaMain.push("float64");
		} else {
			this.pilhaMain.push("int64");
		}
		this.codigoGerado.append("sub\n");
	}
	
	private void acao112() {//
		String tipo1 = this.pilhaMain.pop();
		String tipo2 = this.pilhaMain.pop();

		if (tipo1.equals("float64") || tipo2.equals("float64")) {
			this.pilhaMain.push("float64");
		} else {
			this.pilhaMain.push("int64");
		}
		this.codigoGerado.append("mul\n");
	}
	
	
	private void acao113() throws SemanticError {
		String tipo1 = this.pilhaMain.pop();
		String tipo2 = this.pilhaMain.pop();

		if (!tipo1.equals(tipo2)) {
			throw new SemanticError("incompatíveis acao103");
		}

		this.pilhaMain.push(tipo1);
		this.codigoGerado.append("div\n");
	}
	
	
	

    	private void acao114(Token token) { //
    		this.pilhaMain.push("int64");
    		this.codigoGerado.append("ldc.i8 " + token.getLexeme().replace("_", "") + "\n");
    		this.codigoGerado.append("conv.r8\n");
    	}

    	private void acao115(Token token) { //
    		this.pilhaMain.push("float64");
    		this.codigoGerado.append("ldc.r8 " + token.getLexeme().replace("_", "") + "\n");
    	}
    	
    	private void acao116(Token token) {//
    		this.pilhaMain.push("string");
    		this.codigoGerado.append("ldstr \"" + token.getLexeme().replaceAll("'", "") + "\"\n");
    	}

    	private void acao117() throws SemanticError {//
    		String tipo = this.pilhaMain.pop();

    		if (!tipo.equals("float64") && !tipo.equals("int64")) {
    			throw new SemanticError("tipos incompatíveis acao107");
    		}

    		this.codigoGerado.append("ldc.i8 -1\n");
    		this.codigoGerado.append("conv.r8\n");
    		this.codigoGerado.append("mul\n");
    		this.pilhaMain.push(tipo);
    	}
    	

    	private void acao118() {//
    		this.pilhaMain.pop();
    		this.rotulo = "r" + indice++;
    		this.pilhaRotulos.add(String.valueOf(this.rotulo));
    		this.codigoGerado.append("brfalse " + this.rotulo + "\n");
    	}
    	
    	private void acao119() {
    		this.codigoGerado.append(this.pilhaRotulos.pop() + ":\n");
    	}

    	private void acao120() {//
    		this.rotulo = "r" + indice++;
    		this.pilhaRotulos.add(String.valueOf(this.rotulo));
    		this.codigoGerado.append("br " + this.rotulo + "\n");
    		this.codigoGerado.append(this.pilhaRotulos.pop() + ":\n");
    	}

    	private String getClasse(Token token) {
    		switch (token.getId()) {
    		case 4:
    			return "int64";

    		case 5:
    			return "float64";
    			
    		case 6:
    			return "string";

    		case 9:
    			return "bool";

    		case 16:
    			return "bool";
    		}
    		return null;
    	}
}
