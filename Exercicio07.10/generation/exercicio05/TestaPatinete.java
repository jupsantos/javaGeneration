package br.com.generation.exercicio05;

public class TestaPatinete {
	
	// 5) Crie uma classe patinete e apresente...
	public static void main(String[] args) {
		
		Patinete pat = new Patinete();
		
		pat.setMarca("Nike");
		pat.setModelo("Joien Professional");
		pat.setAno(2022);
		pat.setCor("Rosa");
		pat.setTipo("Profissional");
		
		System.out.println("\tInformações do funcionario: ");
		System.out.println("Marca: " + pat.getMarca());
		System.out.println("Modelo: " + pat.getModelo());
		System.out.println("Ano: " + pat.getAno());
		System.out.println("Tipo: " + pat.getTipo());
		System.out.println("Cor: " + pat.getCor());
		
	}

}
