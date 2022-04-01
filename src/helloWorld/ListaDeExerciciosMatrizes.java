package helloWorld;

import java.util.Random;
import java.util.Scanner;

public class ListaDeExerciciosMatrizes {

	public static void main(String[] args) {
		// ex7();
		// ex8();
		ex10();
		// ex11();
	}

	public static void ex11() {
		int[][] matriz2d = gerarMatriz2d(3, 3, -10, 21);
		int soma;
		System.out.println("--- Matriz completa ---");
		printMatriz2d(matriz2d);
		System.out.println("------------------------------------------------------------------");
		soma = calcSomaDiagSecundaria(matriz2d);
		System.out.printf("\n\nA soma é %d", soma);
	}

	public static int calcSomaDiagSecundaria(int[][] mat) {
		int i, j, soma;
		int numCols, numRows;
		int contJ;
		numCols = mat.length;
		numRows = mat[0].length;

		contJ = numCols - 1;
		soma = 0;
		System.out.println("Calcula soma dos elementos que estão na diagonal secundária");
		for (i = 0; i < numRows; i++) {
			for (j = contJ; j >= 0;) {

				System.out.printf("%2d\t", mat[i][j]);
				contJ--;
				soma += mat[i][j];
				break;

			}
		}
		return soma;
	}// ...

	public static void ex10() {
		int[][] matriz2d = gerarMatriz2d(3, 3, -10, 21);
		int soma;
		System.out.println("--- Matriz completa ---");
		printMatriz2d(matriz2d);
		System.out.println("------------------------------------------------------------------");
		soma = calcSomaDiagPrincipal(matriz2d);
		System.out.printf("\n\nA soma é %d", soma);
	}

	public static int calcSomaDiagPrincipal(int[][] mat) {
		int i, j, soma;
		int numCols, numRows;
		numCols = mat.length;
		numRows = mat[0].length;

		soma = 0;
		System.out.println("Calcula soma dos elementos que estão na diagonal principal");
		for (i = 0; i < numRows; i++) {
			for (j = 0; j < numCols; j++) {

				if (i == j) {
					System.out.printf("%2d\t", mat[i][j]);
					soma += mat[i][j];
				}
			}
		}

		return soma;
	}// ...

	public static void ex9() {
		int[][] matriz2d = gerarMatriz2d(3, 3, -10, 21);
		int soma;
		System.out.println("--- Matriz completa ---");
		printMatriz2d(matriz2d);
		System.out.println("------------------------------------------------------------------");
		soma = calcSomaAbaixoDiagPrincipal(matriz2d);
		System.out.printf("\n\nA soma é %d", soma);
	}

	public static int calcSomaAbaixoDiagPrincipal(int[][] mat) {
		int i, j, soma;
		int numCols, numRows;
		numCols = mat.length;
		numRows = mat[0].length;

		soma = 0;
		System.out.println("Calcula soma dos elementos que estão abaixo da diagonal principal");
		for (i = 0; i < numRows; i++) {
			for (j = 0; j < numCols; j++) {

				if (j < i) {
					System.out.printf("%2d\t", mat[i][j]);
					soma += mat[i][j];
				}
			}
		}

		return soma;
	}// ...

	public static void ex8() {
		int[][] matriz2d = gerarMatriz2d(3, 3, -10, 11);
		int soma;
		System.out.println("--- Matriz completa ---");
		printMatriz2d(matriz2d);
		System.out.println("------------------------------------------------------------------");
		soma = calcSomaAcimaDiagPrincipal(matriz2d);
		System.out.printf("\n\nA soma é %d", soma);

	}

	public static int calcSomaAcimaDiagPrincipal(int[][] mat) {
		int i, j, soma;
		int numCols, numRows;
		numCols = mat.length;
		numRows = mat[0].length;

		soma = 0;
		System.out.println("Calcula soma dos elementos que estão acima da diagonal principal");
		for (i = 0; i < numRows; i++) {
			for (j = 0; j < numCols; j++) {

				if (j > i) {
					System.out.printf("%2d\t", mat[i][j]);
					soma += mat[i][j];
				}
			}
		}

		return soma;
	}// ...

	public static void ex7() {
		int numCols, numRows;
		int m, n;
		m = 10;
		n = 10;

		int i, j;
		Random random = new Random();
		int[][] aA = new int[m][n];
		numCols = aA.length;
		numRows = aA[0].length;

		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				if (i < j) {
					aA[i][j] = 2 * i + 7 * j - 2;
				} else if (i == j) {
					aA[i][j] = (int) (3 * Math.pow(i, 2) - 1);
				} else if (i > j) {
					aA[i][j] = (int) (4 * Math.pow(i, 3) - 5 * Math.pow(j, 2) + 1);
				}
			}
		}
		printMatriz2d(aA);
	} // ...

	public static void ex6() {
		// métodos utilizados em exs anteriores
		int cow, rol;
		int m = 4, n = 4;
		boolean AgreaterB, BgreaterA;

		int[][] A = gerarMatriz2d(m, n, -10, 11);
		int[][] B = gerarMatriz2d(m, n, -10, 11);
		int[][] greaterArr2d = new int[m][n];

		// Calculate greater value
		for (rol = 0; rol < m; rol++) {
			for (cow = 0; cow < n; cow++) {
				AgreaterB = A[rol][cow] > B[rol][cow];
				BgreaterA = B[rol][cow] > A[rol][cow];
				if (AgreaterB && !BgreaterA) {
					greaterArr2d[rol][cow] = A[rol][cow];
				} else if (BgreaterA && !AgreaterB) {
					greaterArr2d[rol][cow] = B[rol][cow];

				} else {
					// they're equals
					greaterArr2d[rol][cow] = A[rol][cow]; // tanto faz
				}
			}
		}

		System.out.println("------------------- Matriz A: -------------------");
		printMatriz2d(A);
		System.out.println("------------------- Matriz B: -------------------");
		printMatriz2d(B);
		System.out.println("------------ Maior valor entre A e B ------------");
		printMatriz2d(greaterArr2d);
	} // ...}

	public static void ex5() {
		// Encontra valor
		Scanner Ent = new Scanner(System.in);
		int qtd, i;
		int r, c; // row, col
		int m, n; // positions...
		int[][] matriz2d = gerarMatriz2d(4, 4, -10, 20);
		boolean temNaMatriz;
		int searched;
		printMatriz2d(matriz2d);
		System.out.print("Digite a quantidade de elementos a procurar [0 para sair]: ");
		qtd = Ent.nextInt();

		if (qtd < 0) {
			qtd *= -1;
			System.out.println("-----------------------------------");
			System.out.println("Número invalido, deve ser positivo");
			System.out.println("Corrigido para: " + qtd);
			System.out.println("-----------------------------------");
		}

		if (qtd != 0) {
			for (i = 0; i < qtd; i++) {
				temNaMatriz = false;
				System.out.printf("digite o valor a buscar [%02d]: ", i + 1);
				searched = Ent.nextInt();
				for (r = 0; r < matriz2d.length; r++) {
					for (c = 0; c < matriz2d[0].length; c++) {
						if (matriz2d[r][c] == searched) {
							System.out.printf("Valor %2d encontrado na matriz 2D [%d][%d]\n", matriz2d[r][c], r, c);
							temNaMatriz = true;
						}
					}
				}
				if (!temNaMatriz) {
					System.out.println("------------------------------------------");
					System.out.println("Número " + searched + " NÃO foi encontrado na matriz 2D");
					System.out.println("-----------------------------------------");
				}
				System.out.println("");
			}
		}
		System.out.println("FIM!");

	}// ...

	public static void ex4() {
		// Retorna maior valor
		int r, c; // row, col
		int[][] matriz2d = gerarMatriz2d(4, 4, -10, 20);

		int maior = 0;
		int posMaiorM = 0, posMaiorN = 0;
		for (r = 0; r < matriz2d.length; r++) {
			for (c = 0; c < matriz2d[0].length; c++) {
				if (matriz2d[r][c] > maior) {
					maior = matriz2d[r][c];
					posMaiorM = r;
					posMaiorN = c;
				}
			}
		}
		System.out.println("---Mostra matriz 2D---");
		printMatriz2d(matriz2d);

		System.out.printf("\nO maior valor é %2d, que se encontra em matriz2d[%d][%d]", maior, posMaiorM, posMaiorN);
		// ...
	}// ...

	public static void ex3() {
		int r, c;

		int[][] matriz2d = new int[4][4];

		for (r = 0; r < matriz2d.length; r++) {
			for (c = 0; c < matriz2d[0].length; c++) {
				matriz2d[r][c] = c * r;
			}
		}
		System.out.println("---- Matriz L * C ----");
		printMatriz2d(matriz2d);

		// ...
		// ...
	}

	public static void ex2() {
		int i, j;
		int[][] mat = new int[5][5];

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if (i == j) {
					mat[i][j] = 1;
				} else
					mat[i][j] = 0;
			}
		}
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {

				System.out.printf("%2d", mat[i][j]);

			}
			System.out.println("\n");
		}
	};

	public static void ex1() {
		int numCols, numRows;
		int m, n;

		final int DEZ = 10;

		int[][] matriz2d = gerarMatriz2d(4, 4, 0, 20);
		numCols = matriz2d.length;
		numRows = matriz2d[0].length;

		System.out.println("Mostra matriz: ");
		printMatriz2d(matriz2d);

		int valint, contmaiorQdez;

		// create array with values greater than DEZ
		contmaiorQdez = 0;
		int[] maiorQueDEZ = new int[numCols * numRows];
		for (m = 0; m < numCols; m++) {
			for (n = 0; n < numRows; n++) {
				valint = matriz2d[m][n];
				if (valint > DEZ) {
					maiorQueDEZ[contmaiorQdez] = valint;
					contmaiorQdez++;
				}
			}
		}
		System.out.println("Os seguintes valores são > 10 (maiores que 10): ");
		for (int val : maiorQueDEZ) {
			if (val < DEZ) {
				break;
			}
			System.out.printf("%4d", val);
		}
		System.out.println("\n");
		System.out.printf("Representam %2d valores\nnum total de %2d \nda matriz 2D", contmaiorQdez, numCols * numRows);

	}

	protected static int[][] gerarMatriz2d(int m, int n, int valMin, int valMax) {
		/*
		 * m: lines number n: columns number valMin: random minimum value valMax: random
		 * maximum value
		 */
		int numRows, numCols;
		int i, j;
		Random random = new Random();
		int[][] matriz2d = new int[m][n];
		numRows = matriz2d[0].length;
		numCols = matriz2d.length;

		for (i = 0; i < numRows; i++) {
			for (j = 0; j < numCols; j++) {
				matriz2d[i][j] = random.nextInt(valMin, valMax);
			}
		}

		return matriz2d;
	}

	private static void printMatriz2d(int[][] array2d) {
		int i, j, numCols, numRows;

		// matriz
		numRows = array2d[0].length;
		numCols = array2d.length;

		for (i = 0; i < numRows; i++) {
			for (j = 0; j < numCols; j++) {
				System.out.printf("%4d ", array2d[i][j]);
			}
			System.out.println("");
		}
	}

}
