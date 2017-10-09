package datastructure.sort;

public class BubbleSort {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length; j > i; j--) {
                if (array[i] > array[j - 1]) {
                    int tmep = array[i];
                    array[i] = array[j - 1];
                    array[j - 1] = tmep;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{10,3,4,1,17,15,14};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


}
