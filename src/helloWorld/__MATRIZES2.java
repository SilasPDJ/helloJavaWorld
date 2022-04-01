package helloWorld;

import java.util.Random;
import java.util.Scanner;

public class __MATRIZES2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ex8Aula();
		// ex9Aula();
		// desafio();
		saidera();
	}

	public static void saidera() {
		int[][] A = new int[20][20];
		Random gerador = new Random();
		int i, j;

		for (i = 0; i < 20; i++) {
			for (j = 0; j < 20; i++) {
				A[i][j] = gerador.nextInt(11);
			}
		}
		int[] somaLinhas = new int[20];

		// Faz soma
		for (i = 0; i < 20; i++) {
			for (j = 0; j < 20; i++) {
				somaLinhas[i] = A[i][j];
			}
		}

		// Display Soma
		for (i = 0; i < 20; i++) {
			System.out.printf("%5d", somaLinhas[i]);
		}
	}

	public static void desafio() {
		Scanner ent = new Scanner(System.in);
		int m, n;
		int i, j;

		m = 3;
		n = 3;

		int[][] matriz = new int[m][n];

		int[] vetorSoma = new int[m];

		System.out.println("DECLARA MATRIZ");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("Digite um número p/ matriz[" + i + "]" + "[" + j + "]: ");
				matriz[i][j] = ent.nextInt();
			}
		}

		// print
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.printf("%4d", matriz[i][j]);
			}
			System.out.println("");
		}

		// lógica
		for (i = 0; i < vetorSoma.length; i++) {
			vetorSoma[i] = 0;
		}
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				vetorSoma[j] += matriz[i][j];
			}
		}
		System.out.println("\nPrinta colunas");
		for (i = 0; i < vetorSoma.length; i++) {
			System.out.printf("%4d ", vetorSoma[i]);
		}

	}

	public static void ex9Aula() {
		// É SIMÉTRICA
		Scanner ent = new Scanner(System.in);
		int m, n;
		int i, j;

		m = 3;
		n = 3;
		int[][] matriz = new int[m][n];

		System.out.println("DECLARA MATRIZ");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("Digite um número p/ matriz[" + i + "]" + "[" + j + "]: ");
				matriz[i][j] = ent.nextInt();
			}
		}

		// Print
		// Algebra booleana 0 é verdadeiro
		boolean simetria = true;

		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.printf("%2d", matriz[i][j]);
			}
			System.out.println("");
		}
		// Logica checagem simestria
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				if (matriz[i][j] != matriz[j][i]) {
					simetria = false;
				}
			}
			System.out.println("");
		}
		if (simetria) {
			System.out.println("SIM, É SIMÉTRICA");
		} else
			System.out.println("NÃO, NÃO É simétrica");

		// Check transposition

	}

	public static void ex8Aula() {
		int m, n;
		m = 2;
		n = 3;

		int[][] A = new int[m][n];
		int[][] B = new int[n][m];

		System.out.println("Matriz normal");
		int cont = 1;
		// Matriz A
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				A[i][j] = cont;
				cont++;
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%2d", A[i][j]);
			}
			System.out.println("");
		}
		// Matriz B
		System.out.println("\nMatriz transposta\n");
		cont = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				B[i][j] = cont;
				cont++;
				System.out.printf("%2d", B[i][j]);
			}
			System.out.println("");
		}

	}
}
