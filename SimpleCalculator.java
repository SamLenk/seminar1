import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        String operator;

        // Ввод первого числа
        System.out.print("Введите первое число: ");
        num1 = scanner.nextDouble();

        // Ввод второго числа
        System.out.print("Введите второе число: ");
        num2 = scanner.nextDouble();

        // Ввод оператора
        System.out.print("Введите требуемую операцию (+, -, *, /): ");
        operator = scanner.next();

        // Выполнение операции и вывод результата
        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println("Результат: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Результат: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("Результат: " + result);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль недопустимо.");
                } else {
                    result = num1 / num2;
                    System.out.println("Результат: " + result);
                }
                break;
            default:
                System.out.println("Ошибка: неправильный оператор.");
                break;
        }

        scanner.close();
    }
}
