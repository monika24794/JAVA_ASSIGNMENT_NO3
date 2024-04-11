package javaassignment3;

public class TestMatix {

	public static void main(String[] args) {
	 Matrix matrix =new Matrix(3, 3);
	 matrix.setElement(0, 0, 1);
	 matrix.setElement(0, 1, 2);
	 matrix.setElement(0, 2, 3);
	 matrix.setElement(1, 0, 4);
	 matrix.setElement(1, 1, 5);
	 matrix.setElement(1, 2, 6);
	 matrix.setElement(2, 0, 7);
	 matrix.setElement(2, 1, 8);
	 matrix.setElement(2, 2, 9);
	 Matrix matrix1 =new Matrix(3, 3);
	 matrix1.setElement(0, 0, 1);
	 matrix1.setElement(0, 1, 2);
	 matrix1.setElement(0, 2, 3);
	 matrix1.setElement(1, 0, 4);
	 matrix1.setElement(1, 1, 5);
	 matrix1.setElement(1, 2, 6);
	 matrix1.setElement(2, 0, 7);
	 matrix1.setElement(2, 1, 8);
	 matrix1.setElement(2, 2, 9);
	 matrix1 .add(matrix, matrix1);
	 System.out.println(matrix1);
	 

	}

}
