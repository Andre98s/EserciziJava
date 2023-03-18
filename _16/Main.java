package javabasics._16;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Take the code below and put it into a function, read the code and see what it is.
     * <p>
     * What do you think the function does? Name the function appropriately and make sure
     * <p>
     * return the appropriate result type
     *
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Put this into a function
        double celsius = 30;
        double fahrenheit = conversione(celsius);
        String conversionDescription = celsius + " Celsius is " + fahrenheit + " fahrenheit";
        // End
        System.out.println(conversionDescription);
    }
    static double conversione(double celsius){
        double fahrenheit = ((celsius * 9) / 5) + 32;
        return fahrenheit;
    }

    /**
     * 2: Create a function that processes and prints out all the names in the ArrayList
     *
     *    Make sure to put all the formatting code in the function, formatting:
     *    1) to Upper case
     *    2) Remove spaces at the start and the end
     *    3) If the name contains any numbers, instead of returning the name, return "Invalid"
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");

        for (String name : names) { //per ogni nome nella lista names
            System.out.println("i nomi sono: ");
            convertName(name); //richiamo la funzione
            // Call your function
        }
    }

    static void  convertName(String name) {
        // if(name.matches(".*\\d+.*")){       //se il name contiene un numero, usiamo regex
        for (int i = 0; i < name.length(); i++) { //per far scorrere i caratteri nella lista di Arrey
            char character = name.charAt(i);
            if (Character.isDigit(character)) {  //se il carattere all indice i trova una cifra
                System.out.println("Invalid");  //stampa invalido
                return;
            }
        }
            System.out.println(name.trim().toUpperCase());
    }

    /**
     * 3: Write a function that prints out every variable seen in the code. It should not return anything
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        double myLunchPrice = 5.99;
        String lunchType = "sandwich";
        String description = "Nice big sandwich";
        int weightInGrams = 500;
         happyMeal(lunchType, description,myLunchPrice,weightInGrams); // RICHIAMO LA FUNZIONE
        // Call your function
    }
    static void happyMeal(String meal, String descr, double price, int weight){ //CREO LA FUNZIONE
        System.out.println("hai scelto: " + meal + " " + "un ottima scelta: " + descr + " " + "il prezzo è: "+ price + " " +"il peso è: "+ weight);
    }
}