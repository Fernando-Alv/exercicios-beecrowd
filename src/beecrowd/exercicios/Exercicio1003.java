package beecrowd.exercicios;

import java.util.Scanner;

/*Leia dois valores inteiros, no caso para variáveis A e B. 
 * A seguir, calcule a soma entre elas e atribua à variável SOMA. 
 * A seguir escrever o valor desta variável.*/
public class Exercicio1003 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int SOMA = A + B;
		
		System.out.printf("SOMA = %d%n", SOMA);
		
		sc.close();
	}
}
