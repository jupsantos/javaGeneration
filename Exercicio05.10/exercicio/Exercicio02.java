package br.com.generation.exercicio;

import java.util.Scanner;

public class Exercicio02 {

	// Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR) (Exercicio 2)
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int par = 0, impar = 0, num;
		
		for(int i = 0; i <= 10; i++ ) {
			
			System.out.println("Entre com um valor: ");
			num = scan.nextInt();
			
			if(num%2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		
		System.out.println("Quantos sao pares e impares: ");
		System.out.println("Par: " + par);
		System.out.println("Impar: " + impar);
		
		scan.close();
	}

}
