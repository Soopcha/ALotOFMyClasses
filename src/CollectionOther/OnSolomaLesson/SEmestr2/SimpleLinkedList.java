package CollectionOther.OnSolomaLesson.SEmestr2;
/*
класс для списка целиком - те тут будут те методы, которые мы хотим видеть операции в списке целиком
 */
public class SimpleLinkedList<T> {

    private class SimpleLinkedListNode<T> { //внутренний класс
        public T value;
        public SimpleLinkedListNode<T> next;

        public SimpleLinkedListNode(T value, SimpleLinkedListNode<T> next){
            this.value = value;
            this.next = next;
        }
    }
    public static addFirst(T value){ // value - перевод: значение

    }

    public static addLast(T value){

    }

    public T removeFirst(){

    }

    public T removeLast(){

    }

    public T remove(){

    }

    public T insert(int index, T value){ // вставить эл

    }

    public  int size (){

    }

    public T getFirst(){

    }

    public T getLast(){

    }

}
