package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "Vanessa Manzani", "van.manzani@gmail.com");
		Pessoa p2 = new Pessoa(2, "J�lio Rodrigues", "junin@gmail.com");
		Pessoa p3 = new Pessoa(3, "Marcelo Ferraz", "ferraz@gmail.com");
		System.out.println((p1));
		System.out.println(p2);
		System.out.println(p3);

	}

}
