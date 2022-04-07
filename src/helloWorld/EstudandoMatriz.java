package helloWorld;

import java.util.Random;

public class EstudandoMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] bingo = criaCartelaBingo(5, 5, 1, 99);
		int i, j;
		for (i = 0; i < bingo.length; i++) {
			for (j = 0; j < bingo[0].length; j++) {
				System.out.printf("%4d", bingo[i][j]);
			}
			System.out.println("");
		}
	}

	protected static int[][] criaCartelaBingo(int m, int n, int valMin, int valMax) {
		/*
		 * m: lines number n: columns number valMin: random minimum value valMax: random
		 * maximum value
		 */
		int numRows, numCols;
		int i, j;
		int val, contArr;
		int[] valoresContidos = new int[m * n];
		Random random = new Random();
		int[][] matriz2d = new int[m][n];
		numRows = matriz2d.length;
		numCols = matriz2d[0].length;

		contArr = 0;
		for (i = 0; i < numRows; i++) {
			for (j = 0; j < numCols; j++) {
				val = random.nextInt(valMin, valMax);

				for (int vInArr : valoresContidos) {
					while (val == vInArr) {
						val = random.nextInt(valMin, valMax);
					}
				}
				matriz2d[i][j] = val;
				valoresContidos[contArr] = val;

				contArr++;
			}
		}

		return matriz2d;
	}// ...
}
