package beecrowd.exercicios;

import java.util.Scanner;

/*Faça um programa que leia três valores e apresente o maior dos três 
 * valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:
Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). 
Um segundo passo, portanto é necessário para chegar no resultado esperado.*/
public class Exercicio1013 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int a, b, c;
	    int maiorAB, maiorABC;
	    
	    a = scan.nextInt();
	    b = scan.nextInt();
	    c = scan.nextInt();
	    
	    maiorAB = (a + b + Math.abs(a - b)) / 2;
	    maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
	    
		System.out.printf("%d eh o maior\n", maiorABC);
		
		scan.close();
	}
}
