package br.com.generation.exercicio;

import java.util.Scanner;

public class Exercicio05 {
	
	/* Crie um programa que leia um número do teclado até que encontre um número 
	 * igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE) (Exercicio 5)*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		int soma = 0, num = 0;
		
		do {
			System.out.println("Informe um numero ou digite 0 para sair: ");
			num = scan.nextInt();
			
			soma += num;
			
		} while(num != 0);
		
		System.out.println("A soma dos numeros é: " + soma);
		
		scan.close();
	}

}
