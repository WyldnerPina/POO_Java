package view;

import model.Luta;
import model.Lutador;

public class Principal_UEC {// ulta emoji combat

	public static void main(String[] args) {
		// exemplo de 1 objeto
		Lutador lut1 = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);// criando lutador 1
		lut1.apresentar();
		
//		em vez de sair criando os 6 lutadores l1, até l6 eu crio um vetor
		Lutador l[] = new Lutador[6];
		l[0] = new Lutador ("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
		l[1] = new Lutador ("Putscript", "Brasil", 29, 1.68f, 58.7f, 14, 2, 3);
		l[2] = new Lutador ("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
		l[3] = new Lutador ("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
		l[4] = new Lutador ("Ufo Cobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
		l[5] = new Lutador ("Nerdart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
		
		System.err.println("-------------------------------------------------------------------");
		l[0].status();
		
		// exemplos de lutas
		System.err.println("\n++++++++++ LUTAS ++++++++++\n");
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(l[0], l[1]);
		UEC01.lutar();
		System.out.println("=== Resultado ===");
		l[0].status();
		l[1].status();
		
	}

}
