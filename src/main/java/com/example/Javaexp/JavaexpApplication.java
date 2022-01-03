package com.example.Javaexp;

import java.util.Scanner;


public class JavaexpApplication {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		ConfigMatrix configMatrix = new ConfigMatrix();
		CalculateMAtrix calculateMAtrix = new CalculateMAtrix();
		PrintMatrix printMatrix = new PrintMatrix();
		int r, c;
		r = configMatrix.getRow();
		c = configMatrix.getColum();
		int x [] [] = calculateMAtrix.generateRandomMatrix(r, c);
		int y [] [] = calculateMAtrix.generateRandomMatrix(r, c);

		printMatrix.printMatrix(x,r,c);
		System.out.print("\n");
		printMatrix.printMatrix(y,r,c);
		System.out.print("\n");

	}

}
