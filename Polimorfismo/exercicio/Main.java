package br.com.generetion.exercicio;

public class Main {

	public static void main(String[] args) {
		
		TestaAnimais t = new TestaAnimais();
		
		
		t.emitirSomAnimal(new Cachorro());
		t.fazerLocomover(new Cachorro());
		
		t.emitirSomAnimal(new Cavalo());
		t.fazerLocomover(new Cavalo());
		
		t.emitirSomAnimal(new Preguica());
		t.fazerLocomover(new Preguica());
	}

}
