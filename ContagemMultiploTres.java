package EstruturaDeRepetição2;

public class ContagemMultiploTres {

	public static void main(String[] args) {

		
		int contagem = 0;
		for (int i = 1; i <= 100; i++) {
			
			if (i % 3 == 0) {
				
				contagem++;
			} 
		}
	
		System.out.println("Quantidade de Multiplos de Três são: "+contagem);
	}

}
