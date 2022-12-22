package ru.vsu.Malykhina.Datalearning;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TimeOfIncsert {
    public static void main(String[] args) {
        // эти все мотоды ради того, чтобы почекать сколько сек все это занимает
        System.out.println(getTimeOfInsert(fill(new ArrayList())));
        System.out.println(getTimeOfInsert(fill(new LinkedList())));
        // получается LinkedList в данном случае быстрее (со вставкой)
        //LinkedList тут работает за константное время
    }

    private static List fill(List list) {  //мы просто создаём новый объект класса Object и суём в лист
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getTimeOfInsert(List list) {
        Date startTime = new Date();
        insert10000(list);
        Date endTime = new Date();
        return endTime.getTime() - startTime.getTime();
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++){
            list.add(0,new Object());
        }
    }
}
