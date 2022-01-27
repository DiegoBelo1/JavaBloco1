package Introdução;

import java.util.Scanner;

public class Introdução_6 {

	public static void main(String[] args) {
		
		 double x1, x2, y1, y2, d;

	        Scanner read = new Scanner (System.in);

	        System.out.println("Digite os valores de x1,X2,Y1 e Y2");
	        System.out.println("X1: ");
	        x1=read.nextDouble();

	        System.out.println("X2: ");
	        x2=read.nextDouble();

	        System.out.println("Y1: ");
	        y1=read.nextDouble();

	        System.out.println("Y2: ");
	        y2=read.nextDouble();

	        d=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1,2));

	        System.out.print("A distancia entre os pontos é: "+ d);

	}

}
