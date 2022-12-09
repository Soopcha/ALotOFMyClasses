package cs.course1;

import ru.vsu.cs.util.ArrayUtils;

import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        //test0();
        //test1();
        //test2();
        //test3();
        test4();
    }

    public static void test0() {
        int[] a = { 1, 2, 3, 4, 5 };
        a[2] = 33;
        int[] b = a;
        b[3] = 40;
        System.out.println(ArrayUtils.toString(a));
        System.out.println(ArrayUtils.toString(b));
        a = new int[3];
        a[0] = -1;
        b[0] = -10;
        System.out.println(ArrayUtils.toString(a));
        System.out.println(ArrayUtils.toString(b));
        a = null;
        System.out.println(ArrayUtils.toString(a));
        System.out.println(ArrayUtils.toString(b));
    }

    public static void printArr2(int[][] arr2) {
        for (int r = 0; r < arr2.length; r++) { //r - row ряд
            if (arr2[r] == null) {
                System.out.println("null");
            } else {
                for (int c = 0; c < arr2[r].length; c++) { //c - column колонка
                    System.out.print((c > 0 ? ", " : "") + arr2[r][c]);
                }
                System.out.println();
            }
        }
    }

    public static void printArr2_2(int[][] arr2) {
        for (int[] row : arr2) {
            if (row == null) {
                System.out.println("null");
            } else {
                for (int c = 0; c < row.length; c++) {
                    System.out.print((c > 0 ? ", " : "") + row[c]);
                }
                System.out.println();
            }
        }
    }

    public static void test1() {
        int[][] arr2 = new int[5][3];
        arr2[1][2] = 12;
        printArr2(arr2);
        System.out.println("-----------");
        arr2[2] = null;
        arr2[3] = new int[7];
        printArr2(arr2);
        System.out.println("-----------");
        int[] tmp = arr2[3];
        arr2[3] = arr2[4];
        arr2[4] = tmp;
        printArr2(arr2);
        System.out.println("-----------");
        int[] row = arr2[3];
        row[0] = 30;
        printArr2(arr2);
        System.out.println("-----------");
    }


    public static void test2() {
        int[][] arr2 = new int[7][6];
        for (int r = 0; r < arr2.length; r++) {
            for (int c = 0; c < arr2[r].length; c++) {
                arr2[r][c] = r * 10 + c;
            }
        }

        printArr2(arr2);
        System.out.println("---------------");

        reverseRows(arr2);

        printArr2(arr2);
        System.out.println("---------------");

        reverseColumns(arr2);

        printArr2(arr2);
        System.out.println("---------------");
    }


    // перестановка строк наоборот в массиве
    public static void reverseRows(int[][] arr2) {
        for (int r = 0; r < arr2.length / 2; r++) {
            int[] temp = arr2[r];
            arr2[r] = arr2[arr2.length - r - 1];
            arr2[arr2.length - r - 1] = temp;
        }
    }

    // перестановка столбов
    public static void reverseColumns(int[][] arr2) {
        // arr2.length - кол-во строк
        // arr2[0].length - кол-во столцов
        int rowsCount = arr2.length;   // заводим такие переменные для красоты
        int colsCount = arr2[0].length;
        for (int r = 0; r < rowsCount; r++) {
            /*
            for (int c = 0; c < colsCount / 2; c++) {
                int temp = arr2[r][c];
                arr2[r][c] = arr2[r][colsCount - c - 1];
                arr2[r][colsCount - c - 1] = temp;
            }
            */
            int[] row = arr2[r];
            for (int c = 0; c < colsCount / 2; c++) {
                int temp = row[c];
                row[c] = row[colsCount - c - 1];
                row[colsCount - c - 1] = temp;
            }
        }
        /*
        for (int[] row : arr2) {
            for (int c = 0; c < row.length / 2; c++) {
                int temp = row[c];
                row[c] = row[colsCount - c - 1];
                row[colsCount - c - 1] = temp;
            }
        }
         */
    }

   // тоже меняем значения столбцов разбтиый на 2 НАЧАЛО
    // тут перебираем числа и говорим поменять значения столбцов
    public static void reverseColumns2(int[][] arr2) {
        int colsCount = arr2[0].length;
        for (int c = 0; c < colsCount / 2; c++) {
            swapColumns(arr2,  c, colsCount - c - 1);
        }
    }

    //в каждой строке массива меняем значение столбцов, которые задали поменять
    public static void swapColumns(int[][] arr2, int c1, int c2) {
        for (int[] row : arr2) {
            int temp = row[c1];
            row[c1] = row[c2];
            row[c2] = temp;
        }
    }
    // КОНЕЦ



    /*
       Найти индекс строки с минимальной суммой элементов
     */
    public static void test3() {
        int[][] arr2 = ArrayUtils.createRandomIntMatrix(9, 3, 0, 100);

        System.out.println(ArrayUtils.toString(arr2));
        System.out.println("---------------");
        System.out.printf("indexOfMinSumRow(arr2) -> %d%n", indexOfMinSumRow(arr2));
        System.out.println("---------------");

        arr2 = ArrayUtils.createRandomIntMatrix(3, 7, 0, 100);
        System.out.println(ArrayUtils.toString(arr2));
        System.out.println("---------------");
        System.out.printf("indexOfMinSumCol(arr2) -> %d%n", indexOfMinSumCol(arr2));
        System.out.println("---------------");
    }

    /*
    public static int indexOf(int[] arr1, int value) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int lastIndexOf(int[] arr1, int value) {
        for (int i = arr1.length - 1; i >= 0; i--) {
            if (arr1[i] == value) {
                return i;
            }
        }
        return -1;
    }
     */

    //Находим индекс
    public static int indexOfMin(int[] arr1) {
        int minIndex = 0;
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] < arr1[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Поиск индекса строки с минимальной суммой элементов
    public static int indexOfMinSumRow(int[][] arr2) {
        /*
        int minIndex = 0;
        for (int i = 1; i < arr2.length; i++) {
            if (sum(arr2[i]) < sum(arr2[minIndex])) {
                minIndex = i;
            }
        }
        return minIndex;
         */
        int minIndex = 0;
        int minRowSum = sum(arr2[minIndex]);
        for (int i = 1; i < arr2.length; i++) {
            int rowSum = sum(arr2[i]);
            if (rowSum < minRowSum) {
                minIndex = i;
                minRowSum = rowSum;
            }
        }
        return minIndex;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int v : arr) {
            sum += v;
        }
        return sum;
    }

    // Поиск индекса СТОЛБЦА с минимальной суммой элементов
    public static int indexOfMinSumCol(int[][] arr2) {
        int minIndex = 0;
        int minColSum = columnSum(arr2, minIndex);
        for (int c = 1; c < arr2[0].length; c++) {
            int colSum = columnSum(arr2, c);
            if (colSum < minColSum) {
                minColSum = colSum;
                minIndex = c;
            }
        }
        return minIndex;
    }

    public static int columnSum(int[][] arr, int colIndex) {
        int sum = 0;
        for (int[] row : arr) {
            sum += row[colIndex];
        }
        return sum;
    }


    // записываем в массив студентов из файла
    public static class Student {
        String fio;
        String studNumber;
        String phone;

        public Student(String fio, String studNumber, String phone) {
            this.fio = fio;
            this.studNumber = studNumber;
            this.phone = phone;
        }
    }


    public static void test4() {
        // students[i][j][k], где
        // i - номер курса
        // j - номер группы
        // k = порядковый номер студента
        Student[][][] students = null;

        try {
            students = loadStudents(Paths.get(".", "input", "students.txt").toString());
        } catch (Exception e) {
            System.err.println("Ошибка загруки студентов!");
            return;
        }

        printStudents(students);
    }

    public static Student[][][] loadStudents(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename)); // читаем студентов из файла
        // filename - имя файла

        Student[][][] students = new Student[6][][];
        int courseNum = 1, grNum = 1;
        while (scanner.hasNextLine()) {          //пока у нас есть строки которые мы можем прочитать
            String line = scanner.nextLine();    //читаем очередную строчку
            if (line.length() == 0) {
                continue;                        //если строка пустая переходим к следующей итерации(повторению) этого цикла while
            }
            if (Character.isDigit(line.charAt(0))) {    // .isDigit - метод класса Character, который позволяет узнать является ли символ цифрой
                // line.charAt(0) - взяли 0-вой символ строки
                String[] parts = line.split(" ");  // делим строку на части методом .split, в качестве разделителя - пробел " "
                if (parts[1].equals("курс")) {          // если вторая часть, те с индексом 1 (тк индексы с 0) == "курс"
                    courseNum = Integer.parseInt(parts[0]) - 1; // тогда изменяем значение группы
                    // Функция parseInt преобразует первый переданный ей аргумент в строковый тип, интерпретирует его
                    // и возвращает целое число или значение NaN
                    // -1 тк это будут наши индексы в нашей структуре данных (массиве)
                }
                if (parts[1].equals("группа")) {                // если вторая часть == "группа"
                    grNum = Integer.parseInt(parts[0]) - 1;     // изменяем значение группы
                }
                continue;                                 // если мы не ту не ту строчку не прочли значит эта строчка со студентами
            }
            String[] parts = line.split("\\s*,\\s*"); // делим строку, в качестве разделителя - "," у которой до и после могут быть пробелы
            Student stud = new Student(parts[0], parts[1], parts[2]); // создаём нового студента, даём ему фамилию, номер студака и номер телефона
            // теперь нам нужно записать куда-то нашего студента
            if (students[courseNum] == null) {              // если в нашем массиве под номером курса нет этого курса
                students[courseNum] = new Student[20][];    // то создаём массив из 20 элементов в этом номере курса
            }
            if (students[courseNum][grNum] == null) {       // смотрим, есть ли в этом курсе следующая группа
                // (те есть ли в нашем массиве под номером группы что-то)
                students[courseNum][grNum] = new Student[40]; // если под номером группы ничего нет, то создаём в группу массив из 40 студентов
                //(если что это мы ща уже много подмассивчиков взаимосвязанных создаём)
            }
            int index = 0; // ищем первую свободную ячейку для студента, те первый индекс который null
            Student[] group = students[courseNum][grNum]; // создали переменную group, указывающую на одномерный массив из студентов
            // но ссылка всё также на наш огромный массив с курсами, группами
            while (group[index] != null) {  // перебираем этот массив пока ячейка не будет null
                index++;
            }
            group[index] = stud; // добавляем в ячейку с null студента
        }

        return students;
    }

    // распечатка наших студентов
    public static void printStudents(Student[][][] students) {
        if (students == null) {
            return;
        }

        boolean first = true;
        for (int courseNum = 0; courseNum < students.length; courseNum++) {
            if (students[courseNum] == null) {  // если в курсе нет студентов то переходим к следующему курсу
                continue;
            }

            if (first) {
                first = false;
            } else {
                System.out.printf("%n%n"); //если уже первый курс был записан, то после него нужен пробел ()
            }
            System.out.printf("%d курс%n", courseNum + 1); // печатаем номер курса

            Student[][] course = students[courseNum];
            for (int groupNum = 0; groupNum < course.length; groupNum++) {
                if (course[groupNum] == null) {
                    continue;
                }

                System.out.printf("%n%d группа%n", groupNum + 1);
                for (Student stud: course[groupNum]) {
                    if (stud == null) {
                        break;
                    }

                    System.out.printf("%s, %s, %s%n", stud.fio, stud.studNumber, stud.phone);
                }
            }
        }
    }
}
