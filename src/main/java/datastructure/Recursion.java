package datastructure;

/**
 * 递归
 * http://blog.csdn.net/it_wangxiangpan/article/details/8479227
 */
public class Recursion {

    public static void main(String[] args) {
        System.out.println(f(6));
    }

    public static int f(int n ) {
        if (1== n || 2 == n)
            return 1;
        else
            return f(n-1) + f(n-2);
    }
}
