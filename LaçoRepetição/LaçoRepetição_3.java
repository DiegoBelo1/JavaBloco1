package LaçoRepetição;

import java.util.Scanner;

public class LaçoRepetição_3 {

	public static void main(String[] args) {
	
		int cont21=0, cont50=0, idade;
		
		Scanner read = new Scanner (System.in);
		System.out.print("Informe a idade: ");
		idade=read.nextInt();
		
		while (idade!=-99)
		{
		    if(idade<21)
			cont21++;	
			if(idade>50)	
			cont50++;
			
			System.out.print("!!!PARA ENCERRAR DIGITE -99!!! Informe a idade: ");
			idade=read.nextInt();
		}
		
		System.out.println("\nNúmero de pessoas com menos de 21 anos: "+cont21);
		System.out.println("Número de pessoas com mais de 50 anos: "+cont50);
	}

}
