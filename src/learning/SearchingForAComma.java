package learning;

public class SearchingForAComma {

    //Выделение N-ой части строки, разделённой запятой
    public static String getStringPart(String str, int partIndex) { //partIndex - нужный номер запятой
        int index = -1; //index - позиция предыдущей запятой
        // находим индекс первой запятой
        for (int i = 0; i < partIndex; i++) {
            index = str.indexOf((","), index + i); //.indexOf - метод ищет первую позицию какого-то фрагмента строки
            //начиная с какой-то позиции (с позиции index + i) ( -1 + 1 мы будем искать запятую с 0 позиции)
            if (index < 0) {
                return null;
            }
        }
        // находим индекс второй запятой
        int nextIndex = str.indexOf(",", index + 1);
        if (nextIndex < 0) {
            return str.substring(index + 1).trim();
            //.substring - выделение части строки с левого символа до правого (левая граница включается, правая - нет)
            //(если правую границу не писать то просто до конца)
            //.trim - метод вернёт строку без пробелов
        } else {
            return str.substring(index + 1, nextIndex).trim();
        }
    }

    public static void main(String[] args) {
        String str = "AAa, sdf, dsds, dfdf";
        for (int i = 0; i < 10; i++) {
            String part = getStringPart(str, i);
            System.out.printf("getStringPart(\"%s\", %d) -> %s%n", str, i, part == null ? null : "\"" + part + "\"");
        }
    }
}
