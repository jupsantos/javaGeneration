package br.com.generation.exercicio;

public class Estoque {
	private String produto;
	private int quantidade;
	
	public Estoque(String produto, int quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String toString() {
		return "\nO produto é: " + this.produto + "\nQuantidade do produto em estoque: " + this.quantidade;
	}
}
