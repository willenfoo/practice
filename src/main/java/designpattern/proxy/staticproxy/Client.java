package designpattern.proxy.staticproxy;

/**
 * Created by willenfoo on 2017/9/9.
 */
public class Client {
    public static void main(String[] args) {
        Star star = new ProxyStar();
        star.dingp();
    }
}
