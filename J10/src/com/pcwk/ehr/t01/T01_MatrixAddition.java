package com.pcwk.ehr.t01;

public class T01_MatrixAddition {

	public static void main(String[] args) {
		// 두 개의 행렬
		int[][] matrix1 = { { 1, 2, 3 }, 
				            { 4, 5, 6 }, 
				            { 7, 8, 9 } };
		
		int[][] matrix2 = { { 9, 8, 7 }, 
				            { 6, 5, 4 }, 
				            { 3, 2, 1 } };

		// 결과 행렬 초기화
		int[][] result = new int[matrix1.length][matrix1[0].length];

		// 행렬 덧셈
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		// 결과 출력
		System.out.println("행렬1:");
		printMatrix(matrix1);
		System.out.println("행렬2:");
		printMatrix(matrix2);
		System.out.println("두 행렬의 합:");
		printMatrix(result);
	}

	// 행렬 출력 메서드
	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
