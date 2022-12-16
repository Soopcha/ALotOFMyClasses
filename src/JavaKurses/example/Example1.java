package JavaKurses.example;

public class Example1 <T>{  //мы написали собственный класс с использованием дженериков
    //наш дженерик - T
    // в <> может быть какая угодно буква, но T часто используется тк это сокращение от type
    // в map, к примеру, дженерики называются K и V (key и value)
    private T instance;   // создали прайвет переменную instance с типом дженерика
    // по умолчанию в ней null

    // и два метода:
    public T get(){
        return instance;
    }

    public void set(T obj){
        instance = obj;
    }

}
