package beecrowd.exercicios;

import java.util.Scanner;

/*Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
 * o valor que recebe por hora e calcula o salário desse funcionário. 
 * A seguir, mostre o número e o salário do funcionário, com duas casas decimais.*/
public class Exercicio1008 {
	
	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    int numero;
	    int horas;
	    double valorHora;
	    
	    numero = scan.nextInt();
	    horas = scan.nextInt();
	    valorHora = scan.nextDouble();
	    
		System.out.printf("NUMBER = %d\n", numero);
		System.out.printf("SALARY = U$ %.2f\n", horas * valorHora);
		
		scan.close();
	}
}
