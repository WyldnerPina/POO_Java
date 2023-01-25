package model;

public final class Bolsista extends Aluno{// não pode ser herdada. é final
	private float bolsa;
	
	// MÉTODOS
	public void renovarBolsa(){
		System.out.println("Renovando Bolsa de " + this.nome);
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.nome + " é bolsista! Pagamento facilitado");
	}

	// MÉTODOS ESPECIAIS
	public final float getBolsa() {
		return bolsa;
	}
	
	public final void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}	
}
