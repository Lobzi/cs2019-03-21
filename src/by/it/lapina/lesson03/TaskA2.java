package by.it.lapina.lesson03;

/*
Lesson 03. Task A2. Стихотворение

В созданном вами методе main напишите следующий код:
Запишите свое любимое стихотворение в переменных a b c d и т.д. (типа String)
Выведите одну строку «Мое любимое стихотворение:».
Напишите еще одну строку вывода, но так, чтобы в результате выполнения программы
было выведено ваше любимое стихотворение.
В стихотворении должно быть не меньше, чем 4 строки.

Требования:
1.Программа должна выводить текст.
2.Перед стихом должна быть выведена строка "Мое любимое стихотворение:".
3.Выводимый текст должен состоять не меньше, чем из пяти строк (пустые строки - это тоже строки).
4.В выводимом тексте должно быть не менее, чем 50 символов.
5.Команд System.out.println в коде должно быть максимум две.

Для ручной проверки запустите программу Ctrl+Shift+F10
Для автоматической проверки откройте и запустите класс Testing
*/
class TaskA2 {
    public static void main(String[] args) {
        System.out.println("Мое любимое стихотворение:");
        String line1 = "Однажды, в студёную зимнюю пору";
        String line2 = "Я из лесу вышел; был сильный мороз.";
        String line3 = "Гляжу, поднимается медленно в гору";
        String line4 = "Лошадка, везущая хворосту воз.";
        String line5 = "И, шествуя важно, в спокойствии чинном,";
        String line6 = "Лошадку ведёт под уздцы мужичок";
        String line7 = "В больших сапогах, в полушубке овчинном,";
        String line8 = "В больших рукавицах... а сам с ноготок!";

        System.out.println(line1+"\n"+line2+"\n"+line3+"\n"+line4+"\n"+line5+"\n"+line6+"\n"+line7+"\n"+line8);
    }
}
