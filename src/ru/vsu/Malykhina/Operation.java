package ru.vsu.Malykhina;

public class Operation {

    public static void main(String[] args) {

        int num1 =3;
        int num2 = 4;

        int result = num1 + num2;

        System.out.println("Результат:" + result);
        System.out.println("Результат:" + num1 + num2);// конкатенация строк

        int result2 = num1 - num2;
        int result3 = num1 / num2;//целая часть лишь от деления
        int result4 = num1 % num2;// остаток от деления

        System.out.println("Результат:" + result2);
        System.out.println("Результат:" + result3);
        System.out.println("Результат:" + result4);

        int num3 = 7;
        int num4 = num3++; // num2 = num1 + 1; ++ - это инкремент  -- - это дикремент
        /*НО  int num4 = num3++ (снчала мы получим результат а затем добавим 1(добавим 1 уже только к num3,
        num4 будет равено num 3 прошлому, ещё без пребавленной 1)
        ИСПОЛЬЗОВАТЬ ЭНКРЕМЕНТЫ/ДИКРЕМЕНТЫ с числом счиатется НЕДОПУСТИМЫМ
        // )   int num4 = ++num3 (сначала мы добавим 1 и потом получим результат)*/
        int num5 = num4;

        System.out.println(num5);
        System.out.println(num3);


        num3 = 7;
        num4 = ++num3; // num2 = num1 + 1;
        num5 = num4;

        System.out.println(num5);

        // в if проверка - правда или неправда
        //можно также сравнить на > < >= <=
        if (num4 == num5){   //сравниваем на равенство
            System.out.println("Результат равен");
        } else {
            System.out.println("Резульат не равен");
        }

        if (num4 != num5){  //сравниваем на неравенство
            System.out.println("Результат  не равен");
        } else {
            System.out.println("Резульат равен");
        }


        // лог оператор И &&
        num1=1;
        num2=1;
        num3=2;

        if (num1 == num2 && num3 > num2){
            System.out.println("1 равен 2 и  3 больше 2");
        } else {
            System.out.println("что-то не совпадает условю");
        }

        // ЛОГ оператор ИЛИ ||
        if (num1 == num2 || num3 == num2){
            System.out.println("1 равен 2 или  3 больше 2");
        } else {
            System.out.println("ничего условию не совпадает");
        }

    }
}
