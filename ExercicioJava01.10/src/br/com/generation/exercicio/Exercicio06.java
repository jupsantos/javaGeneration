package br.com.generation.exercicio;

import java.util.Scanner;

public class Exercicio06 {
	
	/* Construa um programa em c que, tendo como dados de entrada dois pontos
	 * quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. 
	 * A fórmula que efetua tal cálculo é: (Exercicio 6)*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Declaracao de variaveis
		int x1, x2, y1, y2;
		Double d;
		
		System.out.println("Informe o valor de x1: ");
		x1 = scan.nextInt();
		
		System.out.println("Informe o valor de x2: ");
		x2 = scan.nextInt();
		
		
		System.out.println("Informe o valor de y1: ");
		y1 = scan.nextInt();
		
		System.out.println("Informe o valor de y2: ");
		y2 = scan.nextInt();
		
		d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.println("A distancia entre os pontos é igual a: " + d);
		
		scan.close();
	}

}
