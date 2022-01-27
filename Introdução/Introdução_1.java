package exercicio1;

import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		

		        int anos, meses, dias, totaldias;


		        Scanner read = new Scanner (System.in);

		        System.out.println("Quantos anos você tem?: ");
		        anos=read.nextInt();

		        System.out.println("Quantos meses você tem?: ");
		        meses=read.nextInt();

		        System.out.println("Quantos dias você tem?: ");
		        dias=read.nextInt();

		        totaldias=(anos*365)+(meses*30)+ dias;


		        System.out.println("A sua idade em dias é "+totaldias);
	}

}
