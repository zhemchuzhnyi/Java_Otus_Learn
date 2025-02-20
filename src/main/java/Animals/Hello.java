package Animals;

public class Hello {
    public static void main(String[] args) {
        // Исправлен регистр в создании объекта (new Dog, а не new dog)
        Dog dog = new Dog();
        dog.printInfo();  // Демонстрация работы

        // Раскомментируйте и используйте другие варианты:
        Dog dog1 = new Dog("Жужа", 8);
        dog1.bark();
        dog1.printInfo();

        Dog dog2 = new Dog("Жужа2");
        dog2.bark();
        dog2.printInfo();

        // Правильный способ изменения значений через сеттеры
        Dog dog3 = new Dog();
        dog3.setName("Жужа3");
        dog3.setAge(7);
        dog3.printInfo();
    }
}