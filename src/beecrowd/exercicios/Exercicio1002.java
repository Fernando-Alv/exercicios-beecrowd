package beecrowd.exercicios;

import java.util.Scanner;

/*A fórmula para calcular a área de uma circunferência é: area = π . raio2. 
 * Considerando para este problema que π = 3.14159:
- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.*/
public class Exercicio1002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n = 3.14159;
		double raio = sc.nextDouble();
		double area = n * (raio * raio);
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();
	}

}
