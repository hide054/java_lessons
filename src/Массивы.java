public class Массивы {
    public static void main(String[] args){
        int number = 10; // Примитивный тип данных
        int[] numbers = new int[5]; // Массив с 5 ячейками
        System.out.println(numbers[0]);
        System.out.println();
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i*10;
        }
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println();
        int[] numbers1 = {1, 2, 3};// Массив с заранее заведенными элементами
        for (int j = 0; j < numbers1.length; j++){ // Перебор элементов массива
            System.out.println(numbers1[j]);
        }
        System.out.println();
        // Цикл for each. Массивы строк
        int[] numer = new int[5]; // Создали пустой массив из целых чисел с 5 ячейками
        numer[0] = 10; // Занесли 10 в первое число массива под индекс 0
        System.out.println(numer[0]);
        System.out.println(numer[1]);
        System.out.println();

        String[] sss = new String[3];
        sss[0] = "Hello";
        sss[1] = "Bye";
        sss[2] = "Java";
        System.out.println(sss[0]);
        System.out.println(sss[2]);
        System.out.println();

        for(String str: sss ) { // Цикл for each для строк
            System.out.println(str);
        }
        System.out.println();
        int[] numer111 = {1, 2, 3}; // Цикл for each для целых чисел
        int sum = 0;
        for(int x: numer111) {
            sum = sum + x;
        }
        System.out.println(sum);
        System.out.println();
        // Многомерные массивы
        int[] numm = {1, 2, 3}; //Одномерный массив
        int[][] matrix = {{1,2,3},{4, 5, 6},{7, 8, 9}}; //Многомерный массив
        System.out.println(matrix[2][1]);
        // Вывод матрицы в таблице на экран
        for(int i = 0; i < matrix.length;i++) {
            for(int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
