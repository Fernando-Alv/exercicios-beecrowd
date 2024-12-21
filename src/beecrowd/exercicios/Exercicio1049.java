package beecrowd.exercicios;

import java.util.Scanner;

/*Neste problema, você deverá ler 3 palavras que definem o tipo de animal 
 * possível segundo o esquema abaixo, da esquerda para a direita.  
 * Em seguida conclua qual dos animais seguintes foi escolhido, 
 * através das três palavras fornecidas.
*/
public class Exercicio1049 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    String tipo1, tipo2, tipo3;
	    
	    tipo1 = scan.nextLine();
	    tipo2 = scan.nextLine();
	    tipo3 = scan.nextLine();
	    
	    if (tipo1.equals("vertebrado")) {
	        if (tipo2.equals("ave")) {
	            if (tipo3.equals("carnivoro")) 
	                System.out.println("aguia");
	            else 
	                System.out.println("pomba");
	        } else {
	            if (tipo3.equals("onivoro"))
	                System.out.println("homem");
	            else 
	                System.out.println("vaca");
	        }
	    } else {
	        if (tipo2.equals("inseto")) {
	            if (tipo3.equals("hematofago")) 
	                System.out.println("pulga");
	            else 
	                System.out.println("lagarta");
	        } else {
	            if (tipo3.equals("hematofago"))
	                System.out.println("sanguessuga");
	            else 
	                System.out.println("minhoca");
	        }
	    }
	    scan.close();
	}
}
