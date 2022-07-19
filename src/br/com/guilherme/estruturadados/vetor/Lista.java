 package br.com.guilherme.estruturadados.vetor;

import java.util.Arrays;

public class Lista <T>{
	
	private T [] elementos;
	private int tamanho;
	
	public Lista(int capacidade) {
		this.elementos = (T[]) new Object [capacidade];
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
	public boolean adiciona (T elemento) {
		aumentaCapacidade();
		if (tamanho < elementos.length) {
			elementos[tamanho] = elemento;
			tamanho++;
			return true;
		}
		return false;
	}
	
	public boolean adiciona(int posicao, T elemento) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		
		aumentaCapacidade();
		
		//mover todos os elementos
		for (int i= this.tamanho; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = (T) elemento;
		this.tamanho++;
		return true;
	}
	
	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T [] elementosNovos = (T[]) new Object [this.elementos.length*2];
			for(int i=0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = (T[]) elementosNovos;
		}
	}
	
	
	
	
	public Object busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		return this.elementos[posicao];
	}
	public int busca(T elemento) {
		for (int i=0; i<this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	// Para buscar elemento no vetor semelhante ao arraylist usando boolean
	public boolean contem (T elemento) {
		/*
		 int pos = busca(elemento);
		 if (pos > -1){
		 	return true;
		 }
		 return false;
		 */
		return busca (elemento) > -1; //>= 0
		
	}
	
	
	
	
	
	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		for (int i=posicao; i<this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
		
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
