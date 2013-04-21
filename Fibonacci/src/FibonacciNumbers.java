import javax.swing.JOptionPane;

public class FibonacciNumbers {

	public static void main(String[] args) {
		String inputBox = JOptionPane.showInputDialog(null, "input");
		int inputNumber = Integer.parseInt(inputBox);
		
		
		System.out.println(fibonacc(inputNumber));

	}

	public static int fibonacc(int inputNumber) {

		if (inputNumber == 0)
			return 0;
		else if (inputNumber == 1)
			return 1;
		else
			return fibonacc(inputNumber - 1) + fibonacc(inputNumber - 2);

	}

}