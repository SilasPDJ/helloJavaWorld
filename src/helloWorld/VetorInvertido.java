package helloWorld;

import java.util.Scanner;

public class VetorInvertido {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		// vetor e matriz são estáticos (não muda tamanho)
		// listas, pilhas, filas são dinâmicos
		int i;
		int v[] = new int[6];

		System.out.println("Vetor v, de 6 elementos inteiros...");
		System.out.println("Leitura do vetor v:");
		for (i = 0; i < 6; i++) {
			System.out.println("Digite v[" + i + "]:");
			v[i] = ent.nextInt();
		}

		System.out.println("\n\nVetor Original: \n\n");
		for (i = 0; i < 6; i++) {
			System.out.printf("%3d", v[i]);
		}

		System.out.println("\n\nVetor Invertido: \n\n");
		for (i = v.length - 1; i >= 0; i--) {
			System.out.printf("%3d", v[i]);
		}
	}

}
