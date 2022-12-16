package JavaKurses.example;

// Пусть, У нас нет возможности создавать объекты класса Example2 без использования внутреннего метода данного класса:
// если в классе существует ТОЛЬКО прайват конструкторы, то мы не можем создавать его объекты вне самого класса

public class Example2<T> {
    private T instance;  // instance - пример

    private Example2(){};

    public static <T> void simpleInit(T instantiator){  //Инстанциатор-это реальный метод, который создает объекты.
        //Реализация дженерика для метода
        //дженерик проинициализируется тем типом, который придёт в аргументах (те в круглых скобочках( ) )
        // данный дженерик никак не связан с дженериком класса
        T obj; //

    }

    public static <T> Example2<T> init (T instantiator){ //те только с использованием этого метода init (да и simpleInit)
        // мы можем создавать объекты данного Example2 класса (в нашем случае)
        return new Example2<T>();
    }

    public void set(T obj){
        instance = obj;
    }

    public T getInstance(){
        return instance;
    }
}
