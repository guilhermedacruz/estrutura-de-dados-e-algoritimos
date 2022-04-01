package br.com.guilherme.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String [capacidade];
		this.tamanho = 0 ;
	}
	// Méttodo Para for
	/*public void adiciona(String elemento) {
		for (int i=0 ; i<this.elementos.length; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}*/
	// Método Para exceptions 
	/*public void adiciona(String elemento) throws Exception {
		if (this.tamanho < this.elementos.length) {
		this.elementos[this.tamanho] = elemento;
		this.tamanho++;
		} else {
			throw new Exception("Vetor cheio!");
		}
	}*/
	
	// Método Para boolean
	public boolean adiciona (String elemento) {
		if (tamanho < elementos.length) {
			elementos[tamanho] = elemento;
			tamanho++;
			return true;
		}
		return false;
	}
	
	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i = 0; i<this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(",");
		}
		if(this.tamanho > 0) {
			s.append (this.elementos[this.tamanho-1]);
		}
		s.append("]");
		
		return  s.toString();
	}
	
	
	
}
