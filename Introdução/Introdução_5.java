package exerciciosjava;

import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
		
		 	double n1, n2, n3, media;
	        
	        Scanner read = new Scanner (System.in);

	        System.out.print("Informe a primeira nota: ");
	        n1=read.nextDouble();

	        System.out.print("Informe a segunda nota: ");
	        n2=read.nextDouble();

	        System.out.print("Informe a terceira nota: ");
	        n3=read.nextDouble();

	        n1=n1*2;
	        n2=n2*3;
	        n3=n3*5;
	        
	        media=(n1+n2+n3)/10;

	        System.out.println("A média do aluno é " +media);

	}

}
