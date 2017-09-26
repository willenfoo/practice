package designpattern.decorate.sunny;

public class Client {
    public static void main(String args[]) {
        Component component, componentSB;  //使用抽象构件定义
        component = new ListBox(); //定义具体构件
        componentSB = new BlackBorderDecorator(new ScrollBarDecorator(component)); //定义装饰后的构件
        componentSB.display();
    }
}
