package CollectionOther.JavaKurses;

import CollectionOther.JavaKurses.example.Example1;
import CollectionOther.JavaKurses.example.Example2;
import CollectionOther.JavaKurses.model.BaseObject;
import CollectionOther.JavaKurses.model.ChildObject;
import CollectionOther.JavaKurses.model.User;

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

        Example2.simpleInit(new User()); // по идее от метода simpleInit нет толку??

        Example2<User> example2Peremennaia = Example2.init(new User());  // тоесть вместо T подставляется юзер
        example2Peremennaia.set(new User("Alex", 30));
        System.out.println(example2Peremennaia.getInstance());
        System.out.println("------------------------------------------------------->");


        //КСТА CTRL + / ----> скоментить/расскоментить



        //ВАЙЛД кард
        List<BaseObject> listBaseObject2 = new ArrayList<>();
        List<User> listUser2= new ArrayList<>();
        List<ChildObject> listChilObject2 = new ArrayList<>();

        example1(listBaseObject2);
        example1(listUser2);
        example1(listChilObject2);

        //example2(listBaseObject2);  тут будет ошибка тк listBaseObject2 выше по иерархии
        example2(listUser2);
        example2(listChilObject2);

        example3(listBaseObject2);
        example3(listUser2);
        // example3(listChilObject2);  тут будет ошибка тк listChilObject2 ниже по иерархии

    }
    // вайлд кард - знак ?, который позволяет указать какие дженерики могут передаваться в аргументах данному методу
    // если знак ? - те лист с абсолютно любыми джинериками можем передавать

    public static void example1(List<?> list){  // кста тоже самое что и просто написать List list
        // public static void example1(List list)

    }
    //Вайлд кард, который может принимать только дженерик юзера и его потомков (чайлдОбджект, тк он наследуется от юхзера)
    //extends - User и вниз по иерархии
    public static void example2(List<? extends User> list){

    }
    //super - User и вверх по иерархии(те можем ещё и родителей использовать)
    //те в данном случае User, BaseObject и Object (тк BaseObject неявно наследуется от Object)
    public static void example3(List<? super User> list){

    }
}
