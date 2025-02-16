public class Lesson3_3 {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        if (str1.equals(str2)) {
            System.out.println("str1 и str2 имеют одинаковое содержимое");
        } else {
            System.out.println("str1 и str2 имеют разное содержимое");
        }
    }
}
