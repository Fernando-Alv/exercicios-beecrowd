package beecrowd.exercicios;

import java.util.Scanner;

/*A empresa ABC resolveu conceder um aumento de salários a seus 
 * funcionários de acordo com a tabela abaixo:
Salário	Percentual de Reajuste
0 - 400.00
400.01 - 800.00
800.01 - 1200.00
1200.01 - 2000.00
Acima de 2000.00

15%
12%
10%
7%
4%

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o 
valor de reajuste ganho e o índice reajustado, em percentual.*/
public class Exercicio1048 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double salario, salarioReajustado, aumento, percentual;
        
        salario = scan.nextDouble();
        
        if (salario >= 0 && salario <= 400) {
            percentual = 0.15;
            salarioReajustado = salario + (percentual * salario);
            aumento = salario * percentual;
            percentual *= 100;
            
            System.out.printf("Novo salario: %.2f\n", salarioReajustado);
            System.out.printf("Reajuste ganho: %.2f\n", aumento);
            System.out.printf("Em percentual: %.0f %%\n", percentual);
            
        } else if (salario > 400 && salario <= 800) {
            percentual = 0.12;
            salarioReajustado = salario + (percentual * salario);
            aumento = salario * percentual;
            percentual *= 100;
            
            System.out.printf("Novo salario: %.2f\n", salarioReajustado);
            System.out.printf("Reajuste ganho: %.2f\n", aumento);
            System.out.printf("Em percentual: %.0f %%\n", percentual);
            
        } else if (salario > 800 && salario <= 1200) {
            percentual = 0.1;
            salarioReajustado = salario + (percentual * salario);
            aumento = salario * percentual;
            percentual *= 100;
            
            System.out.printf("Novo salario: %.2f\n", salarioReajustado);
            System.out.printf("Reajuste ganho: %.2f\n", aumento);
            System.out.printf("Em percentual: %.0f %%\n", percentual);
            
        } else if (salario > 1200 && salario <= 2000) {
            percentual = 0.07;
            salarioReajustado = salario + (percentual * salario);
            aumento = salario * percentual;
            percentual *= 100;
            
            System.out.printf("Novo salario: %.2f\n", salarioReajustado);
            System.out.printf("Reajuste ganho: %.2f\n", aumento);
            System.out.printf("Em percentual: %.0f %%\n", percentual);
            
        } else if (salario > 2000) {
            percentual = 0.04;
            salarioReajustado = salario + (percentual * salario);
            aumento = salario * percentual;
            percentual *= 100;
            
            System.out.printf("Novo salario: %.2f\n", salarioReajustado);
            System.out.printf("Reajuste ganho: %.2f\n", aumento);
            System.out.printf("Em percentual: %.0f %%\n", percentual);
        }
        scan.close();
    }
}
