package br.com.generation.exercicio06;

public class ContaBancaria {
	
	private String cliNome, cliDoc, gerente;
	private int cliIdade, operacao, agencia, conta, dv;
	
	
	public int getOperacao() {
		return operacao;
	}
	public void setOperacao(int operacao) {
		this.operacao = operacao;
	}
	public String getCliNome() {
		return cliNome;
	}
	public void setCliNome(String cliNome) {
		this.cliNome = cliNome;
	}
	public String getCliDoc() {
		return cliDoc;
	}
	public void setCliDoc(String cliDoc) {
		this.cliDoc = cliDoc;
	}
	public int getCliIdade() {
		return cliIdade;
	}
	public void setCliIdade(int cliIdade) {
		this.cliIdade = cliIdade;
	}
	public String getGerente() {
		return gerente;
	}
	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public int getDv() {
		return dv;
	}
	public void setDv(int dv) {
		this.dv = dv;
	}
	
}
