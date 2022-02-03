package Herança_Polimorfismo;

public class Cavalo extends Animal {

	public void cavaloCorre() {
		System.out.println("O cavalo está correndo");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O Cavalo está relinchando");
	}
	
}