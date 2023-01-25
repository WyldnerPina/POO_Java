package model;

public class Professor extends Pessoa {
	private String especialidade;
	private float salario;
	
	// MÉTODOS
	public void receberAumento(float aum) {
		this.salario += aum;
	}
	
	// MÉTODOS ESPECIAIS
	public final String getEspecialidade() {
		return especialidade;
	}

	public final void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public final float getSalario() {
		return salario;
	}

	public final void setSalario(float salario) {
		this.salario = salario;
	}	
}
