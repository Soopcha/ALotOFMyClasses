package ru.vsu.Malykhina.Datalearning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// ИТЕРАТОР - объект, который позволяет нам получать доступ ко всем эл коллекции (и удалять те из них, которые необходимы)

public class ExampleIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("text1");
        list.add("text2");
        list.add("text3");
        list.add("text4");
        list.add("text5");

        Iterator<String> iterator = list.iterator(); //создали иттератор листа, iterator() вызываем метод иттератор
        // (он есть у всех кроме мапы) при методе .iterator (если опять же проволиться) создаётся новый объект Itr который
        // имплементирует итератор, мы его и сохраняем в переменную
        while (iterator.hasNext()){ //.hasNext() - сетод проверяет, есть ли следующий эл в списке если есть то тру
            String element = iterator.next(); // получаем след эл в списке
            System.out.println(element);
        }
        //Работает он примерно как FOR но есть коллекция как set и там нет метода .get
        //и когда нет возможности получать эл по индексу нам нужен иттератор
        System.out.println("----------------------------------");

        for (String s: list){  //цикл Foreach (для каждого) - сокрощённая форма итератора
            //создаём переменну, с типом, что у нас в списке и говорим, что в данную переменную по очереди записываем элементы из списка
            //те переменная постоянно перезаписывается
            System.out.println(s);
        }  //НО ПО СУТИ в данном методе использвуется вот такакя конструкция:
        System.out.println("----------------------------------");


        List<String> names = List.of("Sara","Konch", "Ohpin"); // .of вместо задачи new и  add те сократили
        for (Iterator i = names.iterator(); i.hasNext();){ // помним, что первая часть for выполняется 1 раз  (Iterator i = names.iterator())
            // те всего раз получаем итератор с данного списка
            String name = (String) i.next();
            System.out.println("Name  "+ name);
        }
    }

}
