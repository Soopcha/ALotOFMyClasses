package CollectionOther.JavaKurses.GenericInJavaa;

import java.util.ArrayList;
import java.util.List;

/*
Wildcards(групповые символы) - ?, extends class, & super class
обычно юхают с массивами
 */
public class WildCardLearnig {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Double> list2 = new ArrayList<>();
        list2.add(1.2);
        list2.add(1.4);

        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Cat());

        chek1(list);
        chek1(list2);
        chek2(animals);
        chek3(animals);
        //chek3(list); те вот тут уже ошибка


    }

    public static void chek1(List<?> list){ // придёт лист, где тип объекта - можнт быть любой
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
    }

    public static void chek2(List<? extends Animal> list){ // придёт некий массив, где будут эл либо Animal либо его детей
        //(те поставили верхний лимит)
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
    }

    public static void chek3(List<? super Animal> list){ //Принимает родителей Animal и самого Animal (те поставили ижний предел)
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
    }

    //ОТличия двух следующих методов:
    public static void compare1 (List<?> list){ // нельзя тут наследовать интерфейсы и классы кроме 1, только к одному классу ориентация

    }

    public static <T> void compare2(List<T> list){  //T всё же един, например в обьекте мы уже т выбрали то и с этим же
        //типом потом и работаем в этом методе
        // тут нельзя юзать super почему-то

    }
}
