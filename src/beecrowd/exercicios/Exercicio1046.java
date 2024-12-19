package beecrowd.exercicios;

import java.util.Scanner;

/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, 
 * sabendo que o mesmo pode começar em um dia e terminar em outro, 
 * tendo uma duração mínima de 1 hora e máxima de 24 horas.*/
public class Exercicio1046 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    int horaInicial, horaFinal, duracao;
	    
	    horaInicial = scan.nextInt();
	    horaFinal = scan.nextInt();
	    
	    if (horaInicial > horaFinal) {
	        duracao = (24 - horaInicial) + horaFinal;
	        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
	    } else if (horaFinal > horaInicial) {
	        duracao = horaFinal - horaInicial;
	        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
	    } else if (horaInicial == horaFinal) {
	        System.out.println("O JOGO DUROU 24 HORA(S)");
	    }
	    
		scan.close();
	}
}
