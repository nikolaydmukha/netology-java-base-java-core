package home.netology.javacore.patterns.creational.singletontask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        Iterator<Integer> itr = source.iterator();
        while (itr.hasNext()){
            int tmp = itr.next();
            if (tmp <= treshold){
                logger.log(tmp + " не подходит под значение фильтра");
                itr.remove();
                continue;
            }
            logger.log(tmp + " подходит под значение фильтра");
        }
        return source;
    }
}
