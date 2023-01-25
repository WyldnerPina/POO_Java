package model;

public class Pessoa {
	// ======================================== ATRIBUTOS
	private String nome;
	private int idade;
	private String sexo;
	
	// ======================================== MÉTODOS 
	public void fazerAniver() {
		this.setIdade(this.getIdade() + 1);
	}

	// ======================================== MÉTODOS ESPECIAIS
	// ---------------------------------------- Construtor		
	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	// ---------------------------------------- get e setters
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
}
