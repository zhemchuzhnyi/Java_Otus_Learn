package Learn;

public class Lesson_4_2 {
    public static void main(String[] args) {
        int result = sum(5);
        System.out.println(result);

        result = sumRecursive(5);
        System.out.println(result);
    }

    public static int sum (int number ) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumRecursive(int number) {
        if (number == 0) {
            return number;
        }
        int result = number + sumRecursive(--number);
        return result;
    }
}
