package designpattern.adapter.bjsxt;

/**
 * Created by willenfoo on 2017/9/9.
 */
public class KeyboardAdapter implements USB {

    private Adapter adapter = new Adapter();

    public void dazi() {
        adapter.dazi();
    }

}
