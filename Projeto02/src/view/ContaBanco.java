package view;

public class ContaBanco {
	// ATRIBUTOS
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean isStatus;

	
	// só para poder printar // lembrando q podia fazer sysout("Conta " + getNumConta .....) em um mét pra isso
	public String toString() {
		return "ContaBanco [numConta=" + numConta + ", tipo=" + tipo + ", dono=" + dono + ", saldo=" + saldo
				+ ", isStatus=" + isStatus + "]";
	}
	
	//================================================================================================================
	// CONSTRUTOR
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}

	//================================================================================================================
	// MÉTODOS
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		
		if(t.equals("CC")) {
			this.setSaldo(50);
		}else if(t.equals("CP")) {
			this.setSaldo(150); 
		}else {
			System.err.println("não tem tipo");
		}		
	}

	// ---------------------------------------------------
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("conta não pode fechar, ainda tem dinheiro");
		}else if(this.getSaldo() < 0) {
			System.out.println("conta não pode fechar, débito negativo");
		}else {
			this.setStatus(false);
			System.out.println("Conta fechada");
		}
	}

	// ---------------------------------------------------
	public void depositar(float v) {
		if(this.isStatus()) {
			// this.saldo = this.saldo + v; igual abaixo, mas correto
			this.setSaldo(this.getSaldo() + v);
			System.out.println("deposito realizado, na conta de " +  getDono());
		}else {
			System.err.println("impossível depositar");
		}
	}

	// ---------------------------------------------------
	public void sacar(float v) {
		if(this.isStatus()) {			
			if(this.getSaldo() >= v) {			
				this.setSaldo(this.getSaldo() - v);
				System.out.println("deposito realizado, na conta de " +  getDono());
			}else {
				System.out.println("saldo insuficiente");
			}
		}else {
			System.err.println("impossível sacar, conta não existe");
		}
	}

	// ---------------------------------------------------
	public void pagarMensal() {
		int v = 0;
		if (this.getTipo().equals("CC")) {
			v = 12;
		} else if (this.getTipo().equals("CP")){
			v = 20;
		}
		
		if (this.isStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga por " + this.getDono());
		} else {
			System.err.println("impossível pagar");
		}
	}

	//================================================================================================================
	// MÉT ESPECIAIS
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	// ---------------------------------------------------
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// ---------------------------------------------------
	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	// ---------------------------------------------------
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	// ---------------------------------------------------
	public boolean isStatus() {
		return isStatus;
	}

	public void setStatus(boolean isStatus) {
		this.isStatus = isStatus;
	}
}
