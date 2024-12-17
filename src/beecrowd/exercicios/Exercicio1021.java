package beecrowd.exercicios;

import java.util.Scanner;

/*Leia um valor de ponto flutuante com duas casas decimais. Este valor 
 * representa um valor monetário. A seguir, calcule o menor número de notas 
 * e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas 
 * são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. 
 * A seguir mostre a relação de notas necessárias.*/
public class Exercicio1021 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    double dinheiro, resto;
	    int notas, moedas;
	    
	    dinheiro = scan.nextDouble();
	    notas = (int)dinheiro / 100;
	    
		System.out.println("NOTAS:");
		System.out.printf("%d nota(s) de R$ 100.00\n", notas);
		
		resto = dinheiro % 100;
		notas = (int)resto / 50; 
		System.out.printf("%d nota(s) de R$ 50.00\n", notas);
		
		resto %= 50;
		notas = (int)resto / 20; 
		System.out.printf("%d nota(s) de R$ 20.00\n", notas);
		
		resto %= 20;
		notas = (int)resto / 10; 
		System.out.printf("%d nota(s) de R$ 10.00\n", notas);
		
		resto %= 10;
		notas = (int)resto / 5; 
		System.out.printf("%d nota(s) de R$ 5.00\n", notas);
		
		resto %= 5;
		notas = (int)resto / 2; 
		System.out.printf("%d nota(s) de R$ 2.00\n", notas);
		
		resto %= 2;
		resto *= 100;
		moedas = (int)(resto / 100); 
		System.out.println("MOEDAS:");
		System.out.printf("%d moeda(s) de R$ 1.00\n", moedas);
		
		resto %= 100;
		moedas = (int)(resto / 50); 
		System.out.printf("%d moeda(s) de R$ 0.50\n", moedas);
		
		resto %= 50;
		moedas = (int)(resto / 25); 
		System.out.printf("%d moeda(s) de R$ 0.25\n", moedas);
		
		resto %= 25;
		moedas = (int)(resto / 10); 
		System.out.printf("%d moeda(s) de R$ 0.10\n", moedas);
		
		resto %= 10;
		moedas = (int)(resto / 5); 
		System.out.printf("%d moeda(s) de R$ 0.05\n", moedas);
		
		resto %= 5;
		moedas = (int)(resto); 
		System.out.printf("%d moeda(s) de R$ 0.01\n", moedas);
		
		scan.close();
	}
}
