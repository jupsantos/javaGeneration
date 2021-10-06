package br.com.generation.exercicio;

import java.util.Scanner;

public class Exercicio03 {

	/* Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 
	 * 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando 
	 * idade for =-99. (WHILE) (Exercicio 3) */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int idade, n21 = 0, n50 = 0;
		
		System.out.println("Informe sua idade: ");
		idade = scan.nextInt();
		
		while(idade != -99) {
			
			if(idade <= 21 ) {
				n21++;
			}
			
			if (idade >= 50) {
				n50++;
			}
			System.out.println("Informe sua idade -> PARA ENCERRAR DIGITE -99: ");
			idade = scan.nextInt();
		}
		
		System.out.println("Quantidade de pessoas com até 21: " + n21);
		System.out.println("Quantidade de pessoas com mais de 50: " + n50);
		
		scan.close();
	}

}
