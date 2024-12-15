package beecrowd.exercicios;

import java.util.Scanner;

/*Calcule o consumo médio de um automóvel sendo fornecidos a distância total 
 * percorrida (em Km) e o total de combustível gasto (em litros).*/
public class Exercicio1014 {
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    
	    int x;
	    double y;
	    
	    x = scan.nextInt();
	    y = scan.nextDouble();
	    
		System.out.printf("%.3f km/l\n",x / y);
		
		scan.close();
	}
}
