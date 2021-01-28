package home.netology.javacore.patterns.behave.task1;

import java.util.Iterator;

public class MyIterator implements Iterator<Integer> {


    private Randoms randoms;

    public MyIterator(int min, int max) {
        this.randoms = new Randoms(min, max);
    }

    public boolean hasNext() {
        return true;
    }


    public Integer next() {
        return randoms.getRandoms();
    }


    public void remove() {
        throw new UnsupportedOperationException();
    }

}
