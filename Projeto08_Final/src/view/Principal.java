package view;

import model.Gafanhoto;
import model.Video;
import model.Visualizacao;
/*
	<<interface>>							PESSOA
	 ACOESVIDEO							# nome
	 + play()							# idade		
	 + pause()							# sexo
	 + like()							# experiencia
	    /_\		                        # ganharXp()
	     |									 /_\
	     |									  |
	   VIDEO							  GAFANHOTO
	 - titulo							- login
	 - avaliacao						- totalAssistido
	 - view								+ viuMaisUm()
	 - curtidas								  |
	 - reproduzindo							  |
		 |									  |
		 |			VISUALIZACAO			  |
		 |______<>	- filme      	<>________|  agregação
		 			- espectador
		 			+ avaliar()
		 			+ avaliar(nota)
		 			+ avaliar(porc)
 */
public class Principal {

	public static void main(String[] args) {
		// TESTE DOS VÍDEOS - Criando vídeos
		Video v[] = new Video[3];
		v[0] = new Video("Aula de POO");
		System.out.println(v[0].toString());
		
		v[1] = new Video("Aula de SO");
		System.out.println(v[0].toString());
		
		v[2] = new Video("Aula de Lógica");	
		System.out.println(v[0].toString());
		
		
		
		// TESTE DOS VÍDEOS - Criando gafanhotos
		Gafanhoto g[] = new Gafanhoto[2];
		System.err.println("==================================================================================");
		g[0] = new Gafanhoto("Jubileu", 23, "M", "Juba");
		System.out.println(g[0].toString());
		
		g[1] = new Gafanhoto("Creuza", 33, "F", "creuzita");
		g[1].viuMaisUm();
		System.out.println(g[1].toString());
		
		// INTERAÇÃO EM VISUALIZACAO
		Visualizacao visu[] = new Visualizacao[5];
		System.err.println("==================================================================================");
		visu[0] = new Visualizacao (g[0], v[0]);
		visu[0].avaliar();
		System.out.println(visu[0].toString());
		
		
		System.err.println("==================================================================================");
		visu[1] = new Visualizacao (g[0], v[1]);
		visu[1].avaliar(87.0f);
		System.out.println(visu[1].toString());
		
		System.err.println("==================================================================================");
		visu[2] = new Visualizacao (g[0], v[0]);
		visu[2].avaliar(5);
		System.out.println(visu[2].toString());		
		
	}

}
