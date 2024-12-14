package beecrowd.exercicios;

import java.util.Scanner;

/*Leia dois valores inteiros. A seguir, calcule o produto entre 
 * estes dois valores atribua esta operação à variável PROD. 
 * A seguir mostre a variável PROD com mensagem correspondente.*/
public class Exercicio1004 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		int PROD = valor1 * valor2;
		
		System.out.printf("PROD = %d%n", PROD);
		
		sc.close();
	}

}
