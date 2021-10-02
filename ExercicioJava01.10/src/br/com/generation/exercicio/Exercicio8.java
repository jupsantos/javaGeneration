package br.com.generation.exercicio;

import java.util.Scanner;

public class Exercicio8 {

	/* O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
	 * percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica)
	 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever
	 * um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. (Exercicio 8)*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Declaracao de variaveis
		Double custo, preco;
		
		System.out.println("Informe o preco de fábrica do carro: ");
		custo = scan.nextDouble();
		
		preco = (custo * 1.28) + (custo * 0.45);
		
		System.out.println("O custo para o consumidor final é: " + preco);
		
		scan.close();
		
		
	}

}
