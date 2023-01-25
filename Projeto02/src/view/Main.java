package view;

public class Main {

	public static void main(String[] args) {
		
		ContaBanco p1 = new ContaBanco();// pessoa 1
		p1.setNumConta(1111);
		p1.setDono("Jubileu");		
		p1.abrirConta("CC");
		
		ContaBanco p2 = new ContaBanco();// pessoa 1
		p2.setNumConta(2222);
		p2.setDono("Creuza");// se não definir o tipo não abre status= false		
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.err.println("===============================");
		
		p1.depositar(100);
		p2.abrirConta("CP");
		p2.depositar(200);//como gerou a conta agora, então vai ter 200 + 150 pq abriu CP
		p2.sacar(25);
		
		System.out.println(p1);
		System.out.println(p2);
		System.err.println("===============================");
		
		
		p1.fecharConta();
		System.out.println(p1);// conta não fecha
		System.err.println("===============================");
		
		p1.sacar(150);
		p1.fecharConta();// fechada pq agora saldo está zerado
		System.out.println(p1);
		System.err.println("===============================");
	}
}
