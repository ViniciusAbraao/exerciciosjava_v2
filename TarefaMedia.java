package estudos;

import java.util.Scanner;

public class TarefaMedia {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int i; 
		int quantalunos;
		float media;
		float nota;
		float soma;
		
		System.out.println("Informe a quantidade de alunos: ");
		quantalunos = s.nextInt();
		
		
		for(i = 0, media = 0, nota=0, soma=0; i<quantalunos; i++) {
			System.out.println("Informe a nota: ");
			nota = s.nextFloat();
			soma = soma+nota;
		}
		media = soma/quantalunos;
		

		System.out.println("A média final é: " + media);
			
		
	}
}
