package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * @author: ljf
 * @create: 2021-04-16 15:42
 * @description:
 **/
public class ReverseList<T> implements Iterable<T>{

    private List<T> list = new ArrayList<>();

    public void add(T t) {
        list.add(t);
    }

    @Override
    public Iterator<T> iterator() {
        return new ReverseIterator(list.size());
    }

    class ReverseIterator implements Iterator<T> {
        int index;

        ReverseIterator(int index) {
            this.index = index;
        }

        @Override
        public boolean hasNext() {
            return index > 0;
        }

        @Override
        public T next() {
            index--;
            return ReverseList.this.list.get(index);
        }
    }
}
