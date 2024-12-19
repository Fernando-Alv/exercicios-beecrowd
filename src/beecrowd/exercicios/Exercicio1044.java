package beecrowd.exercicios;

import java.util.Scanner;

/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem 
 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.*/
public class Exercicio1044 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    int a, b;
	    
	    a = scan.nextInt();
	    b = scan.nextInt();
	    
	    if (b % a == 0 || a % b == 0) {
	        System.out.println("Sao Multiplos");
	    } else {
		    System.out.println("Nao sao Multiplos");
	    }
	    
	    scan.close();
	}
}
