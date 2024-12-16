package beecrowd.exercicios;

import java.util.Scanner;

/*Leia os quatro valores correspondentes aos eixos x e y 
 * de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) 
 * e calcule a distância entre eles, mostrando 4 casas decimais, segundo a fórmula:
*/
public class Exercicio1015 {
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    
	    double x1, x2, y1, y2;	    
	    
	    x1 = scan.nextDouble();
	    y1 = scan.nextDouble();
	    x2 = scan.nextDouble();
	    y2 = scan.nextDouble();	    
	    	    
		System.out.printf("%.4f\n",Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1))));
		
		scan.close();
	}
}
