package POO_Introduçao;

public class Exercício1 {

    String nome;
    int idade;
    String cpf;

    public Exercício1()
    {
        this.nome="João";
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
