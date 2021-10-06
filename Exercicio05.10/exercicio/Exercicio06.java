package br.com.generation.exercicio;

import java.util.Scanner;

public class Exercicio06 {
	
	/* Escrever um programa que receba vários números inteiros no teclado. E no final imprimir
	 * a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE) (Exercicio 6)*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num, cont = 0;
		double  media = 0.0;
			
		
		do {

			System.out.println("Informe um numero ou digite 0 para sair: ");
			num = scan.nextInt();
			
			if(num % 3 == 0 && num != 0) {
				media += num;
				cont++;
			}
			
			
		} while(num != 0);
		
		media /= cont;
		
		System.out.println("Voce informou " + cont + " multiplos de 3");
		System.out.println("A média dos multiplos de 3 digitados é: " + media);
		
		scan.close();
		
	}

}
