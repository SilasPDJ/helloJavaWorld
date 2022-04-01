package helloWorld;

import java.util.Scanner;

// matriz M x N = M != N ==> matriz retangular
// matriz M x N = M = N ===> matriz quadrangular

// JOGOS DE DAMAS

public class __MATRIZES {
	static protected int i, j;
	static protected int mat[][] = new int[5][5];

	public static void main(String[] args) {

		/*
		 * Scanner ent = new Scanner(System.in);
		 * 
		 * System.out.println("Leitura e impressão de uma matriz de 5 x 5");
		 * System.out.println("Carregando a matriz de 5 x 5...");
		 * 
		 * for (i = 0; i < 5; i++) { for (j = 0; j < 5; j++) {
		 * System.out.print("Digite a matriz [" + i + "][" + j + "]: "); mat[i][j] =
		 * ent.nextInt();
		 * 
		 * } }
		 */
		imprimeDiagonalPrimaria();
		// impremeDiagonalSuperior();
		// imprimeDiagonalInferior();
		// somaMatrizes();

	}

	public static void imprimeDiagonalPrimaria() {
		System.out.println("Imprime diagonal primária: ");
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if (i == j) {
					System.out.printf("%4d", mat[i][j]);
				} else {
					System.out.printf("\t");
				}

			}
			System.out.println("\n");
		}
	}

	public static void naoImprimeDiagonal() {
		System.out.println("Impressão somente diagonal: ");

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if (i == j) {
					System.out.printf("\t");
				} else {

					System.out.printf("%d\t", mat[i][j]);
				}

			}
			System.out.println("\n");
		}
	}

	public static void impremeDiagonalSuperior() {
		System.out.println("Impressão diagonal superior: ");

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if (j > i) {
					System.out.printf("\t");
				} else {

					System.out.printf("%d\t", mat[i][j]);
				}

			}
			System.out.println("\n");
		}

	}

	public static void imprimeDiagonalInferior() {
		System.out.println("Impressão diagonal inferior: ");

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if (i > j) {
					System.out.printf("\t");
				} else {

					System.out.printf("%d\t", mat[i][j]);
				}

			}
			System.out.println("\n");
		}
	}

	public static void somaMatrizes() {
		int[][] A = leMatriz(5, 5);
		int[][] B = leMatriz(5, 5);

		int[][] C = new int[5][5];

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {

				C[i][j] = A[i][j] + B[i][j];
			}
		}

		// printa matriz C SOMA
		System.out.println("\nSoma matriz:");
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.printf("%4d", C[i][j]);
			}
			System.out.println("\n");
		}

	}

	private static int[][] leMatriz(int m, int n) {
		Scanner ent = new Scanner(System.in);

		int[][] matriz = new int[m][n];
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print("Digite a matriz [" + i + "][" + j + "]: ");
				matriz[i][j] = ent.nextInt();
			}
			System.out.println("");

		}
		return matriz;
	}
}
