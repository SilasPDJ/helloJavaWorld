package helloWorld;

import java.util.Arrays;
import java.util.Random;

public class Estudando {

	public static void main(String[] args) {
		int a = mult(5, 2348);
		System.out.println(a);
		getRandomArray(100, -100, 100, true);

	}

	public static int mult(int m, int n) {
		if (n >= 1) {
			return mult(m, n - 1) + m;
		} else {
			return 0;
		}
		// pra isso progrmaação recursiva:
		// metodos de ornação, busca, busca binária, registro de vetores
		// funcional == recursividade == programação matemático estatístico
		// for demora demais em quando em alto volume

		// emular repetição usando a recursividade
	}

	private static int printArray(int[] array, int arg) {
		int inf, sup, med;
		inf = 0;
		sup = array.length;
		while (inf <= sup) {
			med = (inf + sup) / 2; // div int
			if (arg == array[med])
				return med;
			else if (arg > array[med])
				inf = med + 1; // procura na 2a metade
			else if (arg < array[med])
				sup = med - 1; // procura na 1a metade
		}
	}

	private static void buscaBinaria(int[] arr, int val) {
//		BinaryOperator<T>
	}

	private static int[] getRandomArray(int tam, int min, int max, boolean ordered) {
		int i, r;
		int val;
		int[] arr = new int[tam];
		Random random = new Random();
		for (i = 0; i < arr.length; i++) {

			val = random.nextInt(min, max);
			while (arrayContains(arr, val)) {
				val = random.nextInt(min, max);
			}
			arr[i] = val;

		}
		if (ordered) {
			Arrays.sort(arr);
		}
		return arr;
	}

	private static boolean arrayContains(final int[] arr, final int key) {
		return Arrays.stream(arr).anyMatch(i -> i == key);
	}

}
