package Part2Section4;

public class Greatest {
    public static void main(String[] args) {
        int answer = greatest(20, 7, 399);
        System.out.println("Greatest: " + answer);
    }

    public static int greatest(int number1, int number2, int number3) {
        return Math.max((Math.max(number1, number2)), number3);
    }
}
