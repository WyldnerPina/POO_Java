package model;

import java.util.Random;

public class Luta {
	// ATRIBUTOS
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;

	// MÉTODOS PÚBLICOS
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}

	public void lutar() {
		if (this.aprovada) {
			System.err.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.err.println("### DESAFIANTE ###");
			this.desafiante.apresentar();

			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			switch (vencedor) {
			case 0://EMPATE
				System.err.println("Empatou");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1:// DESAFIADO VENCE
				System.err.println("Venceu " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2:// DESAFIANTE VENCE
				System.err.println("Venceu " + this.desafiante.getNome());
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break;
			}

		} else {
			System.out.println("A luta não pode acontecer");
		}
	}

	// MÉTDOS ESPECIAIS
	public final Lutador getDesafiado() {
		return desafiado;
	}

	public final void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public final Lutador getDesafiante() {
		return desafiante;
	}

	public final void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public final int getRounds() {
		return rounds;
	}

	public final void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public final boolean isAprovada() {
		return aprovada;
	}

	public final void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

}
