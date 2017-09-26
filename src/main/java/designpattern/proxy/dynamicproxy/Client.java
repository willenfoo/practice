package designpattern.proxy.dynamicproxy;



/**
 * Created by willenfoo on 2017/9/9.
 */
public class Client {
    public static void main(String[] args) {
        Star star = new RenameStar();

        StarHandler starHandler = new StarHandler(star);
        Star starProxy = (Star)starHandler.getProxy();
        starProxy.dingp();
    }
}
