package CollectionOther.JavaKurses.GenericInJavaa;

public class GenericsInJava {
    public static void main(String[] args) {
        Cat cat = new Cat();
        show(cat);

       /* Flowers flowers = new Flowers();
        show(flowers); // Flowers - не детё Animal => ошибку показывает
        */

        Animal animal = new Animal();
        show(animal);


       // cat = show2(cat); те вот так уже нельзя
    }
   //также можно и ждать классы какие-либо, которые наследуют интерфейсы какието (и & между ними)
    public static <T extends Animal> T show(T value){ //МЫ можем в методе написать чтобы сюда приходили классы-дети Animal и сам Animal
        System.out.println("Прога работает");
        return value;       //что прислали то и вывели
    }
    // А в чём отличие от:
    public static Animal show2(Animal animal){ // но тут возвращается всегда енимал а не классы-дети енималов
        return animal;
    }
}

class Animal{
    public Animal(){
        System.out.println("Это животные");
    }
}

class Cat extends Animal{
    public Cat(){
        System.out.println("Это котики");
    }
}

class Flowers{
    public Flowers(){
        System.out.println("Это цветочки");
    }
}
