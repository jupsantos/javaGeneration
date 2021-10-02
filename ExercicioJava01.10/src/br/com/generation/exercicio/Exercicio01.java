package br.com.generation.exercicio;

import java.util.Scanner;

public class Exercicio01 {
	
	/* 1. Faça um sistema que leia a idade de uma pessoa expressa 
	 * em anos, meses e dias e mostre-a expressa 
	 * apenas em dias. (Exercicio 1)*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Declaracao de variaveis
		int meses, dias, anos, totalDias;

		
		System.out.println("Informe sua idade: ");
		System.out.println("Anos: ");
		anos = scan.nextInt();
		
		System.out.println("Meses: ");
		meses = scan.nextInt();
		
		System.out.println("Dias: ");
		dias = scan.nextInt();
		
		
		totalDias = (anos * 365) + (meses * 30) + dias;
		System.out.println("Sua idade em dias é: " + totalDias);
		
		scan.close();
		
	}

}
