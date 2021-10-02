package br.com.generation.exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05 {
	
	/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
	 * aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, 
	 * respectivamente. (Exercicio 5)*/
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);
		
		
		//Declaracao de variaveis
		int entrada, cont, peso;
		Double nota, media = 0.0;
		
		System.out.println("Informe quantas notas deseja inserir: ");
		entrada = scan.nextInt();
		
		for(cont = 1; cont <= entrada; cont++) {
			System.out.println("Insira a " + cont + "a nota do aluno: ");
			nota = scan.nextDouble();
			
			System.out.println("Insira o peso da " + cont + " prova: ");
			peso = scan.nextInt();
			
			media += (nota*peso);
		}
		
		media /= entrada;
		
		System.out.println("A media das " + entrada + " provas é: " + df.format(media));
		
		scan.close();
	}

}
