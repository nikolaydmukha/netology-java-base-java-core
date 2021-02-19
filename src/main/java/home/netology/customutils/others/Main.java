package home.netology.customutils.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //stream filter with conditions
        List<Integer> arr  = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List<Integer> statuses = new ArrayList<>();
        statuses.add(3);
        statuses.add(11);
        statuses.add(6);

        List<Integer> cardDetails = arr.stream()
                .filter(c -> statuses.size() == 0 || statuses.contains(c))
                .collect(Collectors.toList());
        System.out.println(cardDetails);
    }
}
