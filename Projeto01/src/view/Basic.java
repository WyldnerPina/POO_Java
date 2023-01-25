package view;

import model.Caneta;
import model.CanetaCompleta;
import model.CanetaCompleta2;

public class Basic {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "bic";
		c1.cor = "azul";
		c1.ponta = 0.5f;// qndo é float precisa por o f
		c1.carga = 90;
		c1.isTampada = false;
		c1.status();
		c1.rabiscar();
		System.err.println("==================");
		c1.tampar();
		c1.status();
		c1.rabiscar();

		Caneta c2 = new Caneta();
		c2.modelo = "pentel";
		c2.cor = "preta";
		c2.ponta = 0.7f;
		c2.carga = 90;
		c2.isTampada = false;
		c2.status();

		
		
		// ===========================================================================
		// USANDO AGORA COM GET E SET NA CLASSE
		System.err.println("================== só construtor");
		CanetaCompleta cc1 = new CanetaCompleta();
		cc1.status();

		System.err.println("================== após get e set");
		cc1.setModelo("bic");// sendo publico pode ser acessado como acima, mas sendo privado apenas por get
								// e set
		cc1.setPonta(0.7f);
		cc1.status();

		System.err.println("================== outra forma de print");
		// outra forma de printar
		System.out.println("Minha caneta: " + cc1.getModelo() + " ponta " + cc1.getPonta());

		
		
		// PREENCHENDO COM CONSTRUTOR
		// ===========================================================================		
		System.err.println("================== preenchendo com construtor");
		CanetaCompleta2 cc2 = new CanetaCompleta2("Pentel", "vermelha", 0.7f);// uso apenas uma linha pra preencher o objeto
		cc2.status();
	}
}
