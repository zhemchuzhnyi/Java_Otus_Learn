package Animals;

public class Puppy extends Dog {
    public Puppy(String name, Integer age) {
        super(name, age);
    }

    public Puppy(String name) {
        super(name);
    }

    public Puppy() {
        super();
    }

    @Override
    public void bark() {
        System.out.println(getName() + " говорит: Гав (писклявым голосом)");
    }

    // Добавляем метод main для запуска
    public static void main(String[] args) {
        Puppy puppy = new Puppy("Малыш", 1);
        puppy.bark();
        puppy.printInfo();
    }
}