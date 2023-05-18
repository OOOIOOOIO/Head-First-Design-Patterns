package book.hfdp.ch09_iterator_pattern;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
