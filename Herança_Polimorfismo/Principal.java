package Herança_Polimorfismo;

public class Principal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		
		System.out.println("Cachorro");
		cachorro.setNome("Bob");
		cachorro.setIdade(2);
		cachorro.status();
		cachorro.emitirSom();
		cachorro.cachorroCorre();
		
		System.out.println();
		
		Cavalo cavalo = new Cavalo();
		
		System.out.println("Cavalo");
		cavalo.setNome("Branco");
		cavalo.setIdade(12);
		cavalo.status();
		cavalo.emitirSom();
		cavalo.cavaloCorre();
		
		System.out.println();
		
		Preguiça preguica = new Preguiça ();
		
		System.out.println("Preguiça");
		preguica.setNome("Billy");
		preguica.setIdade(50);
		preguica.status();
		preguica.emitirSom();
		preguica.sobeArv();
	}

}