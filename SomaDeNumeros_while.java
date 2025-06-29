package EstruturaDeRepetição2;

import java.util.Scanner;

public class SomaDeNumeros_while {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int somaAcumulada = 0;
		int numeroDigitado;
		
		System.out.println("Digite Números para Soma e 0 para Para");
		System.out.print("Número: ");
		numeroDigitado = sc.nextInt();
		
		while(numeroDigitado != 0) {
			
			somaAcumulada += numeroDigitado;
			System.out.print("Digite outro Número");
			System.out.print("\nNúmero: ");
			numeroDigitado = sc.nextInt();
		}
		
		System.out.println("Valor Acumulado: "+somaAcumulada);
	}

}
