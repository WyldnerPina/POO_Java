package model;

public class Ave extends Animal {
	// ATRIBUTOS
	private String corPena;
	
	// MÉTODOS
	public void fazerNinho() {
		System.out.println("construiu um ninho");
	}

	// MÉTODOS ANIMAL
	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		
	}
	
	
	// MÉTODOS GET SET
	public final String getCorPena() {
		return corPena;
	}

	public final void setCorPena(String corPena) {
		this.corPena = corPena;
	}
		
}
