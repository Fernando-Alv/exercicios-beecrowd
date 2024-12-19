package beecrowd.exercicios;

import java.util.Scanner;

/*Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. 
 * A seguir calcule a duração do jogo.
Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.*/
public class Exercicio1047 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int horaInicial, horaFinal, minutoInicial, minutoFinal;
        int duracaoHora = 0, duracaoMin;
        
        horaInicial = scan.nextInt();
        minutoInicial = scan.nextInt();
        horaFinal = scan.nextInt();
        minutoFinal = scan.nextInt();
        
        if (horaInicial > horaFinal || (horaInicial == horaFinal && minutoInicial > minutoFinal)) {
            duracaoHora = (24 - horaInicial) + horaFinal;
        } else {
            duracaoHora = horaFinal - horaInicial;
        }
        if (minutoInicial > minutoFinal) {
            duracaoMin = (60 - minutoInicial) + minutoFinal;
            duracaoHora -= 1; 
        } else {
            duracaoMin = minutoFinal - minutoInicial;
        }
        if (horaInicial == horaFinal && minutoInicial == minutoFinal) {
            duracaoHora = 24;
            duracaoMin = 0;
        }

        System.out.println("O JOGO DUROU " + duracaoHora + " HORA(S) E " + duracaoMin + " MINUTO(S)");
        
        scan.close();
    }
}
