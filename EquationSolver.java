public class EquationSolver {
    public static void main(String[] args) {
        solveEquation("2? + ?5 = 69"); // Пример уравнения
    }

    public static void solveEquation(String equation) {
        String[] parts = equation.split(" "); // Разделение уравнения на части (левая часть, правая часть, знак равенства)
        String leftPart = parts[0]; // Левая часть уравнения
        String rightPart = parts[2]; // Правая часть уравнения

        for (int i = 0; i < 10; i++) { // Перебор всех возможных значений для знаков вопроса
            for (int j = 0; j < 10; j++) {
                String q = leftPart.replace("?", String.valueOf(i)); // Замена знака вопроса на текущее значение
                String w = rightPart.replace("?", String.valueOf(j));

                // Проверка условия уравнения
                if (isNumeric(q) && isNumeric(w)) {
                    int qValue = Integer.parseInt(q);
                    int wValue = Integer.parseInt(w);
                    if (qValue + wValue == Integer.parseInt(parts[4])) {
                        System.out.println("Решение найдено: " + q + " + " + w + " = " + parts[4]);
                        return; // Если найдено решение, то прекращаем перебор
                    }
                }
            }
        }

        System.out.println("Решение не найдено.");
    }

    public static boolean isNumeric(String str) {
        // Проверка, является ли строка числом
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
