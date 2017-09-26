package designpattern.factory.abstractfactory;

//Spring组合框类：具体产品
public class SpringComboBox implements ComboBox {
    public void display() {
        System.out.println("显示绿色边框组合框。");
    }
}
