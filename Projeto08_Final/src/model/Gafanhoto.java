package model;

public class Gafanhoto extends Pessoa {
	private String login;
	private int totalAssistindo;
	
	// MÉTODOS
	public void viuMaisUm() {
		this.setTotalAssistindo(getTotalAssistindo()+1);
//		this.totalAssistindo++;
	}
	
	// MÉT CONSTRUTOR
	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);// Faz referencia à classe super, e tem q passar nome idade e sexo.
		this.login = login;
		this.totalAssistindo = 0;		
	}
	
	// MÉTODOS GET SET
	public final String getLogin() {
		return login;
	}

	public final void setLogin(String login) {
		this.login = login;
	}

	public final int getTotalAssistindo() {
		return totalAssistindo;
	}

	public final void setTotalAssistindo(int totalAssistindo) {
		this.totalAssistindo = totalAssistindo;
	}

	
	@Override
	public String toString() {// super.toString tá chamando o de Pessoa e após o daqui
		return super.toString() + "\n   Gafanhoto [login=" + login + ", totalAssistindo=" + totalAssistindo + "]";
	}	
}
