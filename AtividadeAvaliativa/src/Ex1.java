/*Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) 
 * de 10 pessoas. Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.
 */

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] altura = new double[10];
		double maior = 0, menor = 999999999, total = 0;
		int m = 0, h = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite a sua altura: ");
			altura[i] = sc.nextDouble();
			System.out.print("Insira seu sexo (H homem, M mulher): ");
			char sexo = sc.next().charAt(0);

			if (altura[i] <= menor) {
				menor = altura[i];
			}
			if (altura[i] >= maior) {
				maior = altura[i];
			}
			if (sexo == 'H' || sexo == 'h') {
				total = altura[i] + total;
				h++;
			}
			if (sexo == 'M' || sexo == 'm') {
				m++;
			}
		}

		System.out.println("A maior altura é: " + maior + "\nA menor altura é: " + menor);
		System.out.printf("Média da altura dos homens %.2f: ", total / h);
		System.out.print("\nQuantidade de mulheres: " + m);

		sc.close();

	}

}
