package JavaKurses.LesonOther;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//СПИСКИ

public class ListLearning {
    public static void main(String[] args) {

        // ArrayList - массив, в котором своевременно происходит расширение путём создания
        // нового большего массива и копирования эл из старого в новый (можно это понять провалившись туда)
        // короче динамический массив который если что сам увеличится
        // capacity = 10;
        // newCapacity = (oldCapacity * 3 )/2 +1


        List<Integer> list1 = new ArrayList<>();
        // интерфейс лист <дженерик, указываем тип данных, который хотим хранить в данном списке> название переменной присваеваем ей =
        // выбираем одну из реализацией интерфейса лист (тк интерфейсы имеют только абстрактные методы, в них нет кода)
        // в интерфейсах идёт перечень методов, которые обязательно должен реализовать класс, который реализует данный интерфейс
        // ArrayList - динамический массив
        list1.add(5);   //.add - добавить эл в список (добавляется на следующий незанятый индекс) тут на 0 индекс добавится
        list1.add(7);   // тут на 1 индекс добавтся
        list1.add(8);
        list1.add(99);
        list1.add(1,9);   //1 аргумент - индекс, на который мы хотим добавить эл, 2 аргумент - сам эл
        // причём он как-бы протискивается, а все эл за ним смещаются на 1 эл назад (те вставка)

        List<Integer> list2 = new ArrayList<>(50); //можно задать в() первоначальный размер массива
        // (Ведь список типо массив)
        // (елси не создовать она изначально 10 (это называется капасити))
        list2.add(5);
        list2.add(7);
        list2.add(8);
        list2.add(99);
        list2.set(1,2);  //.set - перезаписывает эл в ячейке

        System.out.println(list1.get(0));  //.get - получаем эл
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1.size()); //возвращает фактическое кол-во эл в этом списке
        System.out.println(list2.size());


        // LinkedList - связанный список, в котором каждый эл имеет ссылки на след и предыдущий эл (но по сути на ноду но да)
        // {[]-}{-[]-}{-[]-}{-[]-}{-[]}
        // |        |               |
        //first   Node            last
        // Нода - элемент и две ссылки (на следующую и предыдущую ноду)

        // Time complexity - временная сложность алгоритма - сколько по времени будет выполняться тот или иной алгоритм
        // в одном форе наприме O(n) если  n - кол-во повторов
        List<Integer> list3 = new LinkedList<>(); //методы теже
        list3.add(5);
        list3.add(7);
        list3.add(8);
        list3.add(10);
        list3.add(955);
        list3.add(99);
        System.out.println(list3.get(4)); // теперь если мы хотим получить эл с инд 4 нам нужно пройти с 0 индекса до 3
        // где уже будет ссылка на 4 эл
        // и время на это больше тратится
        list3.add(3,4); // для того, чтобы добавить эл в серредину нам нужно перезаписать ссылку с предыдущего эл и с
        // последующего и создать новую ноду которая смотрит на соседей и не надо ничего больше перезаписывать
        // в данном случает с .add LinkedList будет быстрее

        //+ ещё в  ArrayList идёт очень большая прибавка в размере newCapacity = ((oldCapacity * 3 )/2 +1), что тоже может жрать время, а тут всё ровно
    }
}
