package designpattern.state;

/**
 * Created by willenfoo on 2017/9/9.
 */
//抽象状态类
public abstract class AccountState {
    protected Account acc;
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void computeInterest();
    public abstract void stateCheck();
}
