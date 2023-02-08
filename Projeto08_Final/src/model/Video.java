package model;

public class Video implements AcoesVideo {
	private String titulo;
	private int avaliacao;
	private int view;
	private int curtidas;
    private boolean reproduzindo;
    
	// MÉTODOS INTERFACE
	@Override
	public void play() {
		this.reproduzindo = true;
	}

	@Override
	public void pause() {
		this.reproduzindo = false;
	}

	@Override
	public void like() {
		this.curtidas++;
	}
	
	// MÉT CONSTRUTOR
	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 0;
		this.view = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	} 	

	// MÉTODOS GET SET
	public final String getTitulo() {
		return titulo;
	}	

	public final void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public final int getAvaliacao() {
		return avaliacao;
	}

	public final void setAvaliacao(int avaliacao) {//============================ aqui ao inserir um novo valor é feito a média deste
		int novaAvaliacao;
		
		novaAvaliacao = (int) (this.getAvaliacao() + avaliacao) / this.getView();// isso não está funcionando
		
		this.avaliacao = novaAvaliacao;
	}

	public final int getView() {
		return view;
	}

	public final void setView(int view) {
		this.view = view;
	}

	public final int getCurtidas() {
		return curtidas;
	}

	public final void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public final boolean isReproduzindo() {
		return reproduzindo;
	}

	public final void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", view=" + view + ", curtidas=" + curtidas
				+ ", reproduzindo=" + reproduzindo + "]";
	}	
}
