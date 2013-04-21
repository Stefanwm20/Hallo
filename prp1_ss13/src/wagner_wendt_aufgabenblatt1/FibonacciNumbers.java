package wagner_wendt_aufgabenblatt1;

/**
 * Praktikum TIPR1 (Prof. Jenke), SS 2013
 * 
 * Gruppe Wagner(2103833, stefansylvius.wagner@haw-hamburg.de),
 *        Wendt(2144458, lukas.wendt@haw-hamburg.de)
 * 
 * 
 * Aufgabe : Aufgabenblatt 1, Aufgabe 3 Verwendete Quellen:
 * 
 * In dieser Klasse wird die Fibonacci Folge berechnet
 */


public class FibonacciNumbers {

    public static void main(String[] args) {
        int inputNumber = Integer.parseInt(args[0]);
      //Variable declaration
        int f0 = 0;
        int f1 = 1;
        int f2 = 0;
        int i=2;
        //Initializing loop for fibonacci numbers
        while (i <= inputNumber){
            f2 = f0 +f1;
            f0 = f1;
            f1 = f2;
            i++;
        }
        
        System.out.println(f2);

    }

}
