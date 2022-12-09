package learning;

public class SequenceOfLetters {

    public static void sample6_1_v00(int n) {
        int printed = 0;
        for (int repeat = 1; ; repeat = 3 - repeat) {
            for (char ch = 'a'; ch <= 'd'; ch++) { // к char мы прибавляем 1 => прибавляем 1 к коду буквы => идёт след буква
                for (int k = 0; k < repeat; k++) { // i, j, k - принятые названия для переменных цикла
                    if (printed == n) {
                        System.out.println();
                        return;
                    }
                    System.out.print(ch);
                    printed++;
                }
            }

        }


    }

    public static void sample6_1_v0(int n) {
        int printed = 0;
        int repeat = 1;
        while (true) {
            for (char ch = 'a'; ch <= 'd'; ch++) {
                for (int k = 0; k < repeat; k++) {
                    if (printed == n) { //если напечатали нужно кол-во символов, то переводим строку вниз (чтобы следущее не сливалось) и выходим
                        System.out.println();
                        return; //если бы был break - то закрылся бы только последний цикл (но можно указать, какой цикл хотим прервать
                    }
                    System.out.print(ch);
                    printed++; // счётчик напечатанных символов ++
                }
            }
            repeat = (repeat == 1) ? 2 : 1;
            // repeat присваивает: если repeat равен 1 то 2, иначе 1
            // repeat = 3 - repeat; можно тоже
        }
    }

    public static void main(String[] args) {

        sample6_1_v00(5);
        sample6_1_v00(10);
        sample6_1_v0(10);
        sample6_1_v2(10);
    }

    //но можно указать, какой цикл хотим прервать
    public static void sample6_1_v2(int n) {
        int printed = 0;
        int repeat = 1;
        outer: //метка - можно назвать как угодно (но так вроде принято)
        while (true) {
            for (char ch = 'a'; ch <= 'd'; ch++) {
                for (int k = 0; k < repeat; k++) {
                    if (printed == n) {
                        System.out.println();
                        break outer;
                    }
                    System.out.print(ch);
                    printed++; // счётчик напечатанных символов ++
                }
            }
            repeat = (repeat == 1) ? 2 : 1;
            // repeat присваивает: если repeat равен 1 то 2, иначе 1
            // repeat = 3 - repeat; можно тоже
        }
    }
}
