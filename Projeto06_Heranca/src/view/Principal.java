package view;

import model.Aluno;
import model.Bolsista;
import model.Funcionario;
import model.Pessoa;
import model.Professor;
import model.Visitante;

public class Principal {

	public static void main(String[] args) {		
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		
		// TODOS USANDO APENAS CLASSE PESSOA
		p2.setNome("Maria");
		p3.setNome("Cláudia");
		p4.setNome("Fabiana");
		
		p4.setSexo("F");
		p2.setIdade(18);
				
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		//===================================

		
		// TODOS USANDO SUAS PRÓPRIAS CLASSES
		p2.setCurso("Informática");
		p2.setMatricula(1111);
		p2.pagarMensalidade();
		p3.setSalario(1200.50f);
		p4.setSetor("Estoque");
		
				
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		//===================================
		
		
		Visitante v1 = new Visitante();
		v1.setNome("Juvenal");
		v1.setIdade(23);
		v1.setSexo("M");
		System.out.println(v1.toString());
		
		Bolsista b1 = new Bolsista();
		b1.setNome("José");
		b1.setIdade(50);
		b1.setSexo("M");
		b1.setCurso("Advocacia");
		b1.setMatricula(1234);
		b1.setBolsa(1230.56f);
		b1.pagarMensalidade();
	}

}
