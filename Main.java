package cards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line + ":");
        if (line.equals("Card Suits")) {
            printAllSuits();
        } else if(line.equals("Card Ranks")) {
            printAllRanks();
        }
    }

    private static void printAllRanks() {
        for (int i = 0; i <Ranks.values().length ; i++) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",i, Ranks.values()[i]);
        }

    }

    private static void printAllSuits() {

        for (int i = 0; i < Suits.values().length; i++) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", i, Suits.values()[i]);

        }
    }
}
