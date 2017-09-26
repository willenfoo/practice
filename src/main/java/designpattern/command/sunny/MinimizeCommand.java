package designpattern.command.sunny;

//最小化命令类：具体命令类
public class MinimizeCommand extends Command {
    private WindowHanlder whObj; //维持对请求接收者的引用

    public MinimizeCommand() {
        whObj = new WindowHanlder();
    }

    //命令执行方法，将调用请求接收者的业务方法
    public void execute() {
        whObj.minimize();
    }
}