package com.example.Javaexp;

import java.util.Random;

public class CalculateMAtrix {

    public int[][] generateRandomMatrix(int rowSize, int colSize) {

    Random r = new Random();
        int matrix [][] = new int[rowSize][colSize];

        for ( int i=0;  i< rowSize; i++ ) {
            for ( int j=0;  j<colSize;  j++) {
                matrix[i][j] = r.nextInt(40);
            }
        }
        return matrix;
    }
   public int[] [] sum( int [] [] x, int [] [] y) {
        int row = x.length;
       int colum = x[0].length;
       int[][] sum = new int[row][colum];
       for (int i = 0; i < row; i++) {
           for (int j = 0; j < colum; j++ ) {
               sum [i][j] = x[i][j] + y[i][j];
           }
       }
       return sum;

   }

}
