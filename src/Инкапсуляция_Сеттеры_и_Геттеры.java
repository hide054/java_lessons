import org.w3c.dom.ls.LSOutput;

public class Инкапсуляция_Сеттеры_и_Геттеры {
    public static void main(String[] args) {
        User person0 = new User();
        person0.setName("Ivan");
        person0.setAge(21);
        person0.speak();
        System.out.println(person0.getName());
        System.out.println(person0.getAge());
    }
    // Setter(Сеттер) - метод для установки занчения поля
    // Getter(Геттер) - метод получения значения поля
    // Инкапсуляция - сокрытие данных в классе и работа с ними внутри
}
class User{
    private String login;
    private int age;

    public void setName(String userName){ // Метод установки Имени
        if (userName.isEmpty()){ // Проверка поля на пустоту
            System.out.println("Вы ввели пустое имя");
        } else {
            login = userName;
        }
    }
    public String getName(){ // Метод получения значения Имени
        return login;
    }
    public void setAge(int userAge){ // Уставновка значения age
        age = userAge;
    }
    public int getAge(){ // Получение значения age
        return age;
    }

    void speak() {
        System.out.println("Привет! Меня зовут " + login);
        System.out.println("Мне " + age);
    }


}

