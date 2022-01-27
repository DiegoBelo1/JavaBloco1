package Condicional;

import java.util.Scanner;

public class Condicional_5 {

	public static void main(String[] args) {
		
		int x, soma=0;
		
		Scanner read = new Scanner (System.in);
		
		do
		{
		System.out.print("Informe um número: ");
		x=read.nextInt();
		
		soma=x+soma;
			
		}while(x!=0);
		
		System.out.println("\nA soma dos números informados é: "+soma);

	}

}
