package helloWorld;

public class desafioPrePascoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex1(5);
		System.out.println("");
		System.out.println("");
		ex1(7);
		System.out.println("");
		System.out.println("");
		ex1(9);
		// ex1_5x5();
	}

	public static void ex1(int n) {
		int val;
		int i, j;
		int cont;
//		n = 5;
		val = 0;
		int metade = (n - 1) / 2;

		int[][] caracol = new int[n][n];

		// INIT pt1
		cont = 2;
		i = metade;
		for (j = i; j <= i + 1; j++) {
			val++;
			caracol[i][j] = val;
		}

		/* INIT pt2 */
		cont++;
		i--;
		j = metade + 1;
		for (int c = 0; c < cont; c++) {
			val++;
			caracol[i][j] = val;
			j--;

		}
		j++;
		for (int c = 0; c < cont; c++) {
			caracol[i][j] = val;
			val++;
			i++;

		}
		/* INIT 2 */
		for (int ccc = 0; ccc <= 3; ccc++) {
			if (n > 5 && ccc >= 1) { // checa se n > 5
				cont++;
			} else if (ccc < 1) {
				cont++;
			}

			////////// //////////////////

			i--;
			j++;
			for (int c = 1; c < cont; c++) {
				try {
					caracol[i][j] = val;
					val++;
					j++;
				} catch (IndexOutOfBoundsException io) {

				}

			}
			if (n == 5 && ccc == 1) { // TODO: diminuir esses ifs
				break;
			}
			if (n == 7 && ccc == 2) {
				break;
			}
			if (n == 9 && ccc == 3) {
				break;
			}

			//
			j--;
			i--;
			for (int c = 1; c < cont; c++) {
				caracol[i][j] = val;
				val++;
				i--;

			}
			////
			i++;
			j--;
			for (int c = 0; c < cont; c++) {
				caracol[i][j] = val;
				val++;
				j--;

			}
			//
			cont++;
			i++;
			j++;
			for (int c = 1; c < cont; c++) {
				caracol[i][j] = val;
				val++;
				i++;
			}
			//
		}
		printMatriz2d(caracol);
	}

	public static void ex1Init(int n) {
		int val;
		int i, j;
		int cont;
//		n = 5;
		val = 0;
		int metade = (n - 1) / 2;

		int[][] caracol = new int[n][n];

		// init
		cont = 2;
		i = metade;
		for (j = i; j <= i + 1; j++) {
			val++;
			caracol[i][j] = val;
		}

		// partes juntas abaixo
		cont++;
		i--;
		j = metade + 1;
		for (int c = 0; c < cont; c++) {
			val++;
			caracol[i][j] = val;
			j--;

		}
		j++;

		for (int c = 0; c < cont; c++) {
			caracol[i][j] = val;
			val++;
			i++;

		}

		////////// //////////////////
		cont++;

		i--;
		j++;
		for (int c = 1; c < cont; c++) {
			caracol[i][j] = val;
			val++;
			j++;

		}
		j--;
		i--;
		for (int c = 1; c < cont; c++) {
			caracol[i][j] = val;
			val++;
			i--;

		}
		i++;
		j--;
		for (int c = 0; c < cont; c++) {
			caracol[i][j] = val;
			val++;
			j--;

		}

		cont++;
		i++;
		j++;
		for (int c = 1; c < cont; c++) {
			caracol[i][j] = val;
			val++;
			i++;

		}

		i--;
		j++;
		for (int c = 1; c < cont; c++) {
			caracol[i][j] = val;
			val++;
			j++;

		}

		// parei daqui

		printMatriz2d(caracol);
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

// 2,2    /2
// 2,3   
// 1,3
// 1,2   / 3
// 1,1

// 2,1   / 3

// 3,1
// 3,2 /// 3
// 3,3

// 3,4  ///// 4
// 2,4
// 1,4
// 0,4
// 0,3
// 0,2 ////// 4
// 0,1
//0,0
//1,0  // 5
//2,0
//3,0
//4,0
//4,1
//4,2 //// 5
//4,3
//4,4
