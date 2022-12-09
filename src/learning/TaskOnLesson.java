package learning;

// Найти N-ое по счёту число из чисел, в которых сумма всех цифр не превышает S
public class TaskOnLesson {

    public static int digitsSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10; // n = n/10
        }
        return sum;
    }

    public static int sample5(int n, int s) {
        int index = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) { //MAX_VALUE - максимальное знач для целых чисел
            if (digitsSum(i) <= s) {
                index++;
                if (index == n) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(sample5(10, 3));
    }


}
