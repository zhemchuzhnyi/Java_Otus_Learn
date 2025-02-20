package Animals;

public class Hello {
    public static void main(String[] args) {
        Dog dog = new Dog(); // Объект Dog без параметров

        // Если в Dog есть конструкторы с параметрами, можно создать так:
        Dog dog1 = new Dog("Жужа", 8);
        Dog dog2 = new Dog("Жужа2");

        Dog dog3 = new Dog();
        dog3.name = "Жужа";
        dog3.age = 7;

        System.out.println("Создана собака: " + dog1.name + ", возраст: " + dog1.age);
    }
}