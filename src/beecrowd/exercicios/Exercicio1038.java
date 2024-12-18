package beecrowd.exercicios;

import java.util.Scanner;

public class Exercicio1038 {
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    
	    int codigo;
	    double quantidade, valorTotal;
	    
	    codigo = scan.nextInt();
	    quantidade = scan.nextDouble();
	    
	    switch(codigo) {
	        
	    case 1:
	        valorTotal = (4.00 * quantidade);
	        System.out.printf("Total: R$ %.2f\n", valorTotal);
	        break;
        case 2:
	        valorTotal = (4.50 * quantidade);
	        System.out.printf("Total: R$ %.2f\n", valorTotal);
	        break;
        case 3:
	        valorTotal = (5.00 * quantidade);
	        System.out.printf("Total: R$ %.2f\n", valorTotal);
	        break;
        case 4:
	        valorTotal = (2.00 * quantidade);
	        System.out.printf("Total: R$ %.2f\n", valorTotal);
	        break;
        case 5:
	        valorTotal = (1.50 * quantidade);
	        System.out.printf("Total: R$ %.2f\n", valorTotal);
	        break;
	    }
	    scan.close();
	}
}
