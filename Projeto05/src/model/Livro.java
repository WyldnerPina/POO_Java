package model;

public class Livro implements Publicacao{
	private String título;
	private String autor;
	private int totalPags;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	// MÉTODOS	
	// é o toString q renomeou de detalhes
	public String detalhes() {
		return "Livro [título=" + título + ", autor=" + autor + ", totalPags=" + totalPags + ", pagAtual=" + pagAtual
				+ ", aberto=" + aberto + ",\n leitor=" + leitor + "] aqui apareceu uma referencia, pra aparecer nomal usar get nome =\n"
				+ leitor.getNome();
	}

	// MÉTODOS DA INTERFACE
	public void abrir() {
		this.aberto = true;		
	}
	
	public void fechar() {
		this.aberto = false;		
	}
	
	public void folhear(int pag) {
		if(pag > this.totalPags) {
			this.pagAtual = 0;
		}else {
			this.pagAtual = pag;		
		}		
	}
	
	public void avancarPag() {
		this.pagAtual++;		
	}
	
	public void voltarPag() {
		this.pagAtual--;		
	}
	
	// MÉTODOS ESPECIAIS
	// Construtor
	public Livro(String título, String autor, int totalPags, Pessoa leitor) {
		super();
		this.título = título;
		this.autor = autor;
		this.totalPags = totalPags;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}

	// get e setters
	public final String getTítulo() {
		return título;
	}

	public final void setTítulo(String título) {
		this.título = título;
	}

	public final String getAutor() {
		return autor;
	}

	public final void setAutor(String autor) {
		this.autor = autor;
	}

	public final int getTotalPags() {
		return totalPags;
	}

	public final void setTotalPags(int totalPags) {
		this.totalPags = totalPags;
	}

	public final int getPagAtual() {
		return pagAtual;
	}

	public final void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public final boolean isAberto() {
		return aberto;
	}

	public final void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public final Pessoa getLeitor() {
		return leitor;
	}

	public final void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}	
}
