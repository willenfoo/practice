package designpattern.adapter.bjsxt;

/**
 * Created by willenfoo on 2017/9/9.
 */
public class Client {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        USB usb = new KeyboardAdapter();
        notebook.dazi(usb);
    }
}
