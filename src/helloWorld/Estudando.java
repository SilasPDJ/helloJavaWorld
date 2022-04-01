package helloWorld;

public class Estudando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] V1 = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };

		int[] V2 = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };
		int i;
		int[] V3 = new int[10];

		for (i = 0; i < V1.length; i++) {
			if (V1[i] > V2[i]) {
				V3[i] = 2 * V1[i] + V2[i];
			} else if (V1[i] < V2[i]) {
				V3[i] = 2 * V2[i] + V1[i];
			} else {
				V3[i] = 2 * (V1[i] + V2[i]);
			}
		}

		printArray(V3);
		// aux = A
		// S

	}

	private static void printArray(int[] array) {
		int i;
		for (i = 0; i < array.length; i++) {
			System.out.printf("%1d ", array[i]);
		}
		System.out.println("\n");
	}

}
