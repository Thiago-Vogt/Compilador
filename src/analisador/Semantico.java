package analisador;

import java.util.ArrayList;

import Modelos.PilhaTipos;

public class Semantico implements Constants
{
	PilhaTipos pilha_tipos = new PilhaTipos();
	ArrayList<String> codigo = new ArrayList<>();
	
    public void executeAction(int action, Token token)	throws SemanticError
    {
        System.out.println("Ação #"+action+", Token: "+token);
        
        switch (action) {
        case 1:
            String tipo1 = pilha_tipos.desempilha();
            String tipo2 = pilha_tipos.desempilha();
            if (tipo1.equals("float64") || tipo2.equals("float64")) {
                pilha_tipos.empilha("float64");
            } else {
                pilha_tipos.empilha("int64");
            }
            codigo.add("add");
            break;
        case 2:
            tipo1 = pilha_tipos.desempilha();
            tipo2 = pilha_tipos.desempilha();
            if (tipo1.equals("float64") || tipo2.equals("float64")) {
                pilha_tipos.empilha("float64");
            } else {
                pilha_tipos.empilha("int64");
            }
            codigo.add("sub");
            break;
        case 3:
            tipo1 = pilha_tipos.desempilha();
            tipo2 = pilha_tipos.desempilha();
            if (tipo1.equals("float64") || tipo2.equals("float64")) {
                pilha_tipos.empilha("float64");
            } else {
                pilha_tipos.empilha("int64");
            }
            codigo.add("mul");
            break;
        default:
            // Ação inválida
            break;
    }

    }	
}
