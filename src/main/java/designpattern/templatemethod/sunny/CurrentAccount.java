package designpattern.templatemethod.sunny;

public class CurrentAccount extends Account {

    //覆盖父类的抽象基本方法
    public void CalculateInterest() {
        System.out.println("按活期利率计算利息！");
    }

}
