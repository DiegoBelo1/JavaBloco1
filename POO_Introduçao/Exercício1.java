package POO_Introdu�ao;

public class Exerc�cio1 {

    String nome;
    int idade;
    String cpf;

    public Exerc�cio1()
    {
        this.nome="Jo�o";
        this.idade=20;
        this.cpf="123.456.789-00";
    }

        public void informarNome()
        {
            System.out.println("seu nome: "+nome);
        }

        public void informarIdade()
        {
            System.out.println("sua idade: "+idade);
        }

        public void informarCpf()
        {
            System.out.println("seu cpf: "+cpf);
        }

}
