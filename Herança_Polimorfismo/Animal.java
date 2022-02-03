package Herança_Polimorfismo;

public class Animal {

	private String nome;
	private int idade;
	private String som;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void status() {
		System.out.println("Nome: "+getNome()+"\n"+"Idade: "+getIdade());
	}
	public void emitirSom() {
		System.out.println("Som generico");
	}

}