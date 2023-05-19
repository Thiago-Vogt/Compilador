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
        "Era esperado fim_de_programa",
        "Era esperado identificador",
        "Era esperado constante_int",
        "Era esperado constante_float",
        "Era esperado constante_binário",
        "Era esperado constante_string",
        "Era esperado pr_check",
        "Era esperado pr_and",
        "Era esperado pr_else",
        "Era esperado pr_end",
        "Era esperado pr_false",
        "Era esperado pr_if",
        "Era esperado pr_not",
        "Era esperado pr_or",
        "Era esperado pr_read",
        "Era esperado pr_true",
        "Era esperado pr_write",
        "Era esperado pr_writeln",
        "Era esperado ,",
        "Era esperado ;",
        "Era esperado =",
        "Era esperado :",
        "Era esperado (",
        "Era esperado )",
        "Era esperado ==",
        "Era esperado !=",
        "Era esperado <",
        "Era esperado >",
        "Era esperado <=",
        "Era esperado >=",
        "Era esperado +",
        "Era esperado -",
        "Era esperado *",
        "Era esperado /",
        "Era esperado identificador check if read write writeln",//<lista_de_comandos> inválido"
        "Era esperado fim_de_programa identificador check else and if read write writeln",//"<lista_de_comandos1> inválido"
        "Era esperado identificador",//"<lista_id> inválido"
        "Era esperado identificador",//"<comando_de_atribuicao> inválido"
        "Era esperado : ;",//"<comando_de_atribuicao1> inválido"
        "Era esperado read",//"<comando_de_entrada> inválido"
        "Era esperado if",//"<comando_de_selecao> inválido"
        "Era esperado else end",//"<comando_de_selecao1> inválido"
        "Era esperado check",//"<comando_de_repeticao> inválido"
        "Era esperado false true",//"<comando_de_repeticao1> inválido"
        "Era esperado write writeln",//"<comando_de_saida> inválido"
        "Era esperado expressão",//"<lista_de_expressoes> inválido"
        "Era esperado , )",//"<lista_de_expressoes1> inválido"
        "Era esperado identificador check if read write writeln",//"<comando> inválido"
        "Era esperado identificador constante_int constante_float constante_binario constante_string false not true ( + -",//"<expressao> inválido"
        "Era esperado and or , ; : )",//"<expressao_> inválido",
        "Era esperado identificador contante_int constante_float constante_binario constante_string false not true ( + -",//"<elemento> inválido"
        "Era esperado identificador constante_int constante_float constante_binario constante_string ( + -",//"<relacional> inválido"
        "Era esperado and or , ; : ) == != < > <= >=",//"<relacional_> inválido",
        "Era esperado == != < > <= >=",//"<operador_relacional> inválido",
        "Era esperado identificador constante_int constante_float constante_binario constante_string ( + -",//"<aritmetica> inválido"
        "Era esperado and or , ; : ) == != < > <= >= + -",//"<aritmetica_> inválido"
        "Era esperado constante_int constante_float constante_binario constante_string ( + -",//"<termo> inválido"
        "Era esperado and or , : ; ) == != < <= > >= + - * /",//"<termo_> inválido"
        "Era esperado identificador constante_int constante_float onstante_binario constante_strin ( + -",//"<fator> inválido"
        "Era esperado , = )",//"<lista_id1> inválido"
    };
}
