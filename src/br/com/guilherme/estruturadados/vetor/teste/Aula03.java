package br.com.guilherme.estruturadados.vetor.teste;
import java.util.ArrayList;
import br.com.guilherme.estruturadados.vetor.Lista;
import br.com.guilherme.estruturadados.vetor.Vetor;
public class Aula03 {
	public static void main(String[] args) {
		/*USO DO ARRAYLIST
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("C");
		System.out.println(arrayList);
		arrayList.add(1, "B");
		System.out.println(arrayList);
		
		boolean existe = arrayList.contains("A");
		if(existe) {
			System.out.println("Elemento existe no array");
		} else {
			System.out.println("Elemento não existe no array");
		}
		
		int pos = arrayList.indexOf("B");
		if (pos > - 1 ) {
			System.out.println("Elemento existe no array na pos" + pos);
		} else {
			System.out.println("Elemento não existe no array" + pos);
		}*/	
		//Exercício de busca de elementos 
		/*Lista<String> lista = new Lista<String>(5);
		lista.adiciona ("A");
		lista.adiciona ("B");
		lista.adiciona ("C");
		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("B"));
		System.out.println(lista.contem("D"));*/
		int [] arr = {1,2,3};
		int sum = 0;
		for (int i = 0 ; i<arr.length; i++) {
		sum += arr[i];
		}
		System.out.println(sum);
	}

}
