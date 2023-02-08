package model;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected String sexo;
	protected float experiencia;
	
	// MÉTODOS
	protected void ganharXp() {
		
	}
	
	// MÉT CONSTRUTOR
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.experiencia = 0;
	}
	
	
	// MÉTODOS GET SET
	public final String getNome() {
		return nome;
	}	

	public final void setNome(String nome) {
		this.nome = nome;
	}

	public final int getIdade() {
		return idade;
	}

	public final void setIdade(int idade) {
		this.idade = idade;
	}

	public final String getSexo() {
		return sexo;
	}

	public final void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public final float getExperiencia() {
		return experiencia;
	}

	public final void setExperiencia(float experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", experiencia=" + experiencia + "]";
	}
	
}
