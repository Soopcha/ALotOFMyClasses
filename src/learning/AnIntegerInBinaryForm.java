package learning;

public class AnIntegerInBinaryForm {

    // Представление числа в двоичном виде
    public static String intToBin_v0(int n) {
        String result = "";
        for (int i = Integer.SIZE - 1; i > 0; i--) { //Integer.SIZE - кол-во бит в числе типа int(32)
            result += (n >> i) & 1; // тут создаётся новая строчка каждый раз ==> долго будет прога работать
        }
        return result;
    }

    // Представление числа в двоичном виде ВЕРСИЯ ПРАВИЛЬНАЯ
    public static String intToBin(int n){
        StringBuilder result = new StringBuilder();
        //StringBuilder - класс, позволяющий манипулировать со строками, таким образом, что новые объекты не создаются
        for (int i =Integer.SIZE-1; i>0;i--){
            result.append((n>>i)&1); // .append -метод, в конец добавляет некоторое значение (1 или 0 в нашем случае)
        }
        return result.toString(); // запрашиваем у StringBuilder созданную строчку
    }

    public static void main(String[] args) {

        System.out.printf("IntToBin(%1$10d) -> %2$s%n", 11, intToBin(11)); // 10d - значит число в виде 10 символов
        // (заполнялось лишнее пробелами)
        //if (true) return;// выходим из функции
        /* можно было бы просто записать return, и как бы после него конец проги, но то,
        что записано ниже считалось бы ошибкой
        printf - форматированный вывод
        d - (просто) то вывелось бы лишь 11
        010d - 10 символов, но заполнялось лишнее 0
        %n - перевод строки
        %d - для целых чисел(?)
        %s - для строк
         */
        System.out.printf("IntToBin(%1$010d) -> %2$s%n", ~2, intToBin(~2));
        System.out.printf("IntToBin(%1$10d) -> %2$s%n", ~1, intToBin(~1));
        System.out.printf("IntToBin(%1$10d) -> %2$s%n", ~11, intToBin(~11));
        // как-то связано с двоичным вычитанием где ещё +1 прибавляется ТОИнф
        // если старший разряд 1 ==> число отрицательное
        if (true) return;// выходим из функции
    }


}




