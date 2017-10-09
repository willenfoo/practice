package datastructure.sort;

public class SelectionSort {
    public static void sort(int[] array) {
        int k;
        for (int i = 0; i < array.length; i++) {
            k = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    k = j;
                }
            }
            if (i != k) {
                int temp = array[i];
                array[i] = array[k];
                array[k] = temp;
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
