package exerciciosjava;

import java.util.Scanner;

public class exercicio_8 {

	public static void main(String[] args) {
		
		double custofabrica, custocliente;

        Scanner read = new Scanner (System.in);

        System.out.print("Informe o custo de f�brica do ve�culo: ");
        custofabrica=read.nextDouble();

        custocliente=(custofabrica*0.73)+custofabrica;


        System.out.print("O valor do ve�culo com impostos �: "+ custocliente);

	}

}
