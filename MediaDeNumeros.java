package EstruturaDeRepetição2;


import java.util.Scanner;

public class MediaDeNumeros {
	
	/*
	 * Etapa:
	 * 1º Permitir o usuário digitar cinco números 
	 * 2º Usar o laço for para repetir cinco vezes o dígito de números
	 * 3º Criar uma Variável soma que soma todos os números digitados
	 * 4º Calcular a Média
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa Permiti ao Usuário Digita 5 Números ");
		
		int soma = 0;
		for (int i = 1; i <= 5; i++) {
			
			System.out.print("Digite um Número: ");
			int numero = sc.nextInt();
			soma +=numero;
		}
		
		double media = soma/5.0;
		
		System.out.println("Média: "+media);
	}
	

}
