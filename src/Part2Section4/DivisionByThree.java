package Part2Section4;

import java.util.Scanner;

public class DivisionByThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Range start?");
        int beginning = Integer.parseInt(sc.nextLine());
        System.out.println("Range end?");
        int end = Integer.parseInt(sc.nextLine());

        System.out.println("Numbers in range divisible by 3:");
        divisibleByThreeInRange(beginning, end);
    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
