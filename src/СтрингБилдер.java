public class СтрингБилдер {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my");
        sb.append(" friend"); //конкатенируем сторки
        // Для удобства можем применить Chaining (ЧЕЙНИНГ)
        sb.append(". How").append(" are").append(" you?"); // Chaining
        System.out.println(sb.toString());
        // Форматирование строки
        System.out.printf("This is a string, %s", "NICE");
        // sout("... %s", "..." ) - 2 параметр идет вместо %s
        // %s - строка, %d - число, %f - число с запятой
        // Кол-во параметров должно соответствовать кол-ву %
        // sout("... %(можно установить ширину)d", "...")
        System.out.printf("\nstring %5d", 123); // ширина перед написанием числа
        System.out.printf("\nstring %-5d", 123); // ширина после напсиания числа
        System.out.printf("\nstring %.2f", 123.321); // %.2f - максимум 2 числа после запятой

    }
}
