package br.com.generation.exercicio;

import java.util.Scanner;

public class Exercicio04 {

	/* Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos
	 * indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado:
	 * idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções (1, se a pessoa era calma; 
	 * 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que 
	 * permita ler os dados de 150 pessoas, calcule e mostre: (WHILE) (Exercicio 4)*/
	
	public static void main(String[] args) {
		/* o número de pessoas calmas; o número de mulheres nervosas; o número de homens agressivos; o número de outros calmos; 
		 * o número de pessoas nervosas com mais de 40 anos; o número de pessoas calmas com menos de 18 anos.*/
		
		Scanner scan = new Scanner(System.in);
		
		int idade, i = 0, calma = 0, fnervosa = 0, ocalma = 0 ,nervosa40 = 0, magressiva = 0, calma18 = 0;
		char sexo, opcao;
		
		
		
		
		while(i != 5) {
			
			System.out.println("Informe sua idade: ");
			idade = scan.nextInt();
			
			System.out.println("Informe seu sexo com F para Feminino e M para Masculino e O para Outro: ");
			sexo = scan.next().charAt(0);
			
			System.out.println("Escolha sua caracteristica com as opcoes abaixo: ");
			System.out.println("1 - Calma");
			System.out.println("2 - Nervosa");
			System.out.println("3 - Agressiva");
			opcao = scan.next().charAt(0);
			
			switch(opcao) {
			 	case '1': 
			 		calma++;
			 		
			 		if(sexo == 'O') {
			 			ocalma++;
			 		}
			 		if(idade < 18) {
			 			calma18++;
			 		}
			 		
			 	break;	
			 	case '2': 
			 		if(sexo == 'F') {
			 			fnervosa++;
			 		}
			 		if(idade > 40) {
			 			nervosa40++;
			 		}
			 	break;
			 	case '3': 
			 		if(sexo == 'M') {
			 			magressiva++;
			 		}
			 	break;
			}
			i++;
		}
		
		System.out.println("Número de pessoas calmas: " + calma);
		System.out.println("Número de mulheres nervosas: " + fnervosa);
		System.out.println("Número de homens agressivos: " + magressiva);
		System.out.println("Número de outros calmos: " + ocalma);
		System.out.println("Número de pessoas nervosas com mais de 40 anos: " + nervosa40);
		System.out.println("Número de pessoas calmas com menos de 18 anos: " + calma18);
		
		scan.close();
	}

}
