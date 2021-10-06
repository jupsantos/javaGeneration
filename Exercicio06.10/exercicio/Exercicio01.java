package br.com.generation.exercicio;

import java.util.Scanner;

public class Exercicio01 {

	/* Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma 
	 * atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. (Exericio 1)*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] pontucao = new double[5];
		double maior = 0;
		
		for(int i = 0; i < pontucao.length; i++) {
			
			System.out.println("Entre com a " + (i + 1) + " pontuação da atividade: ");
			pontucao[i] = scan.nextDouble();
			
			if(maior < pontucao[i]) {
				
				maior = pontucao[i];
			}
			
		}
		
		System.out.println();
		
		for(int i = 0; i < pontucao.length; i++) {
		
			System.out.println("A" + (i + 1) + " pontuação da atividade é: " + pontucao[i]);

		}
		
		System.out.println("\nA maior pontuação da atividade foi: " + maior);
		
		scan.close();

	}

}
