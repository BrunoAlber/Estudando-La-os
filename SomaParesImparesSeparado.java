package EstruturaDeRepetição2;

public class SomaParesImparesSeparado {
	
	/**
	 * 
	 * 
	 *  Enunciado: Escreva um programa que some todos os números pares de 1 a 100 e,
        separadamente, todos os números ímpares de 1 a 100.
	 * 
	 *       Explicação:Neste programa,os númerosde 1 a 100 são verificados.Se o número for par,
             ele é adicionado à somaPares.Caso contrário,ele é adicionado à somaImpares.Assomas
             finais sãoe xibidas no console.
	 * 
	 * 
	 * 
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
	

		int SomaPar = 0;
		int SomaImpa = 0;
	
		
		System.out.println("Este Programa Soma Números Pares e Ímpares Separadamente\n");
		for (int i = 1; i <= 100; i++) {
			
			if (i % 2 == 0) {
				
				SomaPar += i;
				
			}else {
				
				SomaImpa += i;
			} 
			
		}

		System.out.println("Soma de Números Pares: "+SomaPar);
		System.out.println("Soma de Números Ímpares: "+SomaImpa);
		
	
		
		
      
		
	}

}
