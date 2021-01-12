package main.java.home.javarush.javaSyntax.task16.task1616;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

public class Solution {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingTime());
    }

    static TreeSet<String> getSortedZones() {
        //напишите тут ваш код
        TreeSet<String> zones = new TreeSet<>();
        for(String zoneId : ZoneId.getAvailableZoneIds()){
            zones.add(zoneId);
        }
        return zones;
    }

    static ZonedDateTime getBeijingTime() {
        //напишите тут ваш код
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");

        return ZonedDateTime.now(zoneId);
    }
}
