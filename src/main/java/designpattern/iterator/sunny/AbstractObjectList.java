package designpattern.iterator.sunny;

//在本实例中，为了详细说明自定义迭代器的实现过程，我们没有使用JDK中内置的迭代器，事实上，JDK内置迭代器已经实现了对一个List对象的正向遍历
import java.util.*;

//抽象聚合类
public abstract class AbstractObjectList {
    protected List<Object> objects = new ArrayList<Object>();

    public AbstractObjectList(List objects) {
        this.objects = objects;
    }

    public void addObject(Object obj) {
        this.objects.add(obj);
    }

    public void removeObject(Object obj) {
        this.objects.remove(obj);
    }

    public List getObjects() {
        return this.objects;
    }

    //声明创建迭代器对象的抽象工厂方法
    public abstract AbstractIterator createIterator();
}
