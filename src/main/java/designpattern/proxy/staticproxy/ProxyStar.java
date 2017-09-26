package designpattern.proxy.staticproxy;

/**
 * Created by willenfoo on 2017/9/9.
 */
public class ProxyStar implements Star {

    private Star reRart = new RenameStar();

    public void dingp() {
        System.out.println("代理来了");
        reRart.dingp();
    }
}
