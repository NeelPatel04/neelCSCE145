//Neel Patel

import java.util.Scanner;

public class Lab04 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Welcome to the matrix adder program!");

		//Ask for the dimensions of the first matrix
		System.out.println("Please enter length and width of the first matrix.");
		int row1 = k.nextInt();
		int col1 = k.nextInt();
		int[][] m1 = new int[row1][col1];

		for(int i = 0; i < row1; i++) {
			for(int j = 0; j < col1; j++) {
				System.out.println("Enter value at index " + i + " " + j + ":");
				m1[i][j] = k.nextInt();
			}
		}
		//Ask for the dimensions of the second matrix
		System.out.println("Please enter length and width of the second matrix.");
		int row2 = k.nextInt();
		int col2 = k.nextInt();
		int[][] m2 = new int [row2][col2];

		for(int i = 0; i < row2; i++) {
			for(int j = 0; j < col2; j++) {
				System.out.println("Enter value at index " + i + " " + j + ":");
				m2[i][j] = k.nextInt();
			}
		}

		//Create new matrix to store the sum of the two matrices
		int[][] sumM = new int[row1][col1];
		for(int i = 0; i < row1; i++) {
			for(int j = 0; j < col1; j++) {
				sumM[i][j] = m1[i][j] + m2[i][j];
			}		
		}

		//Display matrices and their sum
		System.out.println("Matrix 1:");
		displayMatrix(m1);
		System.out.println("+");
		System.out.println("Matrix 2:");
		displayMatrix(m2);
		System.out.println("Results = :");
		displayMatrix(sumM);

	}

	//Method to display a matrix in row-column format
	public static void displayMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
}
