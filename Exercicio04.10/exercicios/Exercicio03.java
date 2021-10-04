package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio03 {
	
	/* Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
	 * categoria ela se encontra: 10-14 infantil * 15-17 juvenil * 18-25 adulto (Exercicio 3) */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Informe sua idade: ");
		idade = scan.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Voce é da categoria Infantil");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Voce é da categoria Juvenil");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.println("Voce é da categoria Adulto");
		}
		else {
			System.out.println("Idade nao permitida dentre as categorias");
		}
		
		scan.close();

	}

}
