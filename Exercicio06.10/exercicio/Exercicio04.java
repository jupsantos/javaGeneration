package br.com.generation.exercicio;

import java.util.Scanner;

public class Exercicio04 {
	
	/* Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba 
	 * a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal. (Exercicio 4)*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] array = new int[3][3];
		int somad = 0, soma = 0;
		
		for(int l = 0; l < array.length; l++) {
			
			for(int c = 0; c < array.length; c++) {
				
				System.out.printf("Entre com o valor da matriz [%d %d]: ", l,c);
				array[l][c] = scan.nextInt();
				
			}
		}
		
		System.out.println();
		
		System.out.println("          Matriz: ");
		for(int l = 0; l < array.length; l++) {
			
			for(int c = 0; c < array.length; c++) {
				
				soma += array[l][c];
				
				if(l == c) {
					somad += array[l][c];
				}
				
				System.out.print("    " + array[l][c] + " | ");
				
			}
			System.out.println();
		}
		
		System.out.println("\nA soma dos valores da matriz é: " + soma);
		System.out.println("A soma dos valores da diagonal principal da matriz é: " + somad);
		
		scan.close();
 	}

}
