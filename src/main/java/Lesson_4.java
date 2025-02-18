public class Lesson_4 {
    public static void main(String[] args) {

         int[] array = new int[3];

         for (int i = 0; i < array.length; i++) {
             array[i] = i * 5;

         }

         int maxNumber = -1;
         for(int num: array) {
             if(maxNumber < num) {
                 maxNumber = num;

             }
         }
         maxNumber = maxNumber ^ 2;
        System.out.println(maxNumber);
    }
}
