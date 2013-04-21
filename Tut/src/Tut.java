import java.util.Scanner;

import javax.swing.JOptionPane;

public class Tut {

	public static void main(String[] args) {

		Scanner amountLimit = new Scanner(System.in);
		Scanner inputUser = new Scanner(System.in);
		int[] amount = new int[amountLimit.nextInt()+1];
		int result = 0;

		for (int i = 0; i < amount.length; i++) {

			System.out.println("Geben Sie den Betrag ein");
			amount[i] = inputUser.nextInt();
			result += amount[i];
			if (result > 100 || i == amount.length-1) {
				System.out.println("Limit überschritten");
				break;
			}
			System.out.println(result);
			
		}

	}
}
