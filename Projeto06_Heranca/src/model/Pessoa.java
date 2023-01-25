package model;

public abstract class Pessoa {
	protected String nome;
	private int idade;
	private String sexo;
	
	// MÉTODOS
	public void fazerAniversario() {
		this.idade++;
	}

	
	// MÉTODOS ESPECIAIS
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

	// TO STRING
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}	
}
