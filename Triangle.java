package javaassignment3;

public class Triangle {
	int side1;
	int side2;
	int side3;

	Triangle() {
		side1 = 3;
		side2 = 4;
		side3 = 5;
	}

	int calArea() {
		return (side1 * side2) / 2;
	}

	int calPeri() {
		return (side1 + side2 + side3);
	}

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		System.out.println(triangle.calArea());
		System.out.println(triangle.calPeri());
	}

}
