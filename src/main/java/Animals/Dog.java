package Animals;

public class Dog {
    private String name;
    private Integer age;

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name) {
        this(name, 0);
    }

    public Dog() {
        this("Безымянный", 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void bark() {
        System.out.println(name + " говорит: Гав!");
    }

    public void printInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }

    // Добавляем метод main для запуска
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик", 5);
        dog.bark();
        dog.printInfo();
    }
}