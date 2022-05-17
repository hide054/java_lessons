public class Static_Final {
    public static void main(String[] args){
        Chel chel = new Chel("Tom", 30); // Создание объекта класса Chel
        chel.setName("John"); // Переименовали объект класса Chel
        Chel.ds = "Nice"; // Обращаемся напрямую к классу, ан е объекту выше
        Chel.getDs();
        chel.getAllFields();
    }
}

class Chel{
    // static - обозначение переменной для класса
    // Является общей для всех объектов класса
    // final - обозначение неизменяемой переменной
    private String name;
    private int age;
    public static String ds; // Создание переменной для класса
    public Chel(String name, int age){ // Конструктор
        this.age = age;
        this.name = name;
    }
    // Методы
    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
    public static final void getDs(){
        System.out.println(ds);
    }
    public void getAllFields(){
        System.out.println("Name: "+name+"\nAge: "+age);
    }
}
class Test{
    public final int CONST;

    public Test(int CONST){
        this.CONST = CONST;
    }
}