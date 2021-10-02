package br.com.generation.exercicio;

import java.util.Scanner;

public class Exercicio7 {
	
	//Um sistema de equações lineares do tipo: (Exercicio 7)
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Declaracao de variaveis
		int a = 0, b = 0 , c = 0, d = 0 , e = 0, f = 0, cont;
		int x = 0 , y = 0;
		
		
		for(cont = 0; cont < 6; cont++) {
			
			System.out.println("Insira o " + (cont + 1) + " coeficiente: ");
			
			if(cont == 0) {
				a = scan.nextInt();
			}
			else if(cont == 1) {
				b = scan.nextInt();
			}
			else if(cont == 2) {
				c = scan.nextInt();
			}
			else if(cont == 3) {
				d = scan.nextInt();
			}
			else if(cont == 4) {
				e = scan.nextInt();
			}
			else {
				f = scan.nextInt();
			}
			
		}
		
		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		
		y = ((a * f) - (c * d)) / ((a * e) - (b *d));
		
		System.out.println("O valor de x é igual a: " + x);
		System.out.println("\nO valor de y é igual a: " + y);
		
		scan.close();

	}

}
