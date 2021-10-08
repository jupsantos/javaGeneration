package br.com.generation.exercicio06;

public class TestaConta {

	// 6) Crie uma classe conta bancaria e apresente...
	
	public static void main(String[] args) {
		
		ContaBancaria contb = new ContaBancaria();
		
		contb.setCliNome("Abner Alves");
		contb.setCliIdade(21);
		contb.setCliDoc("21.231.123-4");
		contb.setGerente("Genivaldo Marques");
		contb.setOperacao(13);
		contb.setAgencia(334);
		contb.setConta(54325);
		contb.setDv(0);
		
		System.out.println("\tInformações da conta: ");
		System.out.println("Nome do cliente: " + contb.getCliNome());
		System.out.println("Idade: " + contb.getCliIdade());
		System.out.println("Documento: " + contb.getCliDoc());
		System.out.println("Gerente da conta: " + contb.getGerente());
		System.out.println("Operação: " + contb.getOperacao());
		System.out.println("Agencia: " + contb.getAgencia());
		System.out.println("Conta sem o dígito: " + contb.getConta());
		System.out.println("Dígito: " + contb.getDv());

	}

}
