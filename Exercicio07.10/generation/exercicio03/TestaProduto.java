package br.com.generation.exercicio03;

public class TestaProduto {
	
	//3) Crie uma classe produto eletrônico e apresente... 
	
	public static void main(String[] args) {
		
		ProdutoEletronico prod = new ProdutoEletronico();
		ProdutoEletronico prod2 = new ProdutoEletronico();
		
		prod.setMarca("Apple");
		prod.setModelo("Iphone 13");
		prod.setCor("Azul");
		prod.setAno(2021);
		prod.setNserial("21934f0");
		
		System.out.println("\tInformações do produto: ");
		System.out.println("Marca do produto: " + prod.getMarca());
		System.out.println("Modelo do produto: " + prod.getModelo());
		System.out.println("Cor do produto: " + prod.getCor());
		System.out.println("Ano do produto: " + prod.getAno());
		System.out.println("N serial do produto: " + prod.getNserial());
		
		prod2.setMarca("Samsung");
		prod2.setModelo("Máquina Lava e Seca 11kg WD11M4453J 3 em 1");
		prod2.setCor("Inox");
		prod2.setAno(2021);
		prod2.setNserial("21934f0df");

		System.out.println("\n\n\tInformações do produto: ");
		System.out.println("Marca do produto: " + prod2.getMarca());
		System.out.println("Modelo do produto: " + prod2.getModelo());
		System.out.println("Cor do produto: " + prod2.getCor());
		System.out.println("Ano do produto: " + prod2.getAno());
		System.out.println("N serial do produto: " + prod2.getNserial());
	}

}
