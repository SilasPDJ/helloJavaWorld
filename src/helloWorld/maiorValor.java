
package helloWorld;

import java.util.Scanner;

public class maiorValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maior;
		int menor;
		int posi_maior;
		int posi_menor;

		posi_maior = 0;
		posi_menor = 0;

		int i;
		Scanner ent = new Scanner(System.in);
		int[] vet = new int[6];
		maior = 0;
		menor = 0;

		for (i = 0; i < vet.length; i++) {
			System.out.println("Digite valor de [" + i + "]: ");
			vet[i] = ent.nextInt();
		}

		// Check maior e menor valor
		System.out.println("O vetor e: ");
		for (i = 0; i < vet.length; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
				posi_maior = i;
			} else if (vet[i] < menor) {
				menor = vet[i];
				posi_menor = i;
			}
			System.out.printf("%4d", vet[i]);
		}

		System.out.println("\n\nO maior valor é o " + maior);

	}

}
