package LaçoRepetição;

import java.util.Scanner;

public class LaçoRepetição_4 {

	public static void main(String[] args) {
	
		int pessoas=1, idade;
		int p_calm=0, m_nerv=0, h_agres=0, o_calm=0;
		int nerv_40=0, calm_18=0; 
		int carac, sexo;		
			
		while(pessoas<=150)
		{
			Scanner read = new Scanner (System.in);
			
			System.out.println("Dados da pessoa "+pessoas++);
			
			System.out.print("Informe a idade: ");
			idade=read.nextInt();
			
			System.out.print("Informe o sexo (1)Masculino (2)Feminino (3)Outros: ");
			sexo=read.nextInt();
			
			System.out.print("Informe se você é (1)Calmo (2)Nervoso (3)Agressivo: ");
			carac=read.nextInt();
			
			if(carac==1)
			p_calm++;
			if(sexo==2 && carac==2)
			m_nerv++;
			if(sexo==1 && carac==3)
			h_agres++;
			if(sexo==3 && carac==1)
			o_calm++;
			if(carac==2 && idade>40)
			nerv_40++;
			if(carac==1 && idade<18)
			calm_18++;			
		}
		
		System.out.println("\nNúmero de pessoas calmas: "+p_calm);
		System.out.println("Número de mulheres nervosas: "+m_nerv);
		System.out.println("Número de homens agressivos: "+h_agres);
		System.out.println("Número de outros calmos: "+o_calm);
		System.out.println("Número de pessoas nervosas com mais de 40 anos: "+nerv_40);
		System.out.println("Número de pessoas calmas com menos de 18 anos: "+calm_18);
		
	}

}
