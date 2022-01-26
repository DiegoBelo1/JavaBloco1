package exerciciosjava;

import java.util.Scanner;

public class exercicio_7 {

	public static void main(String[] args) {
		
		double a, b, c, d, e, f, x, y;

        Scanner read = new Scanner (System.in);

        System.out.println("Digite os valores de A, B, C, D e F");
        System.out.println("A: ");
        a=read.nextDouble();

        System.out.println("B: ");
        b=read.nextDouble();

        System.out.println("C: ");
        c=read.nextDouble();

        System.out.println("D: ");
        d=read.nextDouble();
        
        System.out.println("E: ");
        e=read.nextDouble();
        
        System.out.println("F: ");
        f=read.nextDouble();
        
        x=(c*e-b*f)/(a*e-b*d);
        y=(a*f-c*d)/(a*e-b*d);
        
        System.out.println("O valor de X é: "+x+"\nO valor de Y é: "+y);
        		

	}

}
