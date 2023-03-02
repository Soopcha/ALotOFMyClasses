package CollectionOther.OnSolomaLesson.SEmestr2;
/*
Динамические структуры данных(размер может изменяться после создания)
Списки, словари(ключ-значение), множества(есть только ключи),
стеки, очереди (2 операции - добавить в очередь, стек или извлечь из них )

Односвязанные списки
head -> [данные1; ссылка на след эл] -> [данные2; ссылка на след эл] -> [данные2; null].
Двухсвязанные списки
head -> [null; данные1; ссылка на след эл] -> [ссылка на предыдущий эл; данные2; ссылка на след эл]

ссылкой на 1 эл называют head first
ластецкая ссыль - tail last

MyListNode<Integer> head = null;
head = new MyListNode<>(5, head);
    (как-то так)

МЫ ОПИШЕМ СВОЙ СОБСТВЕННЫЙ СПИСОК
 (класс для эл списка И класс для списка целиком)
 */

import java.util.ArrayList;
import java.util.List;

public class ReadMePleas {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);


    }
}
