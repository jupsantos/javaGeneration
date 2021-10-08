package br.com.generation.exercicio02;

public class TestaAviao {
	
	// 2) Crie uma classe avião e apresente...
	public static void main(String[] args) {
		
		Aviao aviao = new Aviao();
		
		aviao.setMarca("Airbus");
		aviao.setModelo("A310");
		aviao.setCor("Branco");
		aviao.setCapacidade(187);
		aviao.setAno(2007);

		System.out.println("\t Informações do avião: ");
		System.out.println("\nMarca: " + aviao.getMarca());
		System.out.println("Modelo: " + aviao.getModelo());
		System.out.println("Cor: " + aviao.getCor());
		System.out.println("Capacidade: " + aviao.getCapacidade());
		System.out.println("Ano: " + aviao.getAno());
		
	}

}
