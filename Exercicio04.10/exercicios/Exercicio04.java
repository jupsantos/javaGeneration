package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	/* Faça um programa em que permita a entrada de um número qualquer e exiba se este número 
	 * é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for 
	 * ímpar exiba o número elevado ao quadrado. (Exercicio 4) */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int num;
		double raiz, quadrado;
		
		System.out.println("Informe um número: ");
		num = scan.nextInt();
		
		if(num % 2 == 0) {
			
			quadrado = Math.sqrt(num);
			System.out.println("O numero é Par. Sua raiz quadrada é: " + quadrado);
		}
		else {
			raiz = Math.pow(num, 2);
			System.out.println("O numero é Ímpar. Sua raiz quadrada é: " + raiz);
		}
		
		scan.close();
		
	}

}
