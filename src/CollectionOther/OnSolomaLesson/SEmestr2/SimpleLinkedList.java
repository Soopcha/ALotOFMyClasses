package CollectionOther.OnSolomaLesson.SEmestr2;

/*
класс для списка целиком - те тут будут те методы, которые мы хотим видеть операции в списке целиком
 */
public class SimpleLinkedList<T> {

    public static class SimpleLinkedListException extends Exception{ // написали ИМЕННО НАШЕ исключение, которое наследуется вообще от всех исключений
        public SimpleLinkedListException(String massage){ //наш единственный конструктор тут
            super(massage);//super - вызов конструктора предка
        }
    }

    private class SimpleLinkedListNode<T> { //внутренний класс
        public T value; // паблик чтобы не реализовать методы гет и сет, но тк всё равно к классу обращаться будем чисто из верхнего класса то инкапсуляция сохраняется
        public SimpleLinkedListNode<T> next;

        public SimpleLinkedListNode(T value, SimpleLinkedListNode<T> next) {
            this.value = value;
            this.next = next;
        }

        public SimpleLinkedListNode(T value) {
            this(value, null);
        }
    }

    private SimpleLinkedListNode<T> head = null;  // тк класс без конструктора, то автоматом переменным присвоятся значения при инициализаци
    private SimpleLinkedListNode<T> tail = null;
    private int count = 0;

    public void addFirst(T value) { // value - перевод: значение
        // операция добавления эл в начало списка
        head = new SimpleLinkedListNode<>(value);
        if (count == 0){ // те если список был пустой
            tail = head;
        }
        count++;
    }

    public void addLast(T value) {  // операция добавления эл в конец списка
        SimpleLinkedListNode<T> temp = new SimpleLinkedListNode<>(value);
        if(count == 0){ //если не было эл в списке
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        count++;
    }

    private void checkEmpty() throws SimpleLinkedListException{ // если список пустой то выкидываем исключение, а метод этот специально для этого
        if (count == 0){
            throw new SimpleLinkedListException("Empty list");
        }
    }

    public T removeFirst() throws SimpleLinkedListException { //удаление эл из начала списка(+ нужно исключение если вообще эл нет в списке)
        checkEmpty();
        T value  = head.value;;
        head = head.next;
        if (count == 1){
            tail = null;
        }
        count--;
        return value;
    }

    public T removeLast() {

    }

    public T remove() {

    }

    public T insert(int index, T value) { // вставить эл

    }

    public int size() {

    }

    public T getFirst() {

    }

    public T getLast() {

    }

}
