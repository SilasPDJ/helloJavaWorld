package helloWorld;

public class desafioPrePascoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex1(3);
		ex1(7);
		ex1(9);
		ex1(11);
		ex1(13);
		ex1(313);
		// ex1_5x5();
	}

	public static void ex1(int n) {
		int val;
		int i, j;
		int size;
//		n = 5;
		val = 0;

		// check-in before proceed
		if (n % 2 == 0) {
			throw new IllegalArgumentException("valor INVÁLIDO" + n + "Deve ser um número ÍMPAR");
		}

		int middlePos = (n - 1) / 2;

		int[][] caracol = new int[n][n];
		int fcontMax = getFcontRange(n);

		// INIT pt1
		size = 2;
		i = middlePos;
		for (j = i; j <= i + 1; j++) {
			val++;
			caracol[i][j] = val;
		}

		/* INIT pt2 */
		size++;
		i--;
		j = middlePos + 1;
		for (int c = 0; c < size; c++) {
			val++;
			caracol[i][j] = val;
			j--;

		}
		j++;
		for (int c = 0; c < size; c++) {
			caracol[i][j] = val;
			val++;
			i++;

		}
		/* INIT 2 */

		for (int fcont = 0; fcont <= fcontMax; fcont++) {
			if (n > 5 && fcont >= 1) { // checa se n > 5
				size++;
			} else if (fcont < 1) {
				size++;
			}

			////////// //////////////////

			i--;
			j++;
			for (int c = 1; c < size; c++) {
				try {
					caracol[i][j] = val;
					val++;
					j++;
				} catch (IndexOutOfBoundsException io) {

				}

			}
			if (val >= n * n) {
				break;
			}

			//
			j--;
			i--;
			for (int c = 1; c < size; c++) {
				caracol[i][j] = val;
				val++;
				i--;

			}
			////
			i++;
			j--;
			for (int c = 0; c < size; c++) {
				caracol[i][j] = val;
				val++;
				j--;

			}
			//
			size++;
			i++;
			j++;
			for (int c = 1; c < size; c++) {
				caracol[i][j] = val;
				val++;
				i++;
			}
			//
		}
		printMatriz2d(caracol);
	}

	private static int getFcontRange(int n) {
		if (n % 2 == 0) {
			return 0;
		}
		return n;

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

		separatorPrint("~", 5 * numCols);
	}

	protected static void separatorPrint(String sep, int qtd) {
		String repeated = new String(new char[qtd]).replace("\0", sep);
		System.out.println(repeated);
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
