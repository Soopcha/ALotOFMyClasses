package learning;

public class LetterPyramid {

    /**
     * Пример 8
     * <p>Печать треугольника из символов:
     * <pre>
     * abcaabbccaaabbbc
     * ccaaaabbbbcccca
     * aaaabbbbbccccc
     * aaaaaabbbbbbc
     * cccccaaaaaaa
     * bbbbbbbcccc
     * cccaaaaaaa
     * abbbbbbbb
     * cccccccc
     * aaaaaaa
     * aabbbb
     * bbbbb
     * cccc
     * ccc
     * cc
     * a
     * </pre>
     * <p>Реализация выполнена модификацией примера 6.2
     * @param h высота треуголника
     */

    public static void sample0(int h){ // почему не робит
        int printedInRow = 0;
        int rowLen = h;
        for (int repeat = 1; ; repeat++){
            for (char ch = 'a'; ch <= 'c'; ch ++){
                for (int k = 0; k < repeat; k++){
                    if (printedInRow ==rowLen){
                        System.out.println();
                        rowLen--;
                        printedInRow = 0;
                        if (rowLen == 0){
                            return;
                        }
                    }
                    System.out.println(ch);
                    printedInRow++;
                }
            }
        }
    }
    public static void sample8(int h) {
        int printedInRow = 0;
        int rowLen = h;
        for (int repeat = 1; ; repeat++) {
            for (char ch = 'a'; ch <= 'c'; ch++) {
                for (int k = 0; k < repeat; k++) {
                    if (printedInRow == rowLen) {
                        System.out.println();
                        rowLen--;
                        printedInRow = 0;
                        if (rowLen == 0) {
                            return;
                        }
                    }
                    System.out.print(ch);
                    printedInRow++;
                }
            }
        }
    }

    public static void main(String[] args) {
        sample8(5);
        sample0(5);
    }
}
