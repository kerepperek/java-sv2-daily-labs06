package day04.hangman;

import java.util.Scanner;

public class HangmanMain {


    public static void main(String[] args) {
        new HangmanMain().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        Model model = new Model("almafa",8);

        do {
            printStatus(model);

            String guess = scanner.nextLine();

            boolean success = model.Guess(guess);

            if (success) {
                System.out.println("Van ilyen betű!");
            } else {
                System.out.println("Nincs ilyen betű!");
            }
        } while (!model.isWinner() && model.hasMoreChance());

        if (model.isWinner()) {
            System.out.println("Sikerült kitalálnod!");
        } else {
            System.out.println("Elhasználtad az összes lehetőségedet. Vesztettél!");
        }
    }

    private void printStatus(Model model) {
        System.out.println("Itt tartasz: " + model.getWordFound());
        System.out.println("Ennyi tipped van hátra: " + model.getChances());
        System.out.println("Mi a következő tipped?");
    }

}
