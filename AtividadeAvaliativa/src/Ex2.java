/*Criar um programa que calcule a média de salários de uma empresa, 
 * pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
 */

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double total = 0;
		
		System.out.print("Digite o número de funcionarios: ");
		int funcionarios = sc.nextInt();
		
		for(int i = 1; i <= funcionarios; i++) {
			System.out.print("Digite o salário do " + i + "° funcionario: ");
			double salario = sc.nextDouble();
			
			total = salario + total;
		}
		
		System.out.printf("Média dos salários dos funcionarios %.2f: ", total/funcionarios);
		
		sc.close();

	}

}
