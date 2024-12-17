package beecrowd.exercicios;

import java.util.Scanner;

/*Leia um valor inteiro correspondente à idade de uma 
pessoa em dias e informe-a em anos, meses e dias
Obs.: apenas para facilitar o cálculo, considere todo ano 
com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma 
situação que permite 12 meses e alguns dias, como 360, 363 ou 364. 
Este é apenas um exercício com objetivo de testar raciocínio matemático simples.*/
public class Exercicio1020 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    int n, anos, meses, dias;
	    
	    
		n = scan.nextInt();
		anos = n / 365;
		meses = (n % 365) / 30;
	    dias = (n % 365) % 30;
		
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", anos, meses, dias);
		
		scan.close();
	}
}
