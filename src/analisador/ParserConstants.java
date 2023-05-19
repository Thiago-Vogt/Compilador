package analisador;
public interface ParserConstants
{
    int START_SYMBOL = 35;

    int FIRST_NON_TERMINAL    = 35;
    int FIRST_SEMANTIC_ACTION = 61;

    int[][] PARSER_TABLE =
    {
        { -1, 20, -1, -1, -1, -1, 20, -1, -1, -1, -1, 20, -1, -1, 20, -1, 20, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { 21, 22, -1, -1, -1, -1, 22, -1, 21, 21, -1, 22, -1, -1, 22, -1, 22, 22, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 56, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  1, -1,  2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1,  6,  5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1,  7, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  9, -1, -1, -1, -1,  8, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 12, 12, 12, 12, 12, -1, -1, -1, -1, 12, -1, 12, -1, -1, 12, -1, -1, -1, -1, -1, -1, 12, -1, -1, -1, -1, -1, -1, -1, 12, 12, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 14, -1, -1, -1, -1, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 15, -1, -1, -1, -1, 19, -1, -1, -1, -1, 18, -1, -1, 16, -1, 17, 17, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 23, 23, 23, 23, 23, -1, -1, -1, -1, 23, -1, 23, -1, -1, 23, -1, -1, -1, -1, -1, -1, 23, -1, -1, -1, -1, -1, -1, -1, 23, 23, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, 25, -1, -1, -1, -1, -1, 26, -1, -1, -1, -1, 24, 24, -1, 24, -1, 24, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 27, 27, 27, 27, 27, -1, -1, -1, -1, 29, -1, 30, -1, -1, 28, -1, -1, -1, -1, -1, -1, 27, -1, -1, -1, -1, -1, -1, -1, 27, 27, -1, -1 },
        { -1, 31, 31, 31, 31, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 31, -1, -1, -1, -1, -1, -1, -1, 31, 31, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, 32, -1, -1, -1, -1, -1, 32, -1, -1, -1, -1, 32, 32, -1, 32, -1, 32, 33, 33, 33, 33, 33, 33, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 34, 35, 36, 38, 37, 39, -1, -1, -1, -1 },
        { -1, 40, 40, 40, 40, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, -1, -1, -1, -1, -1, -1, -1, 40, 40, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, 41, -1, -1, -1, -1, -1, 41, -1, -1, -1, -1, 41, 41, -1, 41, -1, 41, 41, 41, 41, 41, 41, 41, 42, 43, -1, -1 },
        { -1, 44, 44, 44, 44, 44, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, -1, -1, -1, -1, -1, -1, -1, 44, 44, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, 45, -1, -1, -1, -1, -1, 45, -1, -1, -1, -1, 45, 45, -1, 45, -1, 45, 45, 45, 45, 45, 45, 45, 45, 45, 46, 47 },
        { -1, 48, 49, 50, 51, 52, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 53, -1, -1, -1, -1, -1, -1, -1, 54, 55, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 58, -1, 57, -1, -1, 57, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
    };

    int[][] PRODUCTIONS = 
    {
        { 37, 21, 49, 39 },
        {  0 },
        { 22, 12, 49 },
        { 15, 23, 37, 24 },
        { 12, 23, 49, 24, 35, 42 },
        { 10 },
        {  9, 35, 10 },
        {  7, 23, 49, 24, 22, 12, 44 },
        { 16, 35, 10 },
        { 11, 35, 10 },
        { 17, 23, 46, 24 },
        { 18, 23, 46, 24 },
        { 49, 47 },
        {  0 },
        { 19, 46 },
        { 38 },
        { 40 },
        { 45 },
        { 41 },
        { 43 },
        { 48, 20, 36 },
        {  0 },
        { 48, 20, 35 },
        { 51, 50 },
        {  0 },
        {  8, 51, 50 },
        { 14, 51, 50 },
        { 52 },
        { 16 },
        { 11 },
        { 13, 51 },
        { 55, 53 },
        {  0 },
        { 54, 55 },
        { 25 },
        { 26 },
        { 27 },
        { 29 },
        { 28 },
        { 30 },
        { 57, 56 },
        {  0 },
        { 31, 57, 56 },
        { 32, 57, 56 },
        { 59, 58 },
        {  0 },
        { 33, 59, 58 },
        { 34, 59, 58 },
        {  2 },
        {  3 },
        {  4 },
        {  5 },
        {  6 },
        { 23, 49, 24 },
        { 31, 59 },
        { 32, 59 },
        {  2, 60 },
        {  0 },
        { 19, 37 }
    };

    String[] PARSER_ERROR =
    {
        "",
        "esperado fim_de_programa",
        "esperado identificador",
        "esperado constante_int",
        "esperado constante_float",
        "esperado constante_binário",
        "esperado constante_string",
        "esperado pr_check",
        "esperado pr_and",
        "esperado pr_else",
        "esperado pr_end",
        "esperado pr_false",
        "esperado pr_if",
        "esperado pr_not",
        "esperado pr_or",
        "esperado pr_read",
        "esperado pr_true",
        "esperado pr_write",
        "esperado pr_writeln",
        "esperado ,",
        "esperado ;",
        "esperado =",
        "esperado :",
        "esperado (",
        "esperado )",
        "esperado ==",
        "esperado !=",
        "esperado <",
        "esperado >",
        "esperado <=",
        "esperado >=",
        "esperado +",
        "esperado -",
        "esperado *",
        "esperado /",
        "esperado identificador check if read write writeln",//<lista_de_comandos> inválido"
        "esperado fim_de_programa identificador check else and if read write writeln",//"<lista_de_comandos1> inválido"
        "esperado identificador",//"<lista_id> inválido"
        "esperado identificador",//"<comando_de_atribuicao> inválido"
        "esperado : ;",//"<comando_de_atribuicao1> inválido"
        "esperado read",//"<comando_de_entrada> inválido"
        "esperado if",//"<comando_de_selecao> inválido"
        "esperado else end",//"<comando_de_selecao1> inválido"
        "esperado check",//"<comando_de_repeticao> inválido"
        "esperado false true",//"<comando_de_repeticao1> inválido"
        "esperado write writeln",//"<comando_de_saida> inválido"
        "esperado expressão",//"<lista_de_expressoes> inválido"
        "esperado , )",//"<lista_de_expressoes1> inválido"
        "esperado identificador check if read write writeln",//"<comando> inválido"
        "esperado identificador constante_int constante_float constante_binario constante_string false not true ( + -",//"<expressao> inválido"
        "esperado and or , ; : )",//"<expressao_> inválido",
        "esperado identificador contante_int constante_float constante_binario constante_string false not true ( + -",//"<elemento> inválido"
        "esperado identificador constante_int constante_float constante_binario constante_string ( + -",//"<relacional> inválido"
        "esperado and or , ; : ) == != < > <= >=",//"<relacional_> inválido",
        "esperado == != < > <= >=",//"<operador_relacional> inválido",
        "esperado identificador constante_int constante_float constante_binario constante_string ( + -",//"<aritmetica> inválido"
        "esperado and or , ; : ) == != < > <= >= + -",//"<aritmetica_> inválido"
        "esperado constante_int constante_float constante_binario constante_string ( + -",//"<termo> inválido"
        "esperado and or , : ; ) == != < <= > >= + - * /",//"<termo_> inválido"
        "esperado identificador constante_int constante_float onstante_binario constante_strin ( + -",//"<fator> inválido"
        "esperado , = )",//"<lista_id1> inválido"
    };
}
