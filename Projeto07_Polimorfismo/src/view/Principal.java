package view;

import model.Ave;
import model.Cachorro;
import model.Canguru;
import model.Mamiferos;
import model.Peixe;
import model.Reptil;

public class Principal {
	/*
											<<abstract>>
	     										ANIMAL
											 # peso 
											 # idade
											 # membros
											 + locomover()
	 										 + alimentar()
											 + emitirSom()
											    /_\
			                                     |    herança
	        _____________________________________|_____________________________________________________
		    |					 						  |				  		 |				      |
	     MAMIFEROS										REPTIL   			   PEIXE  			     AVE
	   - corPelo		  							 - corEscama     		- corEscama	 	       - corPena
												    						+ soltarBolhas()       + fazerNinho()
	       /_\					                         /_\                   /_\                   /_\
	        |                      		  				  |                     |                     |
	 _______|_____________________________           _____|______               |                     |
	 |                                   |           |          |               |                     | 
 CACHORRO		                       CANGURU		COBRA	 TARTARUGA	      GOLDFISH			     ARARA
+ emitirSom()						+ locomover()
+ reagir(frase: caracter)           + usarBolsa()
+ reagir(hora, min: int)
+ reagir(dono: logico)
+ reagir(idade: int, peso: real)
 
	 */
	 
	
	
	public static void main(String[] args) {
//		Animal a1 = new Animal(); não pode ser instanciado, é abstrato
		Mamiferos m = new Mamiferos();
		m.setPeso(35.5f);
		m.setCorPelo("Marrom");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		
		System.err.println("========================================");
		Reptil r = new Reptil();
		r.locomover();// mesmo mét respostas diferentes - polimorfirmo de sobreposição
		
		Peixe p = new Peixe();
		p.locomover();
		
		Ave a = new Ave();
		a.locomover();
		System.err.println("========================================");
		
		// polimorfirmo de sobreposição
		Canguru cang = new Canguru();
		cang.locomover();
		cang.emitirSom();
		System.err.println("========================================");
		
		Cachorro dog = new Cachorro();
		dog.locomover();
		dog.emitirSom();
		System.err.println("========================================");
		
		// polimorfismo de sobrecarga
		dog.reagir("olá");
		dog.reagir("Vai Apanhar");
		dog.reagir(11, 45);
		dog.reagir(21, 00);
		dog.reagir(true);
		dog.reagir(false);
		dog.reagir(2, 12.5f);
		dog.reagir(17, 4.5f);
		
	}
}
