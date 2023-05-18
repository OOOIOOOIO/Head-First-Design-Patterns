package book.hfdp.ch09_iterator_pattern.dinner;

import book.hfdp.ch09_iterator_pattern.MenuItem;

import java.util.Iterator;
import java.util.function.Consumer;

public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] menuItems;
    int position;

    @Override
    public void remove() {
        throw new UnsupportedOperationException("메뉴 항목은 지우면 안됩니다.");
    }

    @Override
    public void forEachRemaining(Consumer<? super MenuItem> action) {
        Iterator.super.forEachRemaining(action);
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuItem next() {
        return null;
    }
}
