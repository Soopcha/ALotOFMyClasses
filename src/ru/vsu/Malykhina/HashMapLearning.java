package ru.vsu.Malykhina;
//Класс HashMap и интерфейс Map
// вроде не очень связано с функцией хеш
/*
HashMap - типо ассоциативный массив
каждый эл -- ключ - значение

 */
import java.util.Map;
import java.util.HashMap;

public class HashMapLearning {
    public static void main(String[] args) {
        Map<Integer, String> persons = new HashMap<Integer, String>();
        /* создаём коллекцию
        Типы данных в <> 1 - ключи(могут быть строки цифры и тд)   2 - значения
        коллекции работают со ссылочными типами данных
         */

        persons.put(45643, "Смирнов Гриша Евгеньев");   // ключи повторяться НЕ могут
        persons.put(45678, "Пупкин Саша Евгеньев");     // строки могут повторяться
        persons.put(95645, "Семёнов Пётр Васильевич");  // put - добавить объект

        System.out.println(persons.get(2)); // null тк нету такого ключа
        System.out.println(persons.get(45643));

        System.out.println(persons.keySet()); // получаем список всех ключей

        System.out.println(persons.values());// получаем все эл нашей коллекции

        persons.replace(45678,null); // не существует теперь чела с таким паспортом
        // .replace - метод для замены параметра
        System.out.println(persons.get(45678));
        persons.replace(45678,"Уехал");
        System.out.println(persons.get(45678));

        //.remove - метод для удаления ключа (ну и эл в нём, соответственно)
        persons.remove(45678);
        System.out.println(persons.values());

        System.out.println(persons.size()); // показывает размер нашей коллекции, те кол-во ключей
        persons.clear();                    // очищение нашей коллекции
        System.out.println(persons.values());



        persons.put(45643, "Смирнов Гриша Евгеньев");
        persons.put(45678, "Пупкин Саша Евгеньев");
        persons.put(95645, "Семёнов Пётр Васильевич");
        persons.put(95646, "Кукурузов Пётр Васильевич");

        for (Map.Entry<Integer, String> item:persons.entrySet()){ // item - название переменной
            //
            System.out.println("Ключ: " + item.getKey() + " Значение: " + item.getValue());

        }

        persons.put(45643, "ККч");
        System.out.println(persons.get(95646));

        Map<Integer, Integer> number = new HashMap<Integer, Integer>();

        number.put(1, +1);
        number.put(1, (number.get(1)+1));
        System.out.println(number.get(2));


    }








}
