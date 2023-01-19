import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] intAr = { 8, 42, 77, 66, -50, 10, 32, 1 };
        for (int i = 0; i < intAr.length; i++) {
            System.out.print(intAr[i] + " ");
        }
        System.out.println();
        bubbleSort(intAr, intAr.length);
        System.out.println("bubbleSort(intAr,n) gets:");
        for (int i = 0; i < intAr.length; i++) {
            System.out.print(intAr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] intAr, int end) {
        if (end == 1)
            return;

        for (int i = 0; i < end - 1; i++) {
            if (intAr[i] > intAr[i + 1]) {
                swap(intAr, i, i + 1);
            }
        }

        bubbleSort(intAr, end - 1);
    }

    public static void swap(int[] intAr, int i, int j) {
        int t = intAr[i];
        ;
        intAr[i] = intAr[j];
        intAr[j] = t;
    }
}