package Stepik;

import java.util.Scanner; // импорт класса Scanner из пакета util

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаём экземпляр класса
        // мы инициируем(вызвать начало чего-либо, дать начало (импульс) чему-либо) новый экземпляр класса Scanner
        //и присваиваем ему имя sc

        String s1 =sc.nextLine();

        System.out.println(sc.nextLine()); // даём задание этому экземпляру считать строку командой .nextLine()

        // чтобы получить несколько объектов данных с входящего потока достаточно одного объекта сканера
        int x = sc.nextInt();
        double d = sc.nextDouble();
        String s =sc.nextLine(); // чёт не робит, мб шифт строчка с начала за строку принимает

        System.out.println(x);
        System.out.println(d);
        System.out.println(s1);

        sc.close(); // закрываем сканер

    }



    /*
    Некоторые методы, доступные через класс Scanner:
    nextInt() - ввести объект int
    nextFloat() - ввести объект float
    nextDouble() - ввести объект double
    nextBoolean() - ввести объект  boolean
    nextLine() - ввести строку целиком
    next() - ввести слово (считывается до первого пробела)
     */

}
