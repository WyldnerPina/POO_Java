package model;

public class Visualizacao {
	private Gafanhoto espectador;
	private Video filme;

	// CONSTRUTOR
	public Visualizacao(Gafanhoto espectador, Video filme) {
		this.espectador = espectador;
		this.filme = filme;
		
		this.espectador.setTotalAssistindo(this.espectador.getTotalAssistindo()+1);
		this.filme.setView(this.filme.getView()+1);
	}

	// MÉTODOS
	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}

	public void avaliar(float porc) {
		int total = 0;
		if (porc <= 20) {
			total = 3;
		} else if(porc <= 50) {
			total = 5;
		}else if(porc <= 90) {
			total = 8;
		}else {
			total = 10;
		}
		
		this.filme.setAvaliacao(total);
	}
	
	// MÉT GET SET
	public final Gafanhoto getEspectador() {
		return espectador;
	}

	public final void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}

	public final Video getFilme() {
		return filme;
	}

	public final void setFilme(Video filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "=============> Visualizacao :"
				+ "\n  espectador=" + espectador + ", "
						+ "\n   filme=" + filme + "]";
	}	
}
