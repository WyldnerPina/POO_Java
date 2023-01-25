package model;

public class Caneta {
	public String modelo;
	public String cor;
	public float ponta;
	public int carga;
	public boolean isTampada;

	public void status() {
		System.out.println("Caneta " + this.cor);//this é autoreferencia quem chamou o mét, referencia ao próprio objeto q chamou 
		System.out.println("está tampada? " + this.isTampada);
	}
	
	public void rabiscar() {
		if(this.isTampada) {
			System.err.println("Não posso rabiscar");			
		}else {
			System.out.println("Rabiscando");
		}
	}

	public void tampar() {
		this.isTampada = true;
	}

	public void destampar() {
		this.isTampada = false;
	}
}
