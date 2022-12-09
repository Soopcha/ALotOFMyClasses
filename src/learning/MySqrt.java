package learning;

public class MySqrt {
    public static void main(String[] args) {
        System.out.printf("Double.isNaN(Math.sqrt(-1)) -> %b%n",Double.isNaN(Math.sqrt(-1)));
        System.out.printf("Double.isNaN(sqrt(-1)) -> %b%n",Double.isNaN(sqrt(-1)));
        System.out.printf("Math.sqrt(5) -> %.10f%n",Math.sqrt(5));
        System.out.printf("sqrt(5) -> %.10f%n",sqrt(5));
        System.out.printf("Math.sqrt(0.04376) -> %.10f%n",Math.sqrt(0.04376));
        System.out.printf("sqrt(0.04376) -> %.10f%n",sqrt(0.04376));
        // проверяем что наш метод работает, и что Math.sqrt показывает такое же значение
    }

    //Собственный sqrt
    public static double sqrt(double x) {
        final double EPS = 1E-9;//10^-9

        if (x < 0) {
            return Double.NaN;
        }
        double a = 1, b = x;
        if (x < 1) {
            a = 0;
            b = 1;
        }

        while (b - a > EPS) {
            double c = (a + b) / 2;
            if (c * c > x) {
                b = c;
            } else {
                a = c;
            }
        }

        return (a+b) /2;
    }


}



