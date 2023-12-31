import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Приветствие
        System.out.println("Hello World!");

        // 1.0 задание
        Scanner a = new Scanner(System.in);
        System.out.print("Введите Ваше имя: ");
        String name = a.nextLine();
        System.out.println("Hello, " + name + "!");

        // 1.1 задание
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Введите значение первой переменной: ");
        double b = scan1.nextDouble();
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Введите значение второй переменной: ");
        double c = scan2.nextDouble();
        double a = 4 * (b + c - 1) / 2;
        System.out.println(a);

        // 1.2 задание
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите любое двузначное число: ");
        int n = scan.nextInt();
        if (n > 9 && n < 100) {
            int a = n / 10 + n % 10;
            System.out.println("Сумма цифр двузначного числа равна " + a);
        } else {
            System.out.println("Вы ввели не двузначное число");
        }

        // 1.3 задание
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите любое трехзначное число: ");
        int n = scan.nextInt();
        if ((n > 99) && (n < 1000)) {
            int a = n / 100;
            int b = n / 10 % 10;
            int c = n % 100 % 10;
            int d = a + b + c;
            System.out.print("Сумма цифр трехзначного числа равна " + d);
        } else {
            System.out.println("Вы ввели не трехзначное число");
        }

        // 1.4 задание
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите любое число с ненулевой дробной частью: ");
            double n = scan.nextDouble();
            double a = (n % 1);
            if (a >= 0.5) {
                double b = n - (n % 1) + 1;
                System.out.println("Результат округления: " + b);
            } else {
                double b = n - n % 1;
                System.out.println("Результат округления: " + b);
            }

            // 1.5 задание
            Scanner a = new Scanner(System.in);
            System.out.print("Введите первое натуральное число: ");
            int q = a.nextInt();
            Scanner b = new Scanner(System.in);
            System.out.print("Введите второе натуральное число: ");
            int w = b.nextInt();
            if (q > 0 && w > 0) {
                int del = q / w;
                int ost = q % w;
                System.out.println("Результат деления первого числа на второе: " + del);
                System.out.println("Остаток при делении: " + ost);
            } else {
                System.out.println("Вы ввели не натуральное число");
            }

            // 1.6.1 задание
            Scanner scan1 = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int a = scan1.nextInt();
            Scanner scan2 = new Scanner(System.in);
            System.out.print("Введите второе число: ");
            int b = scan2.nextInt();
            int c = a;
            a = b;
            b = c;
            System.out.println("После преобразования значение первой переменной равно " + a);
            System.out.println("После преобразования значение второй переменной равно " + b);

            // 1.6.2 задание
            Scanner scan1 = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int a = scan1.nextInt();
            Scanner scan2 = new Scanner(System.in);
            System.out.print("Введите второе число: ");
            int b = scan2.nextInt();
            a += b;
            b = a - b;
            a -= b;
            System.out.println("После преобразования значение первой переменной равно " + a);
            System.out.println("После преобразования значение второй переменной равно " + b);

        }
    }