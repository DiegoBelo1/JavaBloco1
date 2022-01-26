package exerciciosjava;

import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		
		double a, b, c, d, r, s;
        Scanner read = new Scanner (System.in);

        System.out.println("Informe o valor de A: ");
        a=read.nextDouble();

        System.out.println("Informe o valor de B: ");
        b=read.nextDouble();

        System.out.println("Informe o valor de C: ");
        c=read.nextDouble();

        r=Math.pow((a+b), 2);

        s=Math.pow((b+c), 2);

        d=(r+s)/2;

        System.out.println("O valor de D é: "+d);

	}

}
