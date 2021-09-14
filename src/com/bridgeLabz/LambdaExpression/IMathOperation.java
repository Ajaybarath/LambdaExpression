package com.bridgeLabz.LambdaExpression;

interface IMathFunction {

	int calculate(int a, int b);
}

public class IMathOperation {

	public static void main(String args[]) {

		IMathFunction add = Integer::sum;

		IMathFunction multiply = (x, y) -> x * y;
		
		IMathFunction divide = (int x, int y) -> x / y;

		System.out.println("Addition is " + add.calculate(5,  3));
		System.out.println("Multiplication is " + multiply.calculate(5,  3));
		System.out.println("Division is " + divide.calculate(9,  3));
		

	}

}
