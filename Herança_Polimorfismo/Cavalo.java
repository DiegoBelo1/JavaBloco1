package Heran�a_Polimorfismo;

public class Cavalo extends Animal {

	public void cavaloCorre() {
		System.out.println("O cavalo est� correndo");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O Cavalo est� relinchando");
	}
	
}