package beecrowd.exercicios;

import java.util.Scanner;

/*Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. 
 * Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:
Perimetro = XX.X
Em caso negativo, calcule a área do trapézio que tem A e B como base 
e C como altura, mostrando a mensagem
Area = XX.X*/
public class Exercicio1043 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    double a, b, c;
	    double area, perimetro;
	    
	    a = scan.nextDouble();
	    b = scan.nextDouble();
	    c = scan.nextDouble();
	    
	    area = ((a + b) * c) / 2;
	    perimetro = a + b + c;
	    
	    if ((a + b > c) && (a + c > b) && (b + c > a)) {
	        System.out.println("Perimetro = " + perimetro);
	    } else {
		    System.out.println("Area = " + area);
	    }
	    
	    scan.close();
	}
}
