package beecrowd.exercicios;

import java.util.Scanner;

/*Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, 
  de modo que o lado A representa o maior dos 3 lados. A seguir, determine o 
  tipo de triângulo que estes três lados formam, com base nos seguintes casos, 
  sempre escrevendo uma mensagem adequada:
se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
Entrada*/
public class Exercicio1045 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double a, b, c, maior, bc, a2;
        
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        
        if (b > a) {
            maior = a;
            a = b;
            b = maior;
        }
        
        if (c > a) {
            maior = a;
            a = c;
            c = maior;
        }
        
        a2 = Math.pow(a, 2);
        bc = Math.pow(b, 2) + Math.pow(c, 2);
        
        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (a2 == bc) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (a2 > bc) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || a == c || b == c) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        scan.close();
    }
}
