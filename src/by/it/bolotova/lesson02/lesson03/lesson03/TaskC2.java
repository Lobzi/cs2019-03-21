package by.it.bolotova.lesson02.lesson03.lesson03;

import java.util.Scanner;

/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
public class TaskC2 {

    public static void main(String[] args) {
        System.out.println("Введите целое четырехзначное число");
        Scanner sc = new Scanner(System.in);
        System.out.println(sumDigitsInNumber(sc.nextInt()));
    }
    public static int sumDigitsInNumber(int number) {
       int a = number%10;
       int b = number / 10;
       int c = b%10;
       int d = b / 10;
       int i = d%10;
       int f = d / 10;
       return a + c + i + f;
    }

}
