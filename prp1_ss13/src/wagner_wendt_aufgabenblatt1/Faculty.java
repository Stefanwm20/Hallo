package wagner_wendt_aufgabenblatt1;
/**
 * Praktikum TIPR1 (Prof. Jenke), SS 2013
 * 
 * Gruppe Wagner(2103833, stefansylvius.wagner@haw-hamburg.de),
 *        Wendt(2144458, lukas.wendt@haw-hamburg.de)
 * 
 * 
 * Aufgabe : Aufgabenblatt 1, Aufgabe 2 Verwendete Quellen:
 * 
 * In dieser Klasse wird die Fakultaet einer übergebenen Zahl berechnet
 */

public class Faculty {

  
    public static void main(String[] args) {
        int inputNumber = Integer.parseInt(args[0]);
          
        int summe = 1;
        for (int i= 1;i<= inputNumber;i++){
            summe*= i;
            
        }
        System.out.println(summe);
        // TODO Auto-generated method stub

    }

}
