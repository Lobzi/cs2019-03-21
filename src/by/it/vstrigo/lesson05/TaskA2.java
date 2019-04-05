package by.it.vstrigo.lesson05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
Создайте список строк.
Вводите строки с клавиатуры, пока пользователь не введет слово END.
Каждую введенную строку, кроме слова END добавьте в список типа ArrayList.

Напечатайте список, не используйте для этого цикл.
Список - это объект. Его можно просто напечатать, как переменную.

Для вот такого ввода:
ONE
TWO
THREE
FOUR
FIVE
END
Ожидается такой вывод:
[ONE, TWO, THREE, FOUR, FIVE]

*/
public class TaskA2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Scanner sc = new Scanner(System.in);
        for (; ; ) {
            String nextWord = sc.nextLine();
            if (nextWord.equals("END")) break;
            list.add(nextWord);
        }
        System.out.println(list);
    }
}