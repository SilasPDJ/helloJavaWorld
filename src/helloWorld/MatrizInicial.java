package helloWorld;

import java.util.Scanner;

// matriz M x N = M != N ==> matriz retangular
// matriz M x N = M = N ===> matriz quadrangular

public class MatrizInicial {

	public static void main(String[] args) {
		// matriz sim�trica � aquela que se coluna 1 virar linha 1 e FOR IGUAL �
		// sim�trica s� � sim�trica se for quadrangular
	}

	public static void aula1() {
		// TODO Auto-generated method stub
		int mat[][] = new int[5][5];
		Scanner ent = new Scanner(System.in);
		int i, j;

		System.out.println("Leitura e impress�o de uma matriz de 5 x 5");
		System.out.println("Carregando a matriz de 5 x 5...");

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print("Digite a matriz [" + i + "][" + j + "]: ");
				mat[i][j] = ent.nextInt();

			}
		}
		System.out.println("Impress�o: ");

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.printf("%4d", mat[i][j]);

			}
			System.out.println("\n");
		}
	}

}
