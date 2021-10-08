package br.com.generation.exercicio07;

public class TestaPaciente {

	// 7) Crie uma classe paciente e apresente... 
	
	public static void main(String[] args) {
		
		Paciente pac = new Paciente();
		
		pac.setNome("Durval Alemao");
		pac.setIdade(35);
		pac.setRg("21.342.214-1");
		pac.setAlergias("Paracetamol");
		pac.setQueixas("Dor abdominal");
		
		System.out.println("\tInformações do paciente: ");
		System.out.println("Nome: " + pac.getNome());
		System.out.println("Idade: " + pac.getIdade());
		System.out.println("Documento: " + pac.getRg());
		System.out.println("Alergias: " + pac.getAlergias());
		System.out.println("Queixas: " + pac.getQueixas());
		
	}

}
