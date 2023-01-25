package model;

public class Peixe extends Animal {
	// ATRIBUTOS
	private String corEscama;
		
	
	// MÉTODOS DE ANIMAL
	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("comendo substâncias");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe não faz som");
	}
	
	// MÉTODOS
	public void soltarBolhas(){
		System.out.println("Soltando Bolha");
	}

	// MÉTODOS GET SET
	public final String getCorEscama() {
		return corEscama;
	}

	public final void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	

}
