package model;

public class Reptil extends Animal {
	// ATRIBUTOS
	private String corEscama;
	
	// MÉTODOS ANIMAL
	@Override
	public void locomover() {
		System.out.println("Rastejando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo vegetais");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de réptil");
	}

	// MÉTODOS GET SET
	public final String getCorEscama() {
		return corEscama;
	}

	public final void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	

}
