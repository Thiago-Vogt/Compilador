package Modelos;

import java.util.Stack;

public class PilhaTipos {

	 Stack<String> pilha = new Stack<>();
	
	
	public String desempilha() {
		return pilha.pop();
	}
	
	public void empilha(String tipo) {
		pilha.push(tipo);
	}
}
