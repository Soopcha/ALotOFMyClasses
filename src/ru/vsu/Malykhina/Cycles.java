package ru.vsu.Malykhina;
//ЦИКЛЫ for, wile, do wile

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cycles {

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 5; i++) {
            // сначала инициализируем(создадим и дадим значение) переменную;
            // далее условие для цикла, до которого он будет повторяться; (пока i меньше 5 уцикл будет повторяться)
            //далее итерация, то, что будет происходить каждый круг цикла

            System.out.println("Итерация" + i);
        }

        for (int i = 0; (char) System.in.read() != 'S'; i++) {
            //условие изменилось - будет читать то, что мы написали и если это не S то идём далее
            System.out.println("Итерация" + i);
            // по 2 этерации выходит из=за того, что строку переносим (мб это тоже считается за символ)
        }

        int i = 0;
        for (; i < 5; ) {   //условие эттерации можно выносить из под скобок но это читается хуже
            // инициализацию тоже можно вынести НО НЕ ДЕЛАТЬ ТАК НЕ ПРОЧТЁШЬ
            System.out.println("Итерация" + i);
            i++;
        }

        // ЦИКЛ WHILE
        int count = 0;
        while (count < 10) {   // делать пока count < 10, если count>= 10 то цикл не будет начинаться
            System.out.println(count);
            count++;
        }

        // ЦИКЛ DO WHILE
        count = 10;   // - один раз операция цикла пройдёт в любом случае
        do {
            System.out.println(count);
            count++;
        } while (count < 10);

        count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;

            if (count == 5) break; // брейкаться можно   BREAK - заверщает цикл
        }

        // пропустим нечётные числа выведем только чётные
        count = 0;
        while (count < 10) {
            count++;
            if ((count % 2) != 0) continue;  // CONTINUE - пропускает одну эттерацию данного цикла
            //если count  не делится на 2  без остатка (те делится с остатком) то continue,
            // при котором мы начинаем цикл сначала( а то что дальше после continue было не смотрится)
            System.out.println(count);
        }

    }


}
