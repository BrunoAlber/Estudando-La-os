package EstruturaDeRepetição2;

public class ProdutoDeNumeros {

	/**
	 * 
	 *Enunciado: Crie um programa que calcule o produto dos números inteiros de 1 a 10.
	 * 
	 * Explicação: O laço for percorre os números de 1 a 10, multiplicando cada número pelo
       valor atual de produto. O resultado final é exibido no console.
	 * @param args
	 */
	public static void main(String[] args) {
		
		int produto = 1;
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(produto+" + "+i);
			produto *= i;
		}

		System.out.println("O Produto de 1 a 10 é : "+produto);
	}

}
