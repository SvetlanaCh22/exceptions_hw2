/*
Урок 2. Исключения и их обработка

1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float)
   и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
   вместо этого, необходимо повторно запросить у пользователя ввод данных.
2. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

Автор: Чубченко Светлана
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float f;
        do {
            f = getFloat();
        } while (f == -1);
        System.out.printf("Entered float: %f", f);
        // считаем строку и если пустая - выведем ошибку
        String str;
        do {
            str = readString();
        } while (str.equals(""));
    }

    static float getFloat() {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Please input float: ");
            return in.nextFloat();
        } catch (Exception e) {
            return -1;
        }
    }

    static String readString() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.isEmpty() || (str.trim().equals(""))) {
            System.out.println("You entered void line");
            return "";
        } else {
            return str;
        }
    }

}

