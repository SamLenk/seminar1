public class Factorial {
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n должно быть неотрицательным числом.");
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int factorial = factorial(n);
        System.out.println("Факториал числа " + n + ": " + factorial);
    }
}