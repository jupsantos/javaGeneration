package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	/* Faça um programa que entre com três números e coloque em ordem crescente. (Exercicio 2) */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Digite 3 números: ");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		n3 = scan.nextInt();
		
		
		if(n1 <= n2 && n2 <= n3) {
			
			System.out.println("A ordem crescente: " + n1 + " " + n2 + " " + n3);
			
		}
		else if(n1 <= n3 && n3 <= n2) {
			
			System.out.println("A ordem crescente: " + n1 + " " + n3 + " " + n2);
		}
		else if(n2 <= n1 && n1 <= n3) {
					
			System.out.println("A ordem crescente: " + n2 + " " + n1 + " " + n3);
		}
		else if(n2 <= n3 && n3 <= n1) {
			
			System.out.println("A ordem crescente: " + n2 + " " + n3 + " " + n1);
		}
		else if(n3 <= n1 && n1 <= n2) {
			
			System.out.println("A ordem crescente: " + n3 + " " + n1 + " " + n2);
		}
		else /*if(n3 <= n2 && n2 <= n1)*/ {
			
			System.out.println("A ordem crescente: " + n3 + " " + n2 + " " + n1);
		}
		
		scan.close();
	}

}
