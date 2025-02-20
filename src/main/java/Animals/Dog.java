package Animals;

public class Dog {
    String name;
    Integer age;

    // Конструктор с именем и возрастом
    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // Конструктор только с именем (возраст 0 по умолчанию)
    public Dog(String name) {
        this.name = name;
        this.age = 0; // Устанавливаем значение по умолчанию
    }

    // Пустой конструктор с начальными значениями
    public Dog() {
        this.name = "Безымянный";
        this.age = 0;
    }

    // Метод, чтобы собака лаяла
    public void bark() {
        System.out.println(name + " говорит: Гав!");
    }

    // Метод для вывода информации о собаке
    public void printInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}