package beecrowd.exercicios;

import java.util.Scanner;

/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de 
 * um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, 
 * ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.*/
public class Exercicio1041 {
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    
	    float x, y;
	    float q1, q2, q3, q4;
	    
	    x = scan.nextFloat();
	    y = scan.nextFloat();
	    
	    if(x == 0f && y == 0f) {
	        System.out.println("Origem");
	    }else if(x < 0f && y < 0f) {
	        System.out.println("Q3");
	    }else if(x < 0f && y >0f) {
	        System.out.println("Q2");
	    }else if(x > 0f && y >0f) {
	        System.out.println("Q1");
	    }else if(x > 0f && y < 0f) {
	        System.out.println("Q4");
	    }else if(x > 0 && y == 0) {
	        System.out.println("Eixo X");
	    }else if(x < 0 && y == 0) {
	        System.out.println("Eixo X");
	    }else if(x == 0 && y > 0) {
	        System.out.println("Eixo Y");
	    }else if(x == 0 && y < 0) {
	        System.out.println("Eixo Y");
	    }
	    scan.close();
	}
}
