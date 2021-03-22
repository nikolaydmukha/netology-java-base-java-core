package home.netology.customutils.others;

import org.junit.platform.commons.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> arr  = new ArrayList<>(Arrays.asList("1", "2", "3", "4"));
        List<String> statuses = new ArrayList<>();
        List<String> statuses2 = new ArrayList<>();
        String value = null;
        statuses.add("2");
        statuses.add("11");
        statuses.add("3");
        statuses2.add("4");

        List<String> cardDetails = arr.stream()
                .filter(c -> statuses.size() == 0 || statuses.contains(c))
                .filter(c -> statuses2.size() == 0 || statuses2.contains(c))
                .filter(c -> !getOptField(value).isPresent() || getOptField(value).get().equals(c))
                .collect(Collectors.toList());
        System.out.println(cardDetails);
        System.out.println(isParamExist("key"));
    }

    private static Optional<String> getOptField(String value) {
        try {
            return StringUtils.isBlank(value) ? Optional.empty() : Optional.of(value);
        }catch(Exception e) {
            return Optional.empty();
        }
    }

    private static  boolean isParamExist(String name) {
        return !getApiFieldValue(name).isEmpty();
    }

    private static String getApiFieldValue(String name) {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        if(map.containsKey(name)) {
            return map.get(name);
        }
        return null;
    }
}
