package CollectionOther.SetCollection;


import java.util.*;

/*
        Интерфейс Set - расширяет интерфейс Collection и хранит набор УНИКАЛЬНЫХ эл (без повторов)
        Set - по сути только ключи (уникальные значения) а в map - ключ - значение
        Основные реализации:HashSet, TreeSet, LinkedHashSet
 */
public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //Вызываем интерфейс Set <дженерик, который показывает какого типа эл будут тут храниться> название наше =
        // выбираем один из типов реализации

        set.add("text");
        set.add("text1");
        set.add("text2");
        set.add("text2");

        //set.get - не можем юзать тк в реализации используется не массив, а хеш таблица(бинароное дерево)
        // хеш таблица реализованна на массивах, а порядок реализуется по хеш коду каждого объекта - который преобразуется в индекс
        //нужно обращаться к итераторам

        for (String s : set) {
            System.out.println(s);
        }

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
        System.out.println("----------------------------------");


        //Коллекция TreeSet - позволяет хранить коллекцию в отсортированном виде (использует компаратор)
        //Компаратор - класс, содержащий функцию compare, которая сравнивает два объекта
        // для String сортировка в алфавитном порядке (сначала первые символы сравниваются, если одинаковое то вторые потом)
        Set<String> setTreeSet = new TreeSet<>();
        setTreeSet.add("textik1");
        setTreeSet.add("textik2");
        setTreeSet.add("textik9");
        setTreeSet.add("textik3");
        setTreeSet.add("textik4");
        setTreeSet.add("a");
        setTreeSet.add("ab");
        setTreeSet.add("ac");
        setTreeSet.add("г");

        for (String s : setTreeSet) {
            System.out.println(s);
        }

        //Set<User> setUser = new TreeSet<>(); // в джаве не написан компаратор для любого нам созданного объекта,
        // поэтому нам самим его создавать надо (как создать потом будет )
        // setUser.add(new User());
        System.out.println("----------------------------------");


        //LinkedHashSet -  позволяет хранить эл в порядке, в котором мы их добавляли (работает дольше чем LinkedHashSet)
        // устроен на хеш таблицах как и HashSet но использует + связанный список
        Set<String> setLinkedHashSet = new LinkedHashSet<>();
        setLinkedHashSet.add("texteki");
        setLinkedHashSet.add("textek5");
        setLinkedHashSet.add("456");
        setLinkedHashSet.add("jjjp");

        for (String s : setLinkedHashSet) {
            System.out.println(s);
        }
    }
}
