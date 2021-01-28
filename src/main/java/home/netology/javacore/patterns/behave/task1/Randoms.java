package home.netology.javacore.patterns.behave.task1;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    private int min;
    private int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getRandoms() {
        return random.nextInt(max + 1 - min) + min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator(min, max);
    }
}