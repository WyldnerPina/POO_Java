package model;

public abstract class Animal {
	// ATRIBUTOS 
	protected float peso;
	protected int idade;
	protected int membros;
	
	// MÉTODOS
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	
	// MÉTODOS GET SET
	public final float getPeso() {
		return peso;
	}
	public final void setPeso(float peso) {
		this.peso = peso;
	}
	public final int getIdade() {
		return idade;
	}
	public final void setIdade(int idade) {
		this.idade = idade;
	}
	public final int getMembros() {
		return membros;
	}
	public final void setMembros(int membros) {
		this.membros = membros;
	}	
}
