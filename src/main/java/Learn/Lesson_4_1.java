package Learn;

public class Lesson_4_1 {
    // Рекурсия
    public static void main(String... args) {
        int result = sum(5);
        System.out.println("Sum: " + result);
    }

    public static int sum(int number) {
        if (number == 1) {
            return 1; // Базовый случай
        }
        return number + sum(number - 1); // Рекурсивный вызов
    }
}
