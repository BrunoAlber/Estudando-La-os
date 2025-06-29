package EstruturaDeRepetição2;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um Número Positivo: ");
		int numero = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(numero +"*"+i+"= "+(numero*i));
		}
	}

}
