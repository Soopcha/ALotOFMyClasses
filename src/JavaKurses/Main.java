package JavaKurses;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.toString(); // на Control проваливаемся и видим
        // там Control + F12 - и видим все объекты класса а именно 12 методов
        // например метод toString можно посмотреть провалившись в него
        //метод toString - используется для строкового представления нашего объекта
        // выводит название нашего класса + @ + хеш-код нашего объекта в 16-ой системе счисления
        // HASHCODE объекта - число, которое показывает номер ячейки памяти в которой хранится данный объект

        System.out.println(user1.toString());

        User user2 = new User();
        System.out.println(user2.toString());  //разные хеш коды тк объекты разные

        // метод Equals - сравнивает объект с объектом, который мы добавили в аргумент
        System.out.println(user1.equals(user2));

        // Мы можем сами под себя переделать метод toString и если буде вызывать метод toString через
        // объект класса User у нас будет подменяться оригинальная реализация toString на нашу
    }
}
