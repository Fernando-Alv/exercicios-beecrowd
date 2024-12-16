package beecrowd.exercicios;

import java.util.Scanner;

/*Leia um valor inteiro, que é o tempo de duração em segundos de um determinado 
 * evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.*/
public class Exercicio1019 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    int n, horas, minutos, segundos;
	    
	    
		n = scan.nextInt();
		horas = n / 3600;
		minutos = (n % 3600) / 60;
		segundos = n % 60;
		
		System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
		
		scan.close();
	}
}
