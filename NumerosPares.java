package EstruturaDeRepetição2;



public class NumerosPares {

	public static void main(String[] args) {

	
		System.out.println("Números Pares");
		
		int ContagemPares = 0;
		for (int i = 2; i <= 20; i+=2) {
			
			System.out.print(i+" ");
			if (i % 2 == 0) {
				
				ContagemPares++;
			}
		}  
		System.out.println("\nQuantidade de Números Pares São: "+ContagemPares);
		
		
		
		System.out.println("");
		System.out.println("\nNúmeros Ímpares ");
		
		int ContagemImpa = 0;
		for (int contador = 3; contador <= 20; contador+= 2) {
			
			System.out.print(contador+" ");	
			if (contador % 2 != 0) {
				
				ContagemImpa++;
			}
			
		}System.out.println("\nQuantidade de Números Ímpa são: "+ContagemImpa);
		
	}

}
