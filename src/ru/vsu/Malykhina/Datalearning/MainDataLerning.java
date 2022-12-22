package ru.vsu.Malykhina.Datalearning;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

//Даты в джаве

public class MainDataLerning {
    public static void main(String[] args) throws InterruptedException {
        Date date1 = new Date();   // самый первый класс для работы с датой
        Date date2 = new Date();

        System.out.println("Current date: " + date1.getTime());
        long msDay = 24*60*1000*60;
        System.out.println("Years from 1970: " + date1.getTime()/msDay/365);
        System.out.println("----------------------------------");

        /*
        Инфа в классе Date - кол-во миллисекунд с 1970 года
        но при выводе происходи преобразование миллисекунд в понятный вид:  Thu Dec 22 18:46:40 MSK 2022 (те текущая дата)
         */

        System.out.println(date1);
        System.out.println(date1.getTime());//выводити миллисек с 1970
        date1.setYear(119);// устаревший метод, да и вообще Date не используется почти уже (year + 1900 рабоатет метод .setYear)
        date1.setMonth(0);// от 0 до 11 (те от Января до Декабря)

        System.out.println("----------------------------------");
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date1.after(date2)); //если данная дата будет после переданной в () даты --- true
        //если данная дата будет после переданной в () даты --- false
        System.out.println(date1.before(date2)); //наоборот
        System.out.println("----------------------------------");

        Date date12 = new Date();
        Thread.sleep(3000);  //.sleep - даём поспать проге 3000 мили сек те 3 сек
        Date newTime = new Date();
        long subtractTheDates = newTime.getTime() - date12.getTime(); //вычли разницу
        System.out.println("Time distance is: "+ subtractTheDates + "is ms(в миллисек)");
        System.out.println("----------------------------------");


        LocalDate localDate1 = LocalDate.now(); //чтобы создать используем статический метод .now, конструктор так юзать не можем тк прайвет
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalTime localTime1 = LocalTime.now();

        LocalDate localDate2 = localDate1.of(2007, Month.APRIL,20); //метод .of - задать дату
        LocalDate localDate3 = localDate1.of(2007, 1,20); // или так (месяцы от 1 до 12)
        //Month.APRIL - класс enumeration (перечисление)
        System.out.println(localDate2);
        System.out.println(localDate3);
        //LocalDateTime тоже самое вообщем с методом .of  (но и до сек можно всё дописать)



        System.out.println(date1);
        System.out.println(localDate1);
        System.out.println(localDateTime1);
        System.out.println(localTime1);

    }
}
