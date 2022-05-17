public class This{
    public static void main(String[] args){
        Human human = new Human("Bob", 25);
/*
Создание данного класса возможно только при условии
указания 2 параметров (name и age), т.к. внутри класса мы
создали контруктор с этими 2 обязательными параметрами
 */
//        human.setName("John");
//        human.setAge(30);
//        human.getInfo();
    }
}
// this - ключевое слово, вызывающее объект внутри класса
class Human{
    public Human(String name, int age){ // Создали контруктор класса Human c 2 параметрами
        this.name = name; // без данного параметра создание класа невозможно
        this.age = age; // без данного параметра создание класса невозможно
    }
    private String name;
    private int age;
// Setters
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
// Getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println("Name: "+name+"\nAge: "+age);
    }
}
