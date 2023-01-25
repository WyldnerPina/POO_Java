package model;

public class CanetaCompleta {
	public String modelo;
	public String cor;
	private float ponta;
	private boolean tampada;

	// ---------------------------- CONSTRUTOR
	public CanetaCompleta() {
		this.tampar();
		this.cor = "azul";
	}

	// ----------------------- MÉTODOS PARA CONSTRUTOR
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}


	// ----------------------- GET E SET MODELO
	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	// ------------------------ GET E SET PONTA
	public float getPonta() {
		return this.ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	// status é só pra printar... serve como o toString
	public void status() {
		System.out.println("Sobre objeto: ");
		System.out.println("Modelo " + this.modelo);// vc pode só pegar o valor q está no objeto ... ou acessar o mét
													// para ter o retorno
		System.out.println("Ponta " + this.getPonta());// aqui acesso o mét
		System.out.println("Cor " + this.cor);
		System.out.println("Tampada " + this.tampada);
	}
}
