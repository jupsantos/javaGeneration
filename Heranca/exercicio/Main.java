package br.com.generation.exercicio;

public class Main {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Cavalo cav = new Cavalo();
		Preguica preg = new Preguica();
		
		dog.setNome("Aninha");
		dog.setIdade(2);
		 
		System.out.println("\t Informações do cachorro: ");
		System.out.println("Nome: " + dog.getNome());
		System.out.println("Idade: " + dog.getIdade());
		dog.correr();
		dog.emitirSom();
		
		cav.setNome("Pow Pow");
		cav.setIdade(10);
		 
		System.out.println("\n\t Informações do cavalo: ");
		System.out.println("Nome: " + cav.getNome());
		System.out.println("Idade: " + cav.getIdade());
		cav.correr();
		cav.emitirSom();
		
		preg.setNome("Peg");
		preg.setIdade(5);
		 
		System.out.println("\n\t Informações da preguiça: ");
		System.out.println("Nome: " + preg.getNome());
		System.out.println("Idade: " + preg.getIdade());
		preg.subirArvore();
		preg.emitirSom();
		
	}

}
