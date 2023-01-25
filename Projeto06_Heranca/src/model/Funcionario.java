package model;

public class Funcionario extends Pessoa {
	private String setor;
	private boolean trabalhando;
	
	// MÉTODOS
	public void mudarTrabalho() {
		this.trabalhando = ! this.trabalhando; // inverte o booleano!
	}
	
	
	// MÉTODOS ESPECIAIS
	public final String getSetor() {
		return setor;
	}

	public final void setSetor(String setor) {
		this.setor = setor;
	}

	public final boolean isTrabalhando() {
		return trabalhando;
	}

	public final void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}	
}
