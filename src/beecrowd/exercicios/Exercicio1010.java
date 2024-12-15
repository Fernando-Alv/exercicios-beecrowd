package beecrowd.exercicios;

import java.util.Scanner;

/*Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, 
 * o valor unitário de cada peça 1, o código de uma peça 2, 
 * o número de peças 2 e o valor unitário de cada peça 2. 
 * Após, calcule e mostre o valor a ser pago.Neste problema, deve-se ler o 
 * código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, 
 * o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. 
 * Após, calcule e mostre o valor a ser pago.*/
public class Exercicio1010 {
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    int codigoPeca, numeroPeca;
	    double valorPeca, valorTotal;
	    
	    codigoPeca = scan.nextInt();
	    numeroPeca = scan.nextInt();
	    valorPeca = scan.nextDouble();
	    
	    valorTotal = numeroPeca * valorPeca;
	    
	    codigoPeca = scan.nextInt();
	    numeroPeca = scan.nextInt();
	    valorPeca = scan.nextDouble();
	    
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", (valorTotal + (valorPeca * numeroPeca)));
		
		scan.close();
	}
}
