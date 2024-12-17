package beecrowd.exercicios;

import java.util.Scanner;

/*Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da 
 * equação de Bhaskara. Se não for possível calcular as raízes, mostre a 
 * mensagem correspondente “Impossivel calcular”, 
 * caso haja uma divisão por 0 ou raiz de numero negativo.*/
public class Exercicio1036 {
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    
	    double a, b, c, r1, r2, delta;
	    
		a = scan.nextDouble();

		b = scan.nextDouble();

		c = scan.nextDouble();
		
		if(a == 0) {
		    System.out.println("Impossivel calcular");
		}else{
		    delta = ((b * b) - (4 * a * c));
		    
		    if( delta < 0) {
		        System.out.println("Impossivel calcular");
		    }else {
		        r1 = ((-b + Math.sqrt(delta)) / (2 * a));
		        r2 = ((-b - Math.sqrt(delta)) / (2 * a));
		        
		        System.out.printf("R1 = %.5f\n", r1);
		        System.out.printf("R2 = %.5f\n", r2);
		    }
		}
		scan.close();
	}
}
