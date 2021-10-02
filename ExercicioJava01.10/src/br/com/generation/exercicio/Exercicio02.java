package br.com.generation.exercicio;

import java.util.Scanner;

	/* 2. Faça um sistema que leia a idade de uma pessoa 
	 * expressa em dias e mostre-a expressa em anos, meses e dias. (Exercicio 2)*/

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Declaracao de variaveis
		int anos, meses, dias, totalDias;
		
		System.out.println("Informe quantos anos voce ja viveu: ");
		totalDias = scan.nextInt();
	
		
		anos = totalDias/365;
		
		totalDias %= 365;
		meses = totalDias/30;
		dias = totalDias%30;
		
		System.out.println("Sua idade é: ");
		System.out.println("Anos: " + anos);
		System.out.println("Meses: " + meses);
		System.out.println("Dias: " + dias);
		
		scan.close();
		
		
	}

}
