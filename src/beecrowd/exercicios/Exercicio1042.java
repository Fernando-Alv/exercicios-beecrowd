package beecrowd.exercicios;

import java.util.Arrays;
import java.util.Scanner;

/*Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores 
 * em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.*/
public class Exercicio1042 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    int num1, num2, num3;
	    
	    num1 = scan.nextInt();
	    num2 = scan.nextInt();
	    num3 = scan.nextInt();
	    
	    int numerosOrdenados[] = {num1, num2, num3};
	    Arrays.sort(numerosOrdenados);
	    
	    for(int i : numerosOrdenados) {
	        System.out.println(i);
	    }
	    System.out.println();
	    
	    System.out.println(num1);
	    System.out.println(num2);
	    System.out.println(num3);
	   
	    scan.close();
	}
}
