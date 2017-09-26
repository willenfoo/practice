package designpattern.adapter.sunny.objectadapter;

//抽象成绩操作类：目标接口
public interface ScoreOperation {
    public int[] sort(int array[]); //成绩排序
    public int search(int array[],int key); //成绩查找
}
