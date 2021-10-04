package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio01 {
	
	/* Faça um programa que receba três inteiros e diga qual deles é o maior. (Exercicio 1) */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Informe tres números: ");
		
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		n3 = scan.nextInt();
		
		if(n1 >= n2 && n1 >= n3) {
			System.out.println("O maior é: " + n1);
		}
		else if(n2 >= n1 && n2 >= n3) {
			System.out.println("O maior é: " + n2);
		}
		else {
			System.out.println("O maior é: " + n3);
		}
		
		scan.close();
	}

}
