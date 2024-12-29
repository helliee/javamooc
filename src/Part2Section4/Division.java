package Part2Section4;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numerator?");
        int numerator = Integer.parseInt(sc.nextLine());
        System.out.println("Denominator?");
        int denominator = Integer.parseInt(sc.nextLine());

        division(numerator, denominator);
    }

    public static void division(int numerator, int denominator) {
        double quotient = (double) numerator / (double) denominator;

        System.out.println("Quotient: " + quotient);
    }
}
