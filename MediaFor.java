package switchestudo;

import java.util.Scanner;

public class MediaFor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Quantas notas você quer calcular?: ");
		int quantNota = s.nextInt();
		
		float media;
		float nota;
		float soma = 0;
		
		for(int i=0; i<quantNota;i++) {
			System.out.println("Insira a nota: ");
			nota = s.nextFloat();
			soma += nota;
		}
		media = soma/quantNota;
		System.out.println("A Média final das notas é: " + media);

	}

}
