public class PrimeNumbers {
    public static boolean isPrime(int number) {
        // Проверка на специальные случаи: 0, 1 и отрицательные числа не являются простыми
        if (number <= 1) {
            return false;
        }

        // Проверка на делимость числа нацело до его квадратного корня
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        // Если число не делится нацело ни на одно число до его квадратного корня, то оно простое
        return true;
    }

    public static void main(String[] args) {
        // Вывод простых чисел от 1 до 1000
        System.out.println("Простые числа от 1 до 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}