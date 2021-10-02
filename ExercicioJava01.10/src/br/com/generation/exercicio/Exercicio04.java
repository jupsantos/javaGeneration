package br.com.generation.exercicio;

import java.util.Scanner;

public class Exercicio04 {

	/* Escreva um sistema que leia três números inteiros e positivos 
	 * (A, B, C) e calcule a seguinte expressão: (Exercicio 4)*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Declaracao de variaveis
		int a, b, c;
		double d;
		
		System.out.println("Informe o 1o numero: ");
		a = scan.nextInt();
		
		System.out.println("Informe o 2o numero: ");
		b = scan.nextInt();
		
		System.out.println("Informe o 3o numero: ");
		c = scan.nextInt();
		
		if(a < 0 || b < 0 || c < 0 ) {
			System.out.println("Valor inválido! O numero precisa ser inteiro e positivo.");
		}
		else {
			d = (Math.pow((a + b), 2) + Math.pow((b + c), 2))/2;
			
			System.out.println("O resultado da expressao é: " + d);
		}
		
		scan.close();
	}
	
}	
