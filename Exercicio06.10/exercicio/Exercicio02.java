package br.com.generation.exercicio;

import java.util.Scanner;

public class Exercicio02 {
	
	/* Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um 
	 * vetor com os lançamentos, escreva esse vetor. A seguir determine e imprima a média aritmética 
	 * dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação. (Exercicio 2)*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] dado = new int[10];
		int ocorrencia = 0, maior = 0;
		double media = 0;
		
		for(int i = 0; i < dado.length; i++) {
			
			System.out.println("Informe o valor do dado lançado: ");
			dado[i] = scan.nextInt();
			
			while(dado[i] > 6 || dado[i] < 1) {
				
				System.out.println("Valor invalido!\n");
				System.out.println("Informe o valor do dado lançado: ");
				dado[i] = scan.nextInt();
				
			}
				
			if(maior < dado[i]) { 
				
				maior = dado[i];
				
			}
			
			media += dado[i];
		}
			
		
		for(int i = 0; i < dado.length; i++) {
			
			if(maior == dado[i]) {
				ocorrencia++;
			}
			
			System.out.println("O " + (i + 1) + " valor do dado foi: " + dado[i]);
			
		}
		
		System.out.println();
		
		System.out.println("A media das ocorrencias foi: " + (media/dado.length));
		System.out.println("O maior valor foi: " + maior);
		System.out.println("A ocorrencia do maior valor foi: " + ocorrencia);
		
		scan.close();
		
		
	}

}
