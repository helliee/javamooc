package Part2Section4;

import java.util.Scanner;

public class ParameterToOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        System.out.println();

        printFromNumberToOne(number);
    }

    public static void printFromNumberToOne(int number) {
        while (number > 0) {
            System.out.println(number);
            number--;
        }
    }
}
