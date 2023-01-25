package model;

public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;

	// ======================================================== CONSTRUTOR
	public ControleRemoto() {
		this.setVolume(50);
		this.setLigado(false);
		this.setTocando(false);
	}

	// ======================================================== GET E SETTERS
	public final int getVolume() {
		return volume;
	}

	public final void setVolume(int volume) {
		this.volume = volume;
	}

	public final boolean isLigado() {
		return ligado;
	}

	public final void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public final boolean isTocando() {
		return tocando;
	}

	public final void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	// ======================================================== MÉTODOS
	public void ligar() {
		this.setLigado(true);
	}

	public void desligar() {
		this.setLigado(false);
	}

	public void abrirMenu() {
		System.out.println("----------- MENU ------------");
		System.out.println("está ligado? " + isLigado());
		System.out.println("está tocando? " + isTocando());
		System.out.print("volume: " + this.getVolume() + " ");
		
		for(int i = 0; i < this.getVolume(); i+=10) {
			System.err.print("♥");//alt+3
		}
	}

	public void fecharMenu() {
		System.out.println("fechando menu...");
	}

	public void maisVolume() {
		if(this.isLigado()) {
			this.setVolume(this.getVolume() + 5);//aumenta volume de 5 em 5
		}
	}

	public void menosVolume() {
		if(this.isLigado()) {
			this.setVolume(this.getVolume() - 5);//aumenta volume de 5 em 5
		}
	}

	public void ligarMudo() {
		if(this.isLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	public void desligarMudo() {
		if(this.isLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	public void play() {
		if(this.isLigado() && !this.isTocando()) {
			this.setTocando(true);
		}
	}

	public void pause() {
		if(this.isLigado() && this.isTocando()) {
			this.setTocando(false);
		}
	}

}
