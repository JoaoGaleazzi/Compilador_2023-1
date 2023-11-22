public interface ParserConstants
{
    int START_SYMBOL = 37;

    int FIRST_NON_TERMINAL    = 37;
    int FIRST_SEMANTIC_ACTION = 74;

    int[][] PARSER_TABLE =
    {
        { -1, -1, -1, -1, -1, -1, -1, -1, -1,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1,  1, -1, -1, -1, -1, -1, -1, -1,  1,  1, -1,  1,  1, -1,  1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1,  2, -1, -1, -1, -1, -1, -1, -1,  5,  3, -1,  4,  6, -1,  6, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1,  7, -1, -1, -1, -1, -1, -1, -1,  7,  7, -1,  7,  7, -1,  7, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  8, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 11, 10,  9, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 12, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 21, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 22, -1, -1, -1, -1, -1, -1, -1, 25, 23, -1, 24, 26, -1, 26, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 14, 15, 15, 15, -1, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, 16, 17, 18, -1, -1, 20, -1, -1, -1, -1, -1, -1, 19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 27, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 28, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 34, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 45, -1, 44, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 29, -1, -1, 29, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 31, -1, -1, 30, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 32, -1, -1, -1, 33, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 35, 35, 35, 35, -1, -1, 35, -1, -1, -1, -1, -1, -1, 35, -1, -1, -1, 35, -1, -1, -1, -1, 35, -1, -1, -1, -1, -1, -1, -1, 35, 35, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, -1, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 41, -1, -1, -1, -1, -1, -1, -1, 41, 41, -1, 41, 41, -1, 41, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 42, -1, -1, -1, -1, -1, -1, -1, 42, 42, -1, 42, 42, -1, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, 39, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 46, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 47, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 48, 48, 48, 48, -1, -1, 48, -1, -1, -1, -1, -1, -1, 48, -1, -1, -1, 48, -1, -1, -1, -1, 48, -1, -1, -1, -1, -1, -1, -1, 48, 48, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 50, 51, -1, 49, 49, -1, -1, -1, 49, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 52, 52, 52, 52, -1, -1, 54, -1, -1, -1, -1, -1, -1, 53, -1, -1, -1, 55, -1, -1, -1, -1, 52, -1, -1, -1, -1, -1, -1, -1, 52, 52, -1, -1 },
        { -1, -1, 56, 56, 56, 56, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 56, -1, -1, -1, -1, -1, -1, -1, 56, 56, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 57, 57, -1, 57, 57, -1, -1, -1, 57, -1, -1, 58, 58, 58, 58, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 60, 61, 62, -1, -1, -1, -1 },
        { -1, -1, 63, 63, 63, 63, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 63, -1, -1, -1, -1, -1, -1, -1, 63, 63, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 64, 64, -1, 64, 64, -1, -1, -1, 64, -1, -1, 64, 64, 64, 64, 65, 66, -1, -1 },
        { -1, -1, 67, 67, 67, 67, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 67, -1, -1, -1, -1, -1, -1, -1, 67, 67, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 68, 68, -1, 68, 68, -1, -1, -1, 68, -1, -1, 68, 68, 68, 68, 68, 68, 69, 70 },
        { -1, -1, 71, 72, 73, 74, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 75, -1, -1, -1, -1, -1, -1, -1, 76, 77, -1, -1 }
    };

    int[][] PRODUCTIONS = 
    {
        { 174,  10,  13,  27,  38,  28, 175 },
        {  39,  22,  40 },
        {  43,  41 },
        {  49 },
        {  50 },
        {  51 },
        {  52 },
        {  39,  22,  40 },
        {   0 },
        {  42, 200 },
        {  23,  63, 202 },
        { 201 },
        {  24,  47 },
        {   3, 199,  46 },
        {  21,   3,  46 },
        {   0 },
        {   4 },
        {   5 },
        {   6 },
        {  16 },
        {   9 },
        {  45 },
        {  48 },
        {  49 },
        {  50 },
        {  51 },
        {  52 },
        {  45,  23,  63, 202 },
        {  12,  25,  53,  26 },
        {  54,  45, 203,  55 },
        {   6, 204,  21 },
        {   0 },
        {  22,  53 },
        {   0 },
        {  14,  25,  56,  26 },
        {  63, 176,  57 },
        {  21,  56 },
        {   0 },
        {  11,  25,  63,  26, 192,  27,  58,  28,  60, 193 },
        { 194,   8,  27,  58,  28 },
        {   0 },
        {  44,  22,  59 },
        {  58 },
        {   0 },
        {  61 },
        {  62 },
        { 195,  17,  25,  63,  26, 196,   7,  27,  58,  28, 197 },
        { 195,  15,  27,  58,  28,  17,  25,  63,  26, 198 },
        {  65,  64 },
        {   0 },
        {  18,  65, 177,  64 },
        {  19,  65, 178,  64 },
        {  66 },
        {  16, 179 },
        {   9, 180 },
        {  20,  65, 181 },
        {  69,  67 },
        {   0 },
        {  68, 182,  69, 183 },
        {  29 },
        {  30 },
        {  31 },
        {  32 },
        {  71,  70 },
        {   0 },
        {  33,  71, 184,  70 },
        {  34,  71, 185,  70 },
        {  73,  72 },
        {   0 },
        {  35,  73, 186,  72 },
        {  36,  73, 187,  72 },
        {   3, 205 },
        {   4, 188 },
        {   5, 189 },
        {   6, 190 },
        {  25,  63,  26 },
        {  33,  73 },
        {  34,  73, 191 }
    };

    String[] PARSER_ERROR =
    {
        "",
        "Era esperado fim de programa",
        "Era esperado palavra_reservada",
        "Era esperado identificador",
        "Era esperado constante_int",
        "Era esperado constante_float",
        "Era esperado constante_string",
        "Era esperado do",
        "Era esperado else",
        "Era esperado false",
        "Era esperado fun",
        "Era esperado if",
        "Era esperado in",
        "Era esperado main",
        "Era esperado out",
        "Era esperado repeat",
        "Era esperado true",
        "Era esperado while",
        "Era esperado \"&\"",
        "Era esperado \"|\"",
        "Era esperado \"!\"",
        "Era esperado \",\"",
        "Era esperado \";\"",
        "Era esperado \"=\"",
        "Era esperado \":\"",
        "Era esperado \"(\"",
        "Era esperado \")\"",
        "Era esperado \"{\"",
        "Era esperado \"}\"",
        "Era esperado \"==\"",
        "Era esperado \"!=\"",
        "Era esperado \"<\"",
        "Era esperado \">\"",
        "Era esperado \"+\"",
        "Era esperado \"-\"",
        "Era esperado \"*\"",
        "Era esperado \"/\"",
        "<programa> inv�lido",
        "<lista_de_instrucoes> inv�lido",
        "<instrucao> inv�lido",
        "<instrucao_> inv�lido",
        "<instrucao__> inv�lido",
        "<declaracao_de_constante> inv�lido",
        "<declaracao_de_variaveis> inv�lido",
        "<comando> inv�lido",
        "<lista_de_identificadores> inv�lido",
        "<lista_de_identificadores_> inv�lido",
        "<valor> inv�lido",
        "<comando_atribuicao> inv�lido",
        "<comando_entrada_dados> inv�lido",
        "<comando_saida_dados> inv�lido",
        "<comando_selecao> inv�lido",
        "<comando_repeticao> inv�lido",
        "<lista_entrada> inv�lido",
        "<lista_entrada_> inv�lido",
        "<lista_entrada__> inv�lido",
        "<lista_expressoes> inv�lido",
        "<lista_expressoes_> inv�lido",
        "<lista_de_comandos> inv�lido",
        "<lista_de_comandos_> inv�lido",
        "<comando_else> inv�lido",
        "<comando_while> inv�lido",
        "<comando_repeat> inv�lido",
        "<expressao> inv�lido",
        "<expressao_> inv�lido",
        "<elemento> inv�lido",
        "<relacional> inv�lido",
        "<relacional_> inv�lido",
        "<operador_relacional> inv�lido",
        "<aritmetica> inv�lido",
        "<aritmetica_> inv�lido",
        "<termo> inv�lido",
        "<termo_> inv�lido",
        "<fator> inv�lido"
    };
}
