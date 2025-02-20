package Learn;

public class Lesson3_1 {
    public static void countDown(int n) {
        if (n == 0) { // Базовый случай: если n равно 0
            System.out.println("Готово!");
        } else {
            System.out.println(n);
            countDown(n - 1); // Рекурсивный вызов с n - 1
        }
    }

    public static void main(String[] args) {
        countDown(5); // Запуск с числа 5
    }
}