package string;

public class String {
    //String - ссылочный тип данных
    //ЧТО ЗА java.land -


    public static void main(java.lang.String[] args) {  // В НАШ МЕТОД main передаётся массив строк

        java.lang.String str1 = new java.lang.String("Hello"); // как объявляется строка
        // объявляем тип,  название (=)делаем присваивание, new (присваивание), описываем тип данных, задаём строку
        //String - ссылочный тип данных, где в её памяти хранится ссылка на наш объект
        java.lang.String str2 = "Hello"; // ещё один способ объявления переменной

        //Конкатенация - сложение строк друг с другом, склеивание
        java.lang.String str3 = str1 + str2;
        System.out.println(str3);

        // Строку изменить нельзя - те не получится изменить значение строки в str1, придётся создавать новую переменную
        str1 = "23423"; // тут создаётся новая строка

        java.lang.String str4 = str2.substring(0, 3); // передаём через метод .substring как в массиве индексы нашей строки (с 0)
        // от 0 до 2
        System.out.println(str4);

        java.lang.String str5 = "Hel";
        // Как сравнивать строки:
        System.out.println(str4.equals(str5));
        System.out.println(str4.equalsIgnoreCase(str5)); // сравниваем строки, но игнорим регистр
        // (то, что где-то большие буквы где-то маленькие)

        System.out.println(str5.toLowerCase()); // всё с маленьким регистром

        int ch = str5.length(); // кол-во символов в строке, длина
        System.out.println(ch);

        java.lang.String[] str6 = {"Hiii", "World", "People"}; // массив из строк, нумерация с 0
        System.out.println(str6[2]);

        System.out.println(args[0]+ " " + args[1]);




    }
}
