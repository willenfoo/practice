package designpattern.iterator.bjsxt;

/**
 * Created by willenfoo on 2017/9/9.
 */
public class Client {

    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.addObj("1");
        myList.addObj("2");
        myList.addObj("3");

        Iterator iterator = myList.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            Object val = iterator.getObj();
            System.out.println(val);
        }
    }
}
