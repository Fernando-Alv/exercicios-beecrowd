package beecrowd.exercicios;

import java.util.Scanner;

/*Faça um programa que leia o nome de um vendedor, o seu salário fixo e 
 * o total de vendas efetuadas por ele no mês (em dinheiro). 
 * Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
 * informar o total a receber no final do mês, com duas casas decimais.*/
public class Exercicio1009 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String nome;
	    double salarioFixo;
	    double totalVendas;
	    
	    nome = scan.nextLine();
	    salarioFixo = scan.nextDouble();
	    totalVendas = scan.nextDouble();
	    
		System.out.printf("TOTAL = R$ %.2f\n", (salarioFixo + (totalVendas *= 0.15)));
		
		scan.close();
	}
}
