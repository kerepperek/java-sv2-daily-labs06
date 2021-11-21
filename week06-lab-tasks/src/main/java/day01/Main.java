package day01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PositiveNumberContainer positiveNumberContainer = new PositiveNumberContainer();

        Scanner scanner = new Scanner(System.in);

        double number = scanner.nextDouble();

        while (number > 0) {
            positiveNumberContainer.addNumber(number);
            number = scanner.nextDouble();
        }
        System.out.println(positiveNumberContainer.getNumbers());
    }
}
