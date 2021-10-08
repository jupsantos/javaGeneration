package br.com.generation.exercicio04;

public class TestaFuncionario {

	// 4) Crie uma classe funcionário e apresente...
	
	public static void main(String[] args) {
		
		Funcionario fun1 = new Funcionario();
		Funcionario fun2 = new Funcionario();
		
		fun1.setNome("Adenilson Lima");
		fun1.setIdade(45);
		fun1.setEndereco("Rua do braz, 1087");
		fun1.setRg("12.334.342-2");
		fun1.setCargo("Engenheiro de Produção");
		fun1.setSalario(7000);
		
		System.out.println("\tInformações do funcionario: ");
		System.out.println("Nome: " + fun1.getNome());
		System.out.println("Idade: " + fun1.getIdade());
		System.out.println("Enderco: " + fun1.getEndereco());
		System.out.println("Documento: " + fun1.getRg());
		System.out.println("Cargo: " + fun1.getCargo());
		System.out.println("Salario: " + fun1.getSalario());
		
		
		fun2.setNome("Rosinildo Pereira");
		fun2.setIdade(35);
		fun2.setEndereco("Av 25 de Março, 487");
		fun2.setRg("32.554.452-2");
		fun2.setCargo("Gerente de Projeto");
		fun2.setSalario(10000);
		
		System.out.println("\n\n\tInformações do funcionario: ");
		System.out.println("Nome: " + fun2.getNome());
		System.out.println("Idade: " + fun2.getIdade());
		System.out.println("Enderco: " + fun2.getEndereco());
		System.out.println("Documento: " + fun2.getRg());
		System.out.println("Cargo: " + fun2.getCargo());
		System.out.println("Salario: " + fun2.getSalario());

	}

}
