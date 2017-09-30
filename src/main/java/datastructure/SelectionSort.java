package datastructure;

public class SelectionSort {
    public static void sort(int[] array) {
        int minIndex;
        for (int i = 0; i < array.length; i++) {
            minIndex = i;
            for (int j = i; j < array.length; j++) {
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
