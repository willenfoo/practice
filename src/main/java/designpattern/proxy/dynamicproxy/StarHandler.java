package designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by willenfoo on 2017/9/9.
 */
public class StarHandler implements InvocationHandler {

    private Star star;

    public StarHandler(Star star) {
        this.star = star;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("看你有没有权限");
        Object result = method.invoke(star, args);
        return null;
    }

    /**
           * 获取目标对象的代理对象
        * @return 代理对象
          */
  public Object getProxy() {
       return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
               star.getClass().getInterfaces(), this);
         }

}
