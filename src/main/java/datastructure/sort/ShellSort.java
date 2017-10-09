package datastructure.sort;

public class ShellSort {
    public static void sort(int[] array) {
        int h = 1; //初始化一个间隔
        // 计算最大间隔
        while (h < array.length / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            // 进行插入排序，
            int temp;
            for (int i = h; i < array.length; i++) {
                temp = array[i];
                int j = i;
                while (j > (h - 1) && array[j - h] >= temp) {
                    array[j] = array[j - h];
                    j -= h;
                }
                array[j] = temp;
            }
            h = (h - 1) / 3;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{10, 3, 4, 1, 17, 15, 14};
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
