package ru.vsu.Malykhina.Datalearning;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TimeOfGet {
    public static void main(String[] args) {
        // эти все мотоды ради того, чтобы почекать сколько сек все это занимает
        System.out.println(getTimeOfGet(fill(new ArrayList())));
        System.out.println(getTimeOfGet(fill(new LinkedList())));
        // получается LinkedList очень медленный зачастую
        //ArrayList тут работает за константное время
    }

    private static List fill(List list) {  //мы просто создаём новый объект класса Object и суём в лист
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getTimeOfGet(List list) {
        Date startTime = new Date();
        get10000(list);
        Date endTime = new Date();
        long fin = endTime.getTime() - startTime.getTime();
        return fin;
    }

    public static void get10000(List list) {
        if (list.isEmpty()) return;
        int x = list.size()/2;

        for (int i = 0; i < 10000; i++){
            list.get(x); //10000 раз получаем эл с серидины списка (ну просто любой метод)
        }
    }


}
