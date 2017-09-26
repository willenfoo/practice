package designpattern.iterator.bjsxt;

/**
 * Created by willenfoo on 2017/9/9.
 */
public class MyList {
    private Object[] objects = new Object[10];

    int index = 0;

    public void addObj(Object obj) {
        objects[index] = obj;
        index++;
    }

    public Iterator iterator() {
        return new MyListIterator();
    }

    private class MyListIterator implements Iterator {

        private int currentIndex = 0;

        public void first() {
            currentIndex = 0;
        }

        public void next() {
            currentIndex++;
        }

        public boolean hasNext() {
            return currentIndex < objects.length;
        }

        public boolean hasFirst() {
            return currentIndex == 0;
        }

        public Object getObj() {
            return objects[currentIndex];
        }
    }

}
