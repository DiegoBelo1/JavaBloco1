package Herança_Polimorfismo;

public class Cachorro extends Animal {
	

	public void cachorroCorre() {
		System.out.println("O cachorro está correndo");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Au au au");				
	}
	
}