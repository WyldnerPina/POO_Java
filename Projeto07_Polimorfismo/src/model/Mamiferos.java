package model;

public class Mamiferos extends Animal {
	// ATRIBUTOS
	private String corPelo;
	
	// MÉTODOS DE ANIMAL
	@Override
	public void locomover() {
		System.out.println("Correndo");
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de mamífero");
	}

	// MÉTODOS GET SET
	public final String getCorPelo() {
		return corPelo;
	}

	public final void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}	
}
