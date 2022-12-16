package JavaKurses;

import JavaKurses.example.Example1;
import JavaKurses.model.User;

import java.util.*;

public class CollectionsLearning {
    //КОЛЛЕКЦИИ - структуры данных, предназначенные для хранения инфы и работы с ней
    /* List Set Map Queue - 4 вида коллекций

    В <> в java задаются параметризованные типы - ДЖЕНЕРИКИ (позволяют объявлять классы, интерфейсы и методы, где тип данных,
    которым они оперируют указан в виде параметра) те указываем какой тип данных будет храниться в этой коллекции.
    Можно создать класс, например, который будет автоматически работать с разными типами данных


Иерархия
    -Iterable (интерфейс)
        -Collection (интерфейс)
            -List
            -Set
            -Queue
        -Map (отдельно от Collection, тк разная структура)

        CTRL + N
     */
    public static void main(String[] args) {
        //размер коллекции - фактической кол-во эл, те размер не задаём сначала(как в массиве)


        List<String> list1 = new ArrayList<>(); //Список
        list1.add("str");
        list1.add("str");
        list1.add("str");
        list1.add("str");
        System.out.println("List" + " " + list1);

        Set<Integer> set1 = new HashSet<>(); // В Set (множества) - могут храниться только уникальные значения
        set1.add(1);
        set1.add(1);
        set1.add(3);
        set1.add(2);
        System.out.println("Set" + " " + set1);

        Map<Integer, String> map = new HashMap<>(); // эл в ввиде ключ - значения
        map.put(1, "str");
        map.put(1, "str2");
        map.put(3, "str");
        map.put(2, "str");
        System.out.println("Map: " + map);

        List list2 = new ArrayList(); // Лист объектов, те там всё можно хранить, но обычно такое не используют лучше конкретного типа

        // Когда проваливаемся в LIST: extends - наследует
        //<E> - это дженерик
        List<User> listUser = new ArrayList<>(); // дженерик <E> изменеится на юзер тут например
        List<String> listString = new ArrayList<>();
        List<Integer> listIntege = new ArrayList<>();
        List<Object> listObject = new ArrayList<>();

        System.out.println("------------------------------------------------------->");
        Example1<User> example1 = new Example1<>();   //создаём объект класса Example1 и передаём в дженерике User
        //те T(из Example1) поменяется на User
        System.out.println(example1.get());
        example1.set(new User("Алеха", 45));
        System.out.println(example1.get());   // по умолчанию у объектов выполняется метод toString,
        // а тк мы его в юзере переопределяли то у нас выполняется приколюшка с Hiii
        System.out.println("------------------------------------------------------->");


        //КСТА CTRL + / ----> скоментить/расскоментить


    }
}
