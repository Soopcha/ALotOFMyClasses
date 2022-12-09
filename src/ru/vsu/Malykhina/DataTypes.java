package ru.vsu.Malykhina;

public class DataTypes {
    public static void main(String[] args) {

        byte b = 126; // 1 байт = 8 бит, от -128 до 127 (т. е. N = 2^8 = 256    ---> 128 отриц. цифр и 127 положит. и 0)
        short numberShort = 345; // 2 байта   (16 бит  -32768 - 32767 2^16 и тд)
        int number = 20;// 4 байта
        long longNum = 9000000000000l;// 8 байтов  l в конце не забыть, тк все типы компилируются от int но Long > int

        float f =35.5f; // f обязательно после, а то будет думать на int
        double d =23.123456;// d можно писать в конце а можно и не писать 15 знаков точност после точки
        double doub =23.123456d;

        char sym ='\u2122'; // в одинарных кавычках
        char ch = 't';// беззнаковое целое число, представляющее собой символ юникод UTF-16 (1 символ = 16 бит
        // (даже упрощённый китайский вместился)) utf-8 (буквы и цифры)
        // система кодирования символов числами -> кодировки
        char ch2 = 567;// можно символом а можно просто кодом символа юникод

        boolean bool = true; // занимает 4 байта тк при компиляции превращается в int но в массивах вроде 1 байт

        number = 100; // перезаписываем переменные уже без типа
        System.out.println(number);

        int num =123;
        number = num;
        System.out.println(number);

        System.out.println(b);
        System.out.println(numberShort);
        System.out.println(ch);
        System.out.println(ch2);
        System.out.println(number);
        System.out.println(longNum);
        System.out.println(sym);

        int x1 = 90;
        int x2 = 100;

        boolean bool1 = x1 > x2;
        boolean bool2 = x1 < x2;
        System.out.println(bool1);
        System.out.println(bool2);

        int c1, c2;
        int v1 = 30, v2 = 40; // способы записи объявления переменных
        String str = "Значение равно ";

        System.out.println(v1 + v2); // 70
        System.out.println(v1 + " " + v2);// 30 40
        System.out.println("v1 = " + v1);// v1 = 30
        System.out.println(str + v1); // Значение равно 30 (приводится к строчному виду)
        System.out.println(str + v1 + v2); // Значение равно 3040 (приводится к строчному виду)
        System.out.println(str + ( v1 + v2)); // Значение равно 70 (приводится к строчному виду, но соблюдается
        // очерёдность операций, сначала сложение в скобках  )
    }
}