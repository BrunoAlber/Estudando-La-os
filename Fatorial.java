package EstruturaDeRepetição2;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa Calcula o Fatorial de um Número dado pelo Usuário");
		System.out.print("Digite um Número: ");
		int numero = sc.nextInt();
		
		int fatorial = 1;
		for (int i = 1; i <= numero; i++) {
			
			fatorial *= i;
		}
		
		System.out.println("Fatorial de "+numero+" é "+fatorial);
	}

}
