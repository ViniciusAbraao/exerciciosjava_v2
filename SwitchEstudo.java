package switchestudo;

import java.util.Scanner;

public class SwitchEstudo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o número do dia: ");
		int numDia = s.nextInt();
		
		switch(numDia) {
		case 1:
			System.out.println("O dia é domingo");
		break;
		
		case 2:
			System.out.println("O dia é segunda");
		break;
		
		case 3:
			System.out.println("O dia é terça");
		break;
		
		case 4:
			System.out.println("O dia é quarta");
		break;
		
		case 5:
			System.out.println("O dia é quinta");
		break;
		
		case 6:
			System.out.println("O dia é sexta");
		break;
		
		case 7:
			System.out.println("O dia é sabado");
		break;
		
		default:
			System.out.println("Dia da semana inválido");
		break;
		
		  
		}

	}

}
