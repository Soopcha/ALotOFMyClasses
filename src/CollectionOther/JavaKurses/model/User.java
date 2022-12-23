package CollectionOther.JavaKurses.model;
// OBJECT - Главный клас в джаве, тк все классы наследуются от него

public class User extends BaseObject {
    // но обычно пишется public class User{} но имеется всегда ввиду public class User extends Object
    // те наш класс User может использовать все поля и методы класса Object
    private int age;
    private String name;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }
    public User(){};

    public void setName(String name){ this.name = name; }
    public void setAge(Integer age){ this.age = age; }




    // Аннотации - пометки, с помощью которых программист указывает компилятору Java  и средствам разработки что делать
    // с участком кода помимо исполнения основной проги

    @Override      // - это аннатоция, проверяет не нарушено ли правило перезаписи метода оригинального(те если ToString написали неправильно круасненьким подчеркнётся)
    public String toString() {
        // return super.toString();   //super - ссылка на объект-родитель  (изначально тут было без // и выполнялся родительский метод)
        return "Hiii" + age;
    }
}
