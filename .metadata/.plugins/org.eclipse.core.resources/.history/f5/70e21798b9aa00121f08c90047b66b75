package wagner_wendt__aufgabenblatt3;

import java.util.Scanner;

/**
 * Praktikum TIPR1 (Prof. Jenke), SS 2013 Gruppe Wagner,Stefan Sylvius(2103833,
 * stefansylvius.wagner@haw-hamburg.de), Wendt(<Matrikelnummer 2>,
 * lukas.wendt@haw-hamburg.de) ... Aufgabe: Aufgabenblatt 1, Aufgabe 1
 * Verwendete Quellen: /
 */
public class QubicNewton {
	double EPSILON = 0.5;
	double a;
	double b;
	double c;
	double d;
	double x;
	double startValue;

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		QubicNewton newt = new QubicNewton();

		newt.a = input.nextDouble();
		newt.b = input.nextDouble();
		newt.c = input.nextDouble();
		newt.d = input.nextDouble();
		newt.startValue = newt.x = input.nextDouble();
		newt.EPSILON = input.nextDouble();

		System.out.println(newt.f(newt.x));
		System.out.println(newt.fPrime(newt.x));
		newt.computeCrossPoint();

	}

	double f(double x) {
		return a * Math.pow(x, 3) + b * Math.pow(x, 2) + c * x + d;

	}

	double fPrime(double x) {
		return 3 * a * Math.pow(x, 2) + 2 * b * x + c;

	}

	void computeCrossPoint() {

		double cross = 5;
		int i = 0;
		while (Math.abs(cross) > EPSILON && i < 1002) {

			i++;
			double f = f(startValue);
			double fAbl = fPrime(startValue);
			cross = startValue - (f / fAbl);
			startValue = cross;

		}

		if (i > 1000 && cross == 0) {
			System.out.println("Es konvergiert nicht.");
		} else if (fPrime(startValue) == 0) {
			System.out.println("Ableitung ist gleich 0");
		} else if (i > 1000) {
			// System.out.println(i);
			System.out.println(cross);
		}

	}
}