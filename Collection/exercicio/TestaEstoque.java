package br.com.generation.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaEstoque {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		List<Estoque> estoque = new ArrayList<>();
		
		
		System.out.println("Informe quantos produtos quer inserir no estoque: ");
		int quantidade = sc.nextInt();
		
		for(int i = 0; i < quantidade; i++) {
			
			System.out.print("Informe o produto: ");
			String produto = sc.next();
			
			System.out.println("Informe a quantidade do produto: ");
			int qntd = sc.nextInt();
			
			estoque.add(new Estoque(produto, qntd));
		}
		
		estoque.remove(0);
		
		estoque.add(new Estoque("Iphone 13", 3));
		
		for(Estoque i : estoque) { 
			System.out.println(i);
		}
		
		
		sc.close();
	}

}
