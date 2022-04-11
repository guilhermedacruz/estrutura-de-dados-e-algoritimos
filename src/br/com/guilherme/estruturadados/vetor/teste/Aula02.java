package br.com.guilherme.estruturadados.vetor.teste;

import br.com.guilherme.estruturadados.vetor.Vetor;

public class Aula02 {
	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("b");
		vetor.adiciona("c");
		vetor.adiciona("d");
		vetor.adiciona("e");
		vetor.adiciona("f");
		vetor.adiciona("g");
		System.out.println(vetor);
		vetor.adiciona(0, "a");
		System.out.println(vetor);
	}

}
