public class TriangularNumber {
    public static int getTriangularNumber(int n) {
        // Проверка на валидность входного аргумента
        if (n <= 0) {
            throw new IllegalArgumentException("n должно быть положительным числом.");
        }

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        int triangularNumber = getTriangularNumber(n);
        System.out.println("Треугольное число для n = " + n + "; " + triangularNumber);
    }
}