package estudos;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		float A = s.nextFloat();
		System.out.println("Digite o segundo valor: ");
		float B = s.nextFloat();
		System.out.println("Digite o terceiro valor: ");
		float C = s.nextFloat();
		System.out.println("Digite o quarto valor: ");
		float D = s.nextFloat();
		
		//A MAIOR
		if((A > B) && (A > C) && (A > D)){
			System.out.println("O maior valor é: " + A);
				if((B < C) && (B < D)){
					System.out.println("O menor valor é: " + B);
				}else if((C < B) && (C < D)) {
					System.out.println("O menor valor é: " + C);
				}else if((D < C) && (D < B)){
					System.out.println("O menor valor é: " + D);
				}else{
					System.out.println("O menor valor é: " + D);
				}
		}
		//B MAIOR
		else if((B > A) && (B > C) && (B > D)) {
			System.out.println("O maior valor é: " + B);
				if((A < C) && (A < D)){
					System.out.println("O menor valor é: " + A);
				}else if((C < A) && (C < D)) {
					System.out.println("O menor valor é: " + C);
				}else if((D < A) && (D < C)){
					System.out.println("O menor valor é: " + D);
				}else{
					System.out.println("O menor valor é: " + D);
				}
		}
		//C MAIOR
		else if((C > A) && (C > B) && (C > D)) {
			System.out.println("O maior valor é: " + C);
				if((A < B) && (A < D)){
					System.out.println("O menor valor é: " + A);
				}else if((B < A) && (B < D)) {
					System.out.println("O menor valor é: " + B);
				}else if((D < A) && (D < B)){
					System.out.println("O menor valor é: " + D);
				}else {
					System.out.println("O menor valor é: " + D);
				}
		}
	    //D MAIOR
		else if((D > A) && (D > B) && (D > C)) {
			System.out.println("O maior valor é: " + D);
				if((A < B) && (A < C)){
					System.out.println("O menor valor é: " + A);
				}else if((B < A) && (B < C)) {
					System.out.println("O menor valor é: " + B);
				}else if((D < A) && (D < B)){
					System.out.println("O menor valor é: " + C);
				}else {
					System.out.println("O menor valor é: " + C);
				}
		}
	  }	
	}