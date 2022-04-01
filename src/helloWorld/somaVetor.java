package helloWorld;

import java.util.Scanner;

public class somaVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Scanner ent = new Scanner(System.in);
		int x, y;
		int i;

		// int vetor[] = {4, -7, 1, 12, 3, 10, -5, 8};
		int v[] = new int[8];
		for (i = 0; i < v.length; i++) {
			System.out.println("Digite v[" + i + "]:");
			v[i] = ent.nextInt();
		}

		x = -1;
		y = -1;

		while (x < 0 || x >= v.length) {
			System.out.print("Digite o valor de x: ");
			x = ent.nextInt();
		}
		while (y < 0 || y >= v.length) {
			System.out.print("Digite o valor de y: ");
			y = ent.nextInt();
		}
		int soma;

		soma = v[x] + v[y];
		System.out.printf("No vetor a soma dos valores v[%d]+v[%d] = %d+%d = %2d", x, y, v[x], v[y], soma);

		ent.nextInt();

	}

}
