package beecrowd.exercicios;

import java.util.Scanner;

/*Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade 
 * constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.
Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, 
ou seja, consegue se afastar um quilômetro a cada 2 minutos.
Leia a distância (em Km) e calcule quanto tempo leva (em minutos) 
para o carro Y tomar essa distância do outro carro.*/
public class Exercicio1016 {
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    int entrada;
	    int x = 60, y = 90;
	    
	    entrada = scan.nextInt();
	    
	    int diferencaVelocidade = y - x;
	    int minutos = ((entrada * 60) / diferencaVelocidade);
	    
		System.out.println(minutos + " minutos");
		
		scan.close();
	}
}
