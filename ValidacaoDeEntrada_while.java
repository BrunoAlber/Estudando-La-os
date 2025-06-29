package EstruturaDeRepetição2;

import java.util.Scanner;

public class ValidacaoDeEntrada_while {
	
	/**
	 * 
	 * 
	 * 
	 * Solução 
	 * 1º Lógica: Usamos o Scanner para Entrada de Dados(Digitar o Número);
	 * 2º Foi usado o Laço while para Receber o Número Digitado
	 * 3º Aplicamos uma condição Lógica no Parênteses do while para verificar se o Número
	 * é Inválido e pede para digitar um Nùmero Válido. 
	 * 
	 *  O laço while garante que,enquanto o número fornecido pelo usuário estiver
        fora do intervalo de 1 a 10,oprograma continuará solicitando um novo número.O laço só
        termina quando um número válido é fornecido.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Este Programa faz teste de Validação de Entrada ");
		System.out.println("\nDigite um Número entre 1 e 10");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		
		
		while (numero < 1 || numero > 10) {
			
			System.out.println("Número Inválido. Tente Novamente!");
			System.out.print("Número: ");
			numero = sc.nextInt();
		}
		
		System.out.println("O Número "+numero+ " Válido");
	}

}
