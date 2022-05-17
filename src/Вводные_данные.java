import java.util.Scanner;

public class Вводные_данные {
    public static void main(String[] args) {
        System.out.println("Hello World");
        // Цикл while
        int a = 1;
        while(a < 4) {
            System.out.println("Word " + a);
            a ++;
        }

        // Цикл for
        /*
        for(1; 2; 3){}
        1 - Инициализация переменной
        2 - Условие действия цикла (до чего действует)
        3 - Шаг счетчика (Действие с переменной после цикла)
         */
        for(int i = 1; i <= 3; i++) {
            System.out.println("Туда " + i);
        }
        for(int j = 9; j >= 7; j--){
            System.out.println("Обратно " + j);
        }

        // if / else if / else
        int number = 1;
        if(number + 6 < 7) {
            System.out.println("Число меньше 7!");
        } else if(number + 6 > 7){
            System.out.println("Число больше 7!");
        } else {
            System.out.println("Это 7!");
        }

        // Scanner - ввод строки пользователем
        // Scanner(System.in) - Стандартный поток входных данных
        // nextLine() - введение строки
        // nextInt() - введение целого числа
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите число");
//        int a1 = scan.nextInt();
//        System.out.println("Вы ввели число " + a1);

        // Цикл do/while
        Scanner scanner = new Scanner(System.in);
        int value;
        System.out.println("Введите цифру, которую мы загадали");
        do {
            value = scanner.nextInt();
            if(value != 5) {
                System.out.println("Не угадали");
            }
        } while(value != 5);
        System.out.println("Вы угадали, это 5");
        // Операторы циклов break и continue
        System.out.println("Начинаем цикл с оператором \"continue\"");
        for(int h = 0; h <= 6; h++) {
            if (h%2 == 0) {
                continue;
            }
            System.out.println(h);
        }
        System.out.println("Начинаем цикл с оператором \"break\"");
        int a45 = 0;
        while(a45 != 6) {
            if(a45 == 3) {
                break;
            }
            System.out.println(a45);
            a45++;
        }
        // Оператор цикла switch
        System.out.println("Начинается цикл с оператором \"switch\"");
        Scanner sss = new Scanner(System.in);
        System.out.println("Введи любое число, кратное 2, от 2 до 6");
        int age = sss.nextInt();
        switch (age) {
            case 0 :
                System.out.println("Вы ввели 0");
                break;
            case 2 :
                System.out.println("Вы ввели 2");
                break;
            case 4 :
                System.out.println("Вы ввели 4");
                break;
            case 6 :
                System.out.println("Вы ввели 6");
                break;
            default:
                System.out.println("Число не подходит под условие");
                break;
        }
        // Массивы

    }
}
