package helloWorld;

import java.util.Random;
import java.util.Scanner;

public class ListaDeExerciciosMatrizes {

	public static void main(String[] args) {
		// ex10();
		// ex8();
		// ex11();
		// ex13();
		// ex14();
		ex15();

	}

	public static void ex15() {
		// Os 5 alunos são 5 linhas, suas respostas são as colunas
		String answer4now, cod;
		char answr4n;
		cod = "abcdABCD1237890987654321";

		Scanner scanner = new Scanner(System.in);
		char[][] prova = new char[5][10];
//		char[] gabarito = new char[10];
		char[] gabarito = { 'A', 'C', 'D', 'B', 'C', 'B', 'B', 'D', 'A', 'C' };

		boolean answerIsCorrect;
		boolean answerIsInAbcd = false;

		// Fazendo a Avaliação (prova)
		for (int i = 0; i < prova.length; i++) {
			separatorPrint("~", 50);
			System.out.printf("Avaliação do aluno %02d: ", i + 1);
			separatorPrint("-", 25);
			System.out.println("\nDigite suas respostas para as questões: ");
			System.out.println("As respostas devem ser A, B, C ou D \n(é aceito MAIÚSCULO ou MINÚSCULO)");
			for (int j = 0; j < prova[0].length; j++) {
				answer4now = cod;
				while (answer4now.length() != 1 || !answerIsInAbcd) {
					if (answer4now != cod) {
						System.out.println("Resposta inválida. Tente novamente...");
						separatorPrint(".", 40);
					} else {
						separatorPrint("-", 40);
					}
					System.out.printf("Pergunta %02d: ", j + 1);
					answer4now = scanner.next();
					answerIsInAbcd = ex15AnswerIsAcceptable(answer4now);
				}
				answr4n = answer4now.toUpperCase().charAt(0);
				prova[i][j] = answr4n;
			}
			System.out.println();
		}

		// EMITE RESULTADO
		int[] resultado = new int[prova.length];
		int somaAcertos;
		for (int aluno = 0; aluno < prova.length; aluno++) {
			somaAcertos = 0;
			for (int questao = 0; questao < prova[0].length; questao++) {
				answerIsCorrect = prova[aluno][questao] == gabarito[questao];
				if (answerIsCorrect) {
					somaAcertos++;
				}
			}

			resultado[aluno] = somaAcertos;
		}

		printMatriz2d(prova);
		separatorPrint("~", 80);

		System.out.println(
				"O total de acertos dos " + prova.length + " alunos num total de " + prova[0].length + " questoes: ");
		for (int i = 0; i < resultado.length; i++) {
			System.out.printf("Acertos Aluno %02d: ", i + 1);
			System.out.println(resultado[i]);
		}
		separatorPrint("-", 40);
		System.out.println("O Gabarito é: ");
		for (int q = 0; q < gabarito.length; q++) {
			char alt = gabarito[q];
			System.out.printf("Alternativa %02d): %s", q + 1, alt);
			System.out.println("");
		}

	}

	protected static void separatorPrint(String sep, int qtd) {
		String repeated = new String(new char[qtd]).replace("\0", sep);
		System.out.println(repeated);
	}

	private static boolean ex15AnswerIsAcceptable(String resp) {
		char[] respostasAceitaveis = { 'A', 'B', 'C', 'D' };
		String respCompare;
		respCompare = resp.toUpperCase().strip();

		for (char ra : respostasAceitaveis) {
			// https://stackoverflow.com/questions/35666077/why-is-string-equals-not-working-in-my-code
			if (String.valueOf(ra).equals(respCompare)) {
				return true;
			}
		}
		return false;
	}

	private static void printMatriz2d(char[][] array2d) {
		int i, j, numCols, numRows;

		// matriz
		numRows = array2d.length;
		numCols = array2d[0].length;

		for (i = 0; i < numRows; i++) {
			for (j = 0; j < numCols; j++) {
				System.out.printf("%s\t", array2d[i][j]);
			}
			System.out.println("");
		}
	}

	public static void ex14() {
		int[][] bingo = criaCartelaBingo(5, 5, 0, 99 + 1);
		System.out.println("---- Gerador de cartela de bingo sem repetições ----");
		printMatriz2d(bingo);

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

	public static void ex13() {
		int[][] matriz2d = gerarMatriz2d(4, 4, 1, 20 + 1);
		int r, c;
		int numRows, numCols;

		numRows = matriz2d.length;
		numCols = matriz2d[0].length;

		System.out.println("------ Matriz principal ------");
		printMatriz2d(matriz2d);
		System.out.println("------ Matriz triangular inferior ------");

		for (r = 0; r < numRows; r++) {
			for (c = 0; c < numCols; c++) {
				if (c > r) {
					matriz2d[r][c] = 0;
				}
			}
		}
		printMatriz2d(matriz2d);

	}// ...

	public static void ex12() {
		int[][] matriz2d = gerarMatriz2d(3, 3, -10, 21);
		System.out.println(" Uma matriz é conhecida como simétrica quando ela é igual à sua matriz transposta");
		System.out.println("matriz[m][n], se m == n, então é matriz simétrica");
		printMatriz2d(matriz2d);
		System.out.println("3x3 é simétrico!");

	}// ...

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
		numRows = mat.length;
		numCols = mat[0].length;

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
		int numRows, numCols;
		numRows = mat.length;
		numCols = mat[0].length;

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
		int numRows, numCols;
		numRows = mat.length;
		numCols = mat[0].length;

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
		int numRows, numCols;
		numRows = mat.length;
		numCols = mat[0].length;

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
		int m, n;
		m = 10;
		n = 10;

		int i, j;
		Random random = new Random();
		int[][] aA = new int[m][n];

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
		numRows = matriz2d.length;
		numCols = matriz2d[0].length;

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
		numRows = matriz2d.length;
		numCols = matriz2d[0].length;

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
		numRows = array2d.length;
		numCols = array2d[0].length;

		for (i = 0; i < numRows; i++) {
			for (j = 0; j < numCols; j++) {
				System.out.printf("%4d ", array2d[i][j]);
			}
			System.out.println("");
		}
	}

}
