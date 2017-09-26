package designpattern.templatemethod.sunny;


public class Client {
    public static void main(String args[]) {
        Account account;

        account = new SavingAccount();
        account.Handle("张无忌", "123456");

    }
}
