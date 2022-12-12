package JavaKurses;
// OBJECT - Главный клас в джаве, тк все классы наследуются от него

public class User extends Object {

    private int age;
    // но обычно пишется public class User{} но имеется всегда ввиду public class User extends Object
    // те наш класс User может использовать все поля и методы класса Object


    // Аннотации - пометки, с помощью которых программист указывает компилятору Java  и средствам разработки что делать
    // с участком кода помимо исполнения основной проги

    @Override      // - это аннатоция, проверяет не нарушено ли правило перезаписи метода оригинального
    public String toString() {
        // return super.toString();   //super - ссылка на объект-родитель  (изначально тут было без // и выполнялся родительский метод)
        return "Hiii" + age;
    }
}
