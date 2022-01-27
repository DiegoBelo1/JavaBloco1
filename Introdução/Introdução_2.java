package exerciciosjava;

import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		
		 int anos, meses, dias, sobra, resp;
	        Scanner read = new Scanner (System.in);

	        System.out.println("Informe sua idade em dias: ");
	        resp=read.nextInt();

	        anos=resp/365;
	        sobra=resp%365;
	        meses=sobra/30;
	        dias=sobra%30;

	        System.out.println("Sua idade em anos: "+anos+"\nSua idade em meses: "+meses+"\nSua idade em dias: "+dias);

	}

}
