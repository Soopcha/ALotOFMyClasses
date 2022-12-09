package ru.vsu.Malykhina;

import java.io.IOException;

public class ControlConstructions {

    public static void main(String[] args) throws IOException {    //конструкция, которая проверяет на ошибку

        char ch, answer = 'B'; // в переменную ch ничего не присвоили в answer присвоили B

        System.out.println("Какую букву я загадал? ");
        System.out.print("попытайтесь её угадать    "); // метод print просто продолжатет строку

        ch = (char) System.in.read(); // (char) принудительно изменить наши данные, что мы введём на тип char
        // каждый же символ закодировн числом юникод вот и можем сравнивать

        if (ch == answer) {
            System.out.println("Молодец, угадал");
        } else if (ch > answer) {
            System.out.println("Перестарался, выбирай букву выше в алфавите");
        } else {
            System.out.println("Недостарался");
        }

        // Ctrl + Alt + L - автоматическое выравнивание кода
        //ЧТобы не делать много IF else можно юзать

        int month = 3;

        String monthString;

        switch (month) {

            case 1:
                monthString = "Январь";// если значение month == 1 тогда записываем в  monthString Январь
                break;
            case 2:
                monthString = "Февраль"; // если 2 не сработало то далее, если сработало то присваеваем февраль и брейкаемся
                break;
            case 3:
                monthString = "Март";
                break;
            case 4:
                monthString = "Апрель";
                break;
            case 5:
                monthString = "Май";
                break;
            case 6:
                monthString = "Июнь";
                break;
            case 7:
                monthString = "Июль";
                break;
            case 8:
                monthString = "Август";
                break;
            case 9:
                monthString = "Сентябрь";
                break;
            case 10:
                monthString = "Октябрь";
                break;
            case 11:
                monthString = "Ноябрь";
                break;
            case 12:
                monthString = "Декабрь";
                break;

            default:
                monthString ="Незнаем такого месяца";
                break;

        }

        System.out.println(monthString);
    }
}
