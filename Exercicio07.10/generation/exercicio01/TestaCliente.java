package br.com.generation.exercicio01;

public class TestaCliente {
		
	/* Crie uma classe cliente e apresente os atributos e métodos referentes 
	 * esta classe, em seguida crie um objeto cliente, defina as instancias deste 
	 * objeto e apresente as informações deste objeto no console. (Exercicio 1)*/

	public static void main(String[] args) {
		
		Cliente cli = new Cliente();
		
		cli.setNome("Rafaela Almeida");
		cli.setIdade(21);
		cli.setRg("30.203.234-x");
		cli.setEndereco("Av Del Almeida Fernandes, 40");
		
		System.out.println("\t Informações do cliente: ");
		System.out.println("\nNome: " + cli.getNome());
		System.out.println("Idade: " + cli.getIdade());
		System.out.println("Documento: " + cli.getRg());
		System.out.println("Endereço: " + cli.getEndereco());
		

	}

}
