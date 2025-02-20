package Learn;

public class Lesson3 {
    public static void main(String[] args) {
        final int VERT = 12;
        final String VER = "Eren";
        //VERT = 13;

//Массив
        //int age9;
       // int age0 = 12;
       // int age1 = 18;
       // int age2 = 15;
       // int age3 = 19;


        //int age []; // массив еще можно так - int[] age1;

        int age[] = new int[4];
        age[0] = 12;
        age[1] = 18;
        age[2] = 15;
        age[3] = 19;
       //System.out.println(age[1]);

        int age22[] = new int[]{1,2,2,3,15,45,78,54,56,45,87,97,4545,};
        //System.out.println(age22[3]);
        int size = age22.length;
        //System.out.println(size);

        // Условный оператор if..

        int num = 10;

        if(num > 0) {
            //System.out.println("Больше 0");
        } else {
            //System.out.println("Меньше 0");
        }

        //Тернарный оператор вместо if \ else используется

        String x = (num > 0)? "Больше 0": "Меньше 0";
        //System.out.println(x);

        // Цикл for
        int sex[] = new int[16];
        sex[0] = 12;
        sex[1] = 18;
        sex[2] = 15;
        sex[3] = 19;
        sex[4] = 20;
        sex[5] = 30;

        // sexx ++ = sexx = sexx + 1
        for (int xx = 0; xx < sex.length ; xx++ ) {
            //System.out.println(sex[xx]);
        }
        //for each
        for (int xx: sex){
            //System.out.println(xx);
        }

        // Цикл While
        int cash = 100;

        while(cash > 0) {
            //System.out.println("Купил что-то новое");
            cash = cash - 20;
        }

        //Цикл do - while
        int cash3 = 80;

        do {
            System.out.println("Купил что-то новое!");
            cash3 = cash3 - 20;
        }while(cash3 > 0);


        //Рекурсия - позже сделаю






    }
}
