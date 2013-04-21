package wagner_wendt_aufgabenblatt2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PointLineDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// String coordinates = JOptionPane.showInputDialog(null, "input");
		Scanner sc = new Scanner(System.in);
		double[] vars = new double[6];
		for (int i = 0; i < vars.length; i++) {
			vars[i] = sc.nextDouble();
		}

		double a[][] = { { vars[0] }, { vars[1] } };
		double b[][] = { { vars[2] }, { vars[3] } };
		double c[][] = { { vars[4] }, { vars[5] } };

		// Richtungsvektor der gerade g(C-B)
		double richtungsVektorG[][] = { { c[0][0] - b[0][0] },
				{ c[1][0] - b[1][0] } };
		// RichtungsVektor von d (A-B)
		double ortsVektorD[][] = { { b[0][0] - a[0][0] }, { b[1][0] - a[1][0] } };
		// Bedingung Richtungsvektor g und d sind orthogonal(g*d=0)
		double skalarProdukt = ortsVektorD[0][0]* richtungsVektorG[0][0]
				-(ortsVektorD[1][0] * richtungsVektorG[1][0])
				/ (richtungsVektorG[0][0] * richtungsVektorG[0][0] 
				+ richtungsVektorG[1][0]* richtungsVektorG[1][0]);

		double resultX = b[0][0] + (skalarProdukt * richtungsVektorG[0][0]);
		double resultY = b[1][0] + (skalarProdukt * richtungsVektorG[1][0]);
		double resultD[][] = {
				{ ortsVektorD[0][0] + (skalarProdukt * richtungsVektorG[0][0]) },
				{ ortsVektorD[1][0] + (skalarProdukt * richtungsVektorG[1][0]) } };
		double distance = Math.sqrt(Math.pow(resultD[0][0], 2)
				+ Math.pow(resultD[1][0], 2));
		System.out.println(distance + "\n" + resultX + "\n" + resultY);
		

	}
}
