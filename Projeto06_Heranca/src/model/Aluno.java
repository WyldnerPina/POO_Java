package model;

public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	
	// MÉTODOS
	public final void cancelarMatr() {// não pode ser sobreposto pq é final
		System.out.println("Matricula Cancelada");
	}
	
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade de aluno " + this.nome);
		// this.nome só funciona pq em pessoa nome é protegido, o q dá acesso ao nome
		// se estivesse como privado, somente this.getNome() funcionaria.
	}
	
	
	// MÉTODOS ESPECIAIS 
	public final int getMatricula() {
		return matricula;
	}


	public final void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public final String getCurso() {
		return curso;
	}


	public final void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
