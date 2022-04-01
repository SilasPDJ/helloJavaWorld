package helloWorld;

import java.util.Scanner;

public class VetorInicial {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		int i;
		Scanner scan = new Scanner(System.in);
		for (i = 0; i < vetor.length; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = scan.nextInt();
		}
		int somaPositivo = 0, somaNegativo = 0;
		int contaPositivo = 0, contaNegativo = 0;
		for (int j : vetor) {

			if (j >= 0) {
				somaPositivo += j;
				contaPositivo++;
			} else {
				somaNegativo += j;
				contaNegativo++;
			}
		}
		System.out.println("A soma de nums positivos é " + somaPositivo);
		System.out.println("A soma de nums negativos é " + somaNegativo);
		System.out.println("Quantidade positivos é: " + contaPositivo);
		System.out.println("Quantidade negativos é: " + contaNegativo);
	}

	private static void ex4() {
		double[] salarios = new double[8];
		int i;
		double acrescimo, porc, salarioReajustado;
		Scanner ent = new Scanner(System.in);

		for (i = 0; i < salarios.length; i++) {
			System.out.print("Digite um salário: ");
			salarios[i] = ent.nextDouble();
		}

		porc = 0.12;
		for (i = 0; i < salarios.length; i++) {
			acrescimo = salarios[i] * porc;

			salarioReajustado = salarios[i] + acrescimo;
			System.out.println("Salarío anterior = " + salarios[i] + " Salário atual = " + salarioReajustado);
		}

	}

	private static void ex3() {

		Scanner ent = new Scanner(System.in);
		int i; // i serão os índices do vetor
		int contapar = 0, contaimpar = 0;
		int v[] = new int[10];
		System.out.println("Pares e ímpares de um Vetor v, de 10 inteiros...");
		System.out.println("Leitura do vetor v:");
		for (i = 0; i < v.length; i++) {
			System.out.println("Digite v[" + i + "]:");
			v[i] = ent.nextInt();// Leitura via nextInt
			if (v[i] % 2 == 0) {
				contapar++;
			} else {
				contaimpar++;
			}
		}
		System.out.println("Vetor - Quem é Par ou quem é Ímpar:");
		if (contapar > 0) {
			System.out.println("Há " + contapar + " números pares no vetor: ");
			for (i = 0; i < v.length; i++) {
				if (v[i] % 2 == 0) {
					System.out.printf("%4d", v[i]);
				}
			}
		} else {
			System.out.println("\n\nNão há números pares no vetor...");
		}
		if (contaimpar > 0) {
			System.out.println("Há " + contaimpar + " números ímpares no vetor: ");
			for (i = 0; i < v.length; i++) {
				if (v[i] % 2 != 0) {
					System.out.printf("%4d", v[i]);
				}
			}
		} else {
			System.out.println("\n\nNão há números ímpares no vetor...");
		}

	}

	private static void ex2() {
		// TODO Auto-generated method stub
		//
		Scanner ent = new Scanner(System.in);
		int vetor[] = getVector(12);
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = ent.nextInt();
		}

		int valor = 0;
		for (int val : vetor) {
			if (val % 2 == 0) {
				System.out.printf("%4d", val);

			}
		}
		System.out.println("");

		for (int i = 0; i < vetor.length; i++) {
			valor = vetor[i];
			System.out.print(valor + " ");
			if (valor % 2 == 0) {
				System.out.println("PAR!");
			} else {
				System.out.println("ÍMPAR!");
			}
		}
		ent.close();
	}

	private static int[] getVector(int tam) {
		return new int[tam];
	}

	private static void hello() {
		Scanner ent = new Scanner(System.in);
		int i;
		int v[] = new int[10];
		for (i = 0; i < v.length; i++) {
			System.out.println("Digite v[" + i + "]");
			v[i] = ent.nextInt();

		}
		System.out.println("Impressão de um ");
		for (i = 0; i < v.length; i++) {
			System.out.printf("%d\t", v[i]);
		}
		ent.close();
	}

}
