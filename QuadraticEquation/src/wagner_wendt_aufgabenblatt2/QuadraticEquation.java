package wagner_wendt_aufgabenblatt2;

import javax.swing.JOptionPane;

public class QuadraticEquation {

	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog(null, "Wählen Sie a");
		String input2 = JOptionPane.showInputDialog(null, "Wählen Sie b");
		String input3 = JOptionPane.showInputDialog(null, "Wählen Sie c");
		double a = Double.parseDouble(input1);
		double b = Double.parseDouble(input2);
		double c = Double.parseDouble(input3);

		double determinant = (Math.pow(b, 2) - 4 * a * c);
		double positiveMultiplier = (-b + Math.sqrt(determinant));
		double negativeMultiplier = (-b - Math.sqrt(determinant));
		double divisor = 2 * a;
		double positiveResult = positiveMultiplier / divisor;
		double negativeResult = negativeMultiplier / divisor;

		if (a != 0 && b != 0 && c != 0) {
			System.out.print("Zwei Lösungen:" +"X1="+positiveResult);
			
		}
		if (c == 0 && b == 0) {
			System.out.println(0);

		} else if (Double.isNaN(positiveResult) && Double.isNaN(negativeResult)) {

			System.out.println("Keine Lösung");
		} else if (b == 0) {
			System.out.println(-(Math.sqrt(-c / a)));
			System.out.println(Math.sqrt(-c / a));

		}

	}
}
