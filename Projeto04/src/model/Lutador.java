package model;

public class Lutador {

	// ====================================== ATRIBUTOS
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	// ====================================== MÉTODOS PÚBLICOS
	public void apresentar() {
		System.err.println("===================================================================");
		System.out.println("NO CANTO DO CORNER temos o lutador " + this.getNome());
		System.out.println("Diretamente de " + this.getNacionalidade());
		System.out.println("Com " + this.getIdade() + " anos, " + " pesando " + this.getPeso() + "kg "
				+ "e com altura de " + this.getAltura() + "m " + " na categoria dos " + this.getCategoria());
		System.out.println("Em seu cartel temos " + this.getVitorias() + " vitórias, " + this.getEmpates() + " empates e"
				+ this.getDerrotas() + " Derrotas");
	}

	public void status() {
		System.out.println(this.getNome() + " é peso " + this.getPeso());
		System.out.println("tem: " + this.getVitorias() + " vitórias, " + this.getEmpates() + " empates e " + this.getDerrotas() +" derrotas");
	}

	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	

	// ====================================== MÉTODOS ESPECIAIS
	// Construtor
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
			int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;	
		this.setPeso(peso);// tem q passar pelo código lá pra atualizar categoria
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	
	
	//get sets
	public final String getNome() {
		return nome;
	}

	public final void setNome(String nome) {
		this.nome = nome;
	}

	public final String getNacionalidade() {
		return nacionalidade;
	}

	public final void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public final int getIdade() {
		return idade;
	}

	public final void setIdade(int idade) {
		this.idade = idade;
	}

	public final float getAltura() {
		return altura;
	}

	public final void setAltura(float altura) {
		this.altura = altura;
	}

	public final float getPeso() {
		return peso;
	}

	public final void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public final String getCategoria() {
		return categoria;
	}

	private final void setCategoria() {
		if(this.peso < 52.2) {
			categoria = "Inválido";
		}else if(this.peso <= 70.3) {
			categoria = "Leve";
		}else if(this.peso <= 83.9) {
			categoria = "Médio";
		}else if(this.peso <= 120.2) {
			categoria = "Pesado";
		}else {
			categoria = "Inválido";
		}
		
	}

	public final int getVitorias() {
		return vitorias;
	}

	public final void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public final int getDerrotas() {
		return derrotas;
	}

	public final void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public final int getEmpates() {
		return empates;
	}

	public final void setEmpates(int empates) {
		this.empates = empates;
	}
}
