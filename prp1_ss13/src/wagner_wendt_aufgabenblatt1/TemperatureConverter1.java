package wagner_wendt_aufgabenblatt1;

/**
 * Praktikum TIPR1 (Prof. Jenke), SS 2013
 * 
 * Gruppe Wagner(2103833, stefansylvius.wagner@haw-hamburg.de), 
 *        Wendt (2144458,lukas.wendt@haw-hamburg.de)
 * 
 * 
 * Aufgabe : Aufgabenblatt 1, Aufgabe 1 Verwendete Quellen:
 * 
 * In dieser Klasse wird Celsius zu Fahrenheit umgerechnet- und anschlieﬂend
 * gerundet.
 */
public class TemperatureConverter1 {

	public static void main(String[] args) {
		String title = "Temperatur-Umrechnungstabelle";
		String header = "C\tF";
		String separator1 = "=============================";
		String separator2 = "-------------";

		System.out.println(title + "\n" + separator1 + "\n" + header + "\n"
				+ separator2);

		// Loop to display the table in increments of two.
		for (int currentTempCelsius = 0; currentTempCelsius <= 100; currentTempCelsius += 2) {
			// Calculate Fahrenheit.
			double tempFahrenheit = currentTempCelsius * 9.0 / 5.0 + 32;
			// Casting double value to display in int.
			int roundedValue = (int) (0.5 + tempFahrenheit);

			System.out.printf("%3d\t%3d\n", currentTempCelsius, roundedValue);

		}

	}
}
