package CollectionOther.MapCollection;
/*
КОллекция Map
Интерфейс Map<K, V> представляет отображение (словарь), где каждый эл представляет пару "Ключ - значение"
При этом все ключи уникальны в рамках объекта Map
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/*  Реализации
HashMap - основан на хеш-таблицах (внутри обычный массив который хранит ноды)
TreeMap - основан на бинарном красно-чёрном дереве
LinkedHashMap - использует связной список для упорядачивания эл

 */
/*
HashMap
17 % 16 = 1 (остаток от деления)
ДОДЕЛАТЬ БЫ
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new  HashMap<>();
        //указываем интерфейс<тип ключа, тип значения> название = указываем реализацию
        map.put("text", 5);//передаём значения (вместо .add)
        map.put("text", 7);
        map.put("text1", 7);
        map.put("text2", 7);
        map.put(null, 7); //одну пару и с null можно сделать (одну тк вторая уже будет перезаписывать 1-ую)
        map.put(null, 8);

        for (Map.Entry<String, Integer> entry : map.entrySet()) { //iter   map.entrySet() - и ключ и значение
            // .Entry - вложенный интерфейс в интерфейсе Map
            // Entry - переводится как вход
            System.out.println(entry); // увидели одну пару тк ключи не должны повторяться => они перезаписываются
        }
        //ИЛИ (тоже самое)
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        // =обращаемся к коллекции map. записываем все пары из map в set (для того,чтобы получить итератор для прохождения по данным эл)
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry);
        }

        System.out.println("-----------------------------------------");
        Map<Integer, String> map2 = new  HashMap<>();
        map2.put(19,"text1");
        map2.put(35,"text2");
        map2.put(17,"text3");
        map2.put(4,"text4");
        map2.put(16,"text5");
        map2.put(null,"text6");
        map2.put(19,"text7");

        for (Map.Entry<Integer, String> entry : map2.entrySet()) {
            System.out.println(entry);
        }
    }
}
