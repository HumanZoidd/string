import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите свою фамилию  : ");
//        if (scanner.hasNextLine()) {
            String lastName = scanner.next();
//            System.out.println("Спасибо! Вы ввели фамилию : " + lastName);
//        } else {
//            System.out.println("Извините, но это явно не фамилия. Перезапустите программу и попробуйте снова!");
//        }
        System.out.print("Введите своё имя : ");
        String firstName = scanner.next();
        System.out.print("Введите своё отчество : ");
        String middleName = scanner.next();
        String fullName = lastName +" " + firstName +" "+ middleName;
        System.out.println("ФИО сотрудника - " + fullName );
    } public static void task2 () {
        System.out.println("Задача 2");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите свою фамилию  : ");
        String lastName = scanner.next();
        System.out.print("Введите своё имя : ");
        String firstName = scanner.next();
        System.out.print("Введите своё отчество : ");
        String middleName = scanner.next();
        String fullName = lastName +" " + firstName +" "+ middleName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase() );
    } public static void task3 () {
        System.out.println("Задача 3");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите свою фамилию  : ");
        String lastName = scanner.next();
        System.out.print("Введите своё имя : ");
        String firstName = scanner.next();
        System.out.print("Введите своё отчество : ");
        String middleName = scanner.next();
        String fullName = lastName +" " + firstName +" "+ middleName;
        System.out.println("Данные ФИО сотрудника - " + fullName.replace("ё","е") );
    }

}
