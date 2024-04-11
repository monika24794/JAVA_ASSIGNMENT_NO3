//Create a class called &#39;Matrix&#39; containing constructor that initializes the number
//of rows and number of columns of a new Matrix object. The Matrix class has the
//following information:
//a. number of rows of matrix
//b. number of columns of matrix
//c. elements of matrix in the form of 2D array
//The Matrix class has methods for each of the following:
//a. get the number of rows
//b. get the number of columns
//c. set the elements of the matrix at given position (i,j)
//d. adding two matrices. If the matrices are not addable, &quot;Matrices cannot be
//added&quot; will be displayed.

package javaassignment3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

 class Matrix {
	
	int row;
	int column;
	int[][] arr;
	Scanner sc = new Scanner(System.in);
	public Matrix(int r, int c) {
		row = r;
		column = c;
		arr = new int[row][column];
	}

	public int getRows() {
		return row;
	}
	public int getColumns() {
		return column;
	}
	public int getElement(int r, int c) 
	{
		return arr[r][c];
	}
	public void setElement(int r, int c, int element) 
	{
		arr[r][c] = element;
	}

	public static Matrix add(Matrix x, Matrix y)
	{
		if ((x.row == y.row) && (x.column == y.column))
		{
			Matrix m = new Matrix(x.row, x.column);
			for (int i = 0; i < m.row; i++) 
			{
				for (int j = 0; j < m.column; j++) 
				{
					m.setElement(i, j, (x.getElement(i, j) + y.getElement(i, j)));
				}
			}
			return m;
		} 
		else 
		{
			System.out.println("Matrices can not be added");
			return new Matrix(0, 0);
		}
	}

	@Override
	public String toString() {
		return "Matrix [row=" + row + ", column=" + column + ", arr=" + Arrays.toString(arr) + ", sc=" + sc
				+ ", getRows()=" + getRows() + ", getColumns()=" + getColumns() + "]";
	}
	
}