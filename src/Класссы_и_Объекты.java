import java.util.Scanner;

public class Класссы_и_Объекты { // Публичный класс может быть только 1
    public static void main(String[] args) {
        Person Ivan = new Person(); // Ввод объекта. Ivan - Объект класса Person
        Ivan.setNameAndAge("Иван", 21); // Занесли значение Иван в метод setName Объекта Person
        // Ivan.name = "Иван"; // Занесли в поле name значение "Иван" и присвоили его Объекту класса Person
        // Ivan.age = 21;
        Ivan.hello(); // Вызвали метод класса
        int vozrast1 = Ivan.sss();
        System.out.println(Ivan.name + ", вам до пенсии еще " + vozrast1 + " года.");
        Ivan.bye();
        System.out.println();
        ///
        Person Mary = new Person(); // Ввод объекта. Mary - Объект класса Person
        Mary.setNameAndAge("Мария", 19);
        // Mary.name = "Мария";
        // Mary.age = 19;
        Mary.hello(); // Вызвали метод класса
        int vozrast2 = Mary.sss();
        System.out.println(Mary.name + ", вам до пенсии еще " + vozrast2 + " лет.");
        Mary.bye();

    }
}
/*
У класса могуть быть:
1. Данные (поля класса)
2. Действия, которые он может совершать (методы класса)
 */
class Person { // Создали класс Человек
    String name;
    int age;

    // Создание метода с конструктором
    void setNameAndAge(String username, int userage) {
        /*
        Конструктор может содержать несколько условий
         */
        name = username;
        age = userage;
    }

    void hello() { // Создали метод класса (его действия)
        if(age == 21) {
            System.out.println("Меня зовут " + name + ", " + "мне " + age + " год.");
        } else if (age == 19) {
            System.out.println("Меня зовут " + name + ", " + "мне " + age + " лет.");
        }
    }
    void bye() {
            System.out.println("Очень приятно, " + name + ". До встречи!");
    }

    int sss() { // Метод возвращает только Целое число
        int years = 65 - age;
        return years; // Возвращает полученное значение и выходит из метода, заканчивая процесс.
    }

}
