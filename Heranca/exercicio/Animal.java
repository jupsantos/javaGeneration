package br.com.generation.exercicio;

public class Animal {
	
	private  String nome;
	private int idade;
	
	void emitirSom() {
		System.out.println("Animal emitindo som");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
