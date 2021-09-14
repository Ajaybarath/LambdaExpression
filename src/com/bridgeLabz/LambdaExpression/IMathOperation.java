package com.bridgeLabz.LambdaExpression;

interface IMathFunction {

	int calculate(int a, int b);

	public static void printResult(int a, int b, String function, IMathFunction obj) {
		System.out.println("Result of " + function + " is : " + obj.calculate(a, b));
	}
}

public class IMathOperation {

	public static void main(String args[]) {

		IMathFunction add = Integer::sum;

		IMathFunction multiply = (x, y) -> x * y;

		IMathFunction divide = (int x, int y) -> x / y;

		IMathFunction.printResult(4, 2, "Add", add);
		
		IMathFunction.printResult(4, 2, "Multiply", multiply);

		IMathFunction.printResult(4, 2, "Divide", divide);

	}

}
