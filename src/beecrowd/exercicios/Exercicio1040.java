package beecrowd.exercicios;

import java.util.Scanner;

/*Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às 
quatro notas de um aluno. Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada 
uma destas notas e mostre esta média acompanhada pela mensagem "Media: ". Se esta média for 
maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.". Se a média calculada for inferior a 5.0, 
imprima a mensagem "Aluno reprovado.". Se a média calculada for um valor entre 5.0 e 6.9, 
inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".
No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno. 
Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada. 
Recalcule a média (some a pontuação do exame com a média anteriormente calculada e divida por 2). 
e imprima a mensagem "Aluno aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.", 
(caso a média tenha ficado 4.9 ou menos). Para estes dois casos (aprovado ou reprovado após ter pego exame) 
apresente na última linha uma mensagem "Media final: " seguido da média final para esse aluno.*/
public class Exercicio1040 {
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    
	    float n1, n2, n3, n4, media, exame;
	    
        n1 = scan.nextFloat();
	    n2 = scan.nextFloat();
	    n3 = scan.nextFloat();
	    n4 = scan.nextFloat();
	    
	    media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
	    
	    if(media >= 7.0f) {
            System.out.printf("Media: %.1f\n", media);
	        System.out.println("Aluno aprovado.");
	    }else if(media < 5.0f) {
	        System.out.printf("Media: %.1f\n", media);
	        System.out.println("Aluno reprovado.");
	    }else if(media < 7.0f) {
	        System.out.printf("Media: %.1f\n", media);
	        System.out.println("Aluno em exame.");
	        
	        exame = scan.nextFloat();
	        media = (media + exame) / 2; 
	        if(media >= 5.0f) {
	       
    	        System.out.printf("Nota do exame: %.1f\n", exame);
    	        System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", media);
	        }else {
	            System.out.printf("Nota do exame: %.1f\n", exame);
    	        System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n", media);
	        }
        }
	    scan.close();
	}
}
