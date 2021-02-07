package home.netology.javacore.multithreading.task3;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class SumCounter extends RecursiveAction {

    private static final long serialVersionUID = 1L;
    private static int sum = 0;

    private List<Integer> numbers;

    public SumCounter(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    protected void compute() {

        //create sub tasks if supplied array has more than one element
        if (numbers != null && numbers.size() > 1) {
            List<Integer> oneNum = new ArrayList<>();
            oneNum.add(numbers.remove(numbers.size() - 1));

            SumCounter subTaskOne = new SumCounter(oneNum);
            SumCounter subTaskTwo = new SumCounter(numbers);

            //fork and join two sub tasks
            invokeAll(subTaskOne, subTaskTwo);

        } else {
            //calculate sum of consecutive numbers
            int sum = 0;
            consecutiveNumbersSum(numbers.get(0));
        }
    }

    void consecutiveNumbersSum(int num) {
        sum += num;
    }

    public int getSum() {
        return sum;
    }
}
