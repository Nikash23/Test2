import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        int n = 10;
        int m = 4;
        double I = n * (Math.log(m) / Math.log(2));
        System.out.println("Количество информации: " + I + " бит");
    }

    public static void task2() {
        int m = 8;
        double bits = Math.log(m) / Math.log(2);
        System.out.println("Количество бит для кодирования одного символа: " + bits);
    }

    public static void task3() {
        int k = 5;
        int m = (int) Math.pow(2, k);
        System.out.println("Максимальное количество символов, кодируемых 5 битами: " + m);
    }

    public static void task4() {
        int maxnumber = 31;
        int totalnumbers = maxnumber + 1;
        int k = 0;
        int power = 1;
        while (power < totalnumbers) {
            power *= 2;
            k++;
        }
        System.out.println("Длина кода в битах: " + k);
    }

    public static void task5() {
        double p0 = 0.5;
        double p1 = 0.5;
        double H = 0;
        if (p0 > 0) H += p0 * (Math.log(p0) / Math.log(2));
        if (p1 > 0) H += p1 * (Math.log(p1) / Math.log(2));
        H = -H;
        System.out.println("Энтропия источника: " + H + " бит");
    }

    public static void task6() {
        double pA = 0.7;
        double pB = 0.2;
        double pC = 0.1;
        double H = 0;
        if (pA > 0) H += pA * (Math.log(pA) / Math.log(2));
        if (pB > 0) H += pB * (Math.log(pB) / Math.log(2));
        if (pC > 0) H += pC * (Math.log(pC) / Math.log(2));
        H = -H;
        System.out.println("Энтропия источника: " + H + " бит");
    }

    public static void task7() {
        int m = 33;
        double I = Math.log(m) / Math.log(2);
        System.out.println("Информация, которую несёт одна буква: " + I + " бит");
    }

    public static void task8() {
        double pA = 0.5, pB = 0.3, pC = 0.2;
        int lA = 1, lB = 2, lC = 3;
        double L = pA * lA + pB * lB + pC * lC;
        double H = 0;
        if (pA > 0) H += pA * (Math.log(pA) / Math.log(2));
        if (pB > 0) H += pB * (Math.log(pB) / Math.log(2));
        if (pC > 0) H += pC * (Math.log(pC) / Math.log(2));
        H = -H;
        System.out.println("Средняя длина кода: " + L + " бит");
        System.out.println("Энтропия источника: " + H + " бит");
        if (L >= H)
            System.out.println("Кодирование эффективно (средняя длина кода >= энтропии)");
        else
            System.out.println("Кодирование неэффективно (средняя длина кода < энтропии)");
    }

    public static void task9() {
        int m = 3;
        int n = 6;
        int N = (int) Math.pow(m, n);
        System.out.println("Количество различных сообщений длины " + n + ": " + N);
    }

    public static void task10() {
        int n = 26;
        int m = 5;
        double I = n * (Math.log(m) / Math.log(2));
        System.out.println("Количество информации: " + I + " бит");
    }
}