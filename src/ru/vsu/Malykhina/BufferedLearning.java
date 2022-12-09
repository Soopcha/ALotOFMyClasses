package ru.vsu.Malykhina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedLearning {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());

        if (num1 < num2 | num1 == 18){ // | - тоже самое что и ||, но в || если одно условие true второе не проверяется
            // и выводится true а в | всегда проверяются оба условия
            // короче это нужно если мы хотели бы проверить и например что-то в консоль вывести заодно

            System.out.println("Вы ввели 18 и оно больше чем"+ num2);
        }

        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        String str= reader.readLine();

        while (str.equals("exit")){
            System.out.println(str);
            str=reader.readLine();
        }


    }
}
