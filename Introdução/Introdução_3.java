package Introdução;

import java.util.Scanner;

public class Introdução_3 {

	public static void main(String[] args) {
		
		int seg, min, hora, ev, rest;
       
		Scanner read = new Scanner (System.in);

        System.out.println("Escreva o tempo de duração do evento em segundos: ");
        ev=read.nextInt();

        hora = ev/3600;
        rest = ev%3600;
        min = rest/60;
        seg = rest%60;

        System.out.println("Tempo em horas: "+hora+"horas \nTempo em minutos: "+min+"minutos \nTempo em segundos: "+seg+"segundos");

	}

}
