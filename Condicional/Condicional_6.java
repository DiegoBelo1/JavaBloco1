package Condicional;

import java.util.Scanner;

public class Condicional_6 {

	public static void main(String[] args) {
		
		int x, cont=0, media=0, soma=0;
		
		Scanner read = new Scanner (System.in);
		
		do
		{
		System.out.print("Informe um n�mero: ");
		x=read.nextInt();
		
		if(x%3==0)
		cont++;
		soma=x+soma;
		
		System.out.println("!!!Para encerrar digite 0!!!");
			
		}while(x!=0);
		
		media=soma/cont;
		
		System.out.println("\nA m�dia dos n�meros informados �: "+media);

	}

}
