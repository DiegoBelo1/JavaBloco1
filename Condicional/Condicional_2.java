package Condicional;

import java.util.Scanner;

public class Condicional_2 {

	public static void main(String[] args) {
		
		int cont, x, par = 0, impar = 0;
		
		for (cont=1;cont<=10;cont++)
		{
		
		Scanner read = new Scanner (System.in);
		
		System.out.print("Informe um número: ");
		x=read.nextInt();
				
			if (x % 2 == 0)	
			{
				par = par + 1;
			}
			
			else
			{
				impar = impar + 1;
			}
		 }
		 
		 System.out.println("A quantidade de números pares é: "+par);
		 System.out.println("A quantidade de números ímpares é: "+impar);

	}

}
