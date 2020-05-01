package exercicios.matrizes;

import java.util.Scanner;

public class ExercicioFixacao {

	/**
	 * Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz de M linhas por N colunas contendo números inteiros,
	 * podendo haver repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para cada ocorrência de X, mostrar os valores à
	 * esquerda, acima, à direita e abaixo de X, quando houver, conforme exemplo.
	 * 
	 * Exemplo:
	 * 
	 * 3 4
	 * 10 8 15 12
	 * 21 11 23 8
	 * 14 5 13 19
	 * 8
	 * Position 0,1:
	 * Left: 10
	 * Right: 15
	 * Down: 11
	 * Position 1,3:
	 * Left: 23
	 * Up: 12
	 * Down: 19
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					int left = j - 1;
					if (left >= 0) {
						System.out.println("Left: " + mat[i][left]);
					}
					int right = j + 1;
					if (right < mat[i].length) {
						System.out.println("Right: " + mat[i][right]);
					}
					int up = i - 1;
					if (up >= 0) {
						System.out.println("Up: " + mat[up][j]);
					}
					int down = i + 1;
					if (down < mat.length) {
						System.out.println("Down: " + mat[down][j]);
					}
				}
			}
		}
		
		sc.close();
		
	}
	
}
