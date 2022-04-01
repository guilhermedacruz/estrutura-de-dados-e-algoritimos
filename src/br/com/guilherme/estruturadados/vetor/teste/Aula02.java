package br.com.guilherme.estruturadados.vetor.teste;

import br.com.guilherme.estruturadados.vetor.Vetor;

public class Aula02 {
	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);
		vetor.adiciona("elemento1");
		
		System.out.println(vetor.tamanho());
		System.out.println(vetor);
	}

}
