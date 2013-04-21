package wagner_wendt_aufgabenblatt_2;

import javax.swing.JOptionPane;

public class ConvereterDecimal {

	public static void main(String[] args) {

		String number = JOptionPane.showInputDialog(null, "Your number:");
		String base = JOptionPane.showInputDialog(null, "Your base:");
		double inputBase = Double.parseDouble(base);
		double sum = 0;
		for (int i = 0, s = (number.length() - 1); i < number.length() && s >= 0; i++, s--) {

			char num = number.charAt(i);
			int intNum = Character.getNumericValue(num);
			double result = intNum * Math.pow(inputBase, s);
			sum += result;
			
		}
System.out.println(sum);
	}
}
