package beecrowd.exercicios;

import java.util.Scanner;

/*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) 
 * no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. 
 * A seguir mostre o valor lido e a relação de notas necessárias.*/
public class Exercicio1018 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    int reais, quantidadeNotas, resto;
	    
	    reais = scan.nextInt();
	    
	    System.out.println(reais);
	    
	    System.out.printf("%d nota(s) de R$ 100,00\n",reais / 100);
	    
	    resto = reais % 100;
	    quantidadeNotas = resto / 50;
	    
		System.out.printf("%d nota(s) de R$ 50,00\n",quantidadeNotas);
		
		resto %= 50;
		quantidadeNotas = resto / 20;
		
		System.out.printf("%d nota(s) de R$ 20,00\n",quantidadeNotas);
		
		resto %= 20;
		quantidadeNotas = resto / 10;
		
		System.out.printf("%d nota(s) de R$ 10,00\n",quantidadeNotas);
		
		resto %= 10;
		quantidadeNotas = resto / 5;
		
		System.out.printf("%d nota(s) de R$ 5,00\n",quantidadeNotas);
		
        resto %= 5;
		quantidadeNotas = resto / 2;
		
		System.out.printf("%d nota(s) de R$ 2,00\n",quantidadeNotas);
		resto %= 2;
		
		System.out.printf("%d nota(s) de R$ 1,00\n",resto);
		
		scan.close();
	}
}
