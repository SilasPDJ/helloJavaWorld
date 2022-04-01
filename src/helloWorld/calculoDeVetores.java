package helloWorld;

import java.util.Random;

public class calculoDeVetores {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// Scanner ent = new Scanner(System.in);
		Random random = new Random();

		int A[] = new int[10];

		int[] B = new int[10];
		int[] C = new int[10];
		int i;

		for (i = 0; i < C.length; i++) {
			A[i] = random.nextInt(-10, 10);
			B[i] = random.nextInt(-10, 10);

			C[i] = A[i] * B[i];
		}

		System.out.println("Array A: ");
		printArray(A);
		System.out.println("Array B: ");
		printArray(B);
		System.out.println("Array C: ");
		printArray(C);
	}

	private static void printArray(int[] array) {
		int i;
		for (i = 0; i < array.length; i++) {
			System.out.printf("%4d ", array[i]);
		}
		System.out.println("\n");
	}
}
