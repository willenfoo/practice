package designpattern.factory.abstractfactory;

//Spring按钮类：具体产品
public class SpringButton implements Button {
    public void display() {
        System.out.println("显示浅绿色按钮。");
    }
}
