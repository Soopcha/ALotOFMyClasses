package ru.vsu.Malykhina;

public class Variables {

    static int numberBuildingStreet = 1; // она видна для всего класса variables
    // static - означает, что эта переменная принадлежит конкретно этому классу,

    public int nuuum = 1;

    public final double constantaPI = 3.14;// final - означает, что мы переменную объявляем константой
    //те её значение нельзя будет менять



    /*

    */

    public static void main(String[] args) {
        // метод main относится к блоку кода класса variables

        int num1, num2, num3; //можно сразу создать переменные
        int numberBuilding = 141; // понятная переменная, номер дома
        /*CamelCase-  стиль написания составных слов, при котором несколько слов пишутся слитно без пробелов,
        при этом каждое слово внутри фразы пишется с прописной буквы. */

        int number_1 = 23; // через _ лучше не писать, так не принято

        // Область видимости переменных num1 num2 num3 numberBuilding number_1 - это метод main
    }
}
