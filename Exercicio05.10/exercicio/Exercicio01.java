package br.com.generation.exercicio;

public class Exercicio01 {

	/* --> Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR) (Exercicio 1) */
	
	public static void main(String[] args) {
		
		for(int i = 1000; i <= 1999; i++) {
			
			if(i % 11 == 5) {
				System.out.println("Valores de i divisiveis por 11: " + i);
				
			}
		
		}
	}

}
