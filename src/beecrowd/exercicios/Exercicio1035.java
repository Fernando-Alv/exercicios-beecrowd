package beecrowd.exercicios;

import java.util.Scanner;

/*Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e 
 * se D for maior do que A, e a soma de C com D for maior que a soma de A e B 
 * e se C e D, ambos, forem positivos e se a variável A for par escrever a mensagem 
 * "Valores aceitos", senão escrever "Valores nao aceitos".*/
public class Exercicio1035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura dos valores inteiros A, B, C e D
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        
        // Verificação das condições
        if (B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && A % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
        
        scanner.close();
    }
}
