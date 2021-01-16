package home.netology.javabase.collections.treemap.thief;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String fileUsersDB = "src/main/java/home/netology/collections/treemap/thief/users.db";
        String fileServerLog = "src/main/java/home/netology/collections/treemap/thief/server.log";

        ArrayList<Map<?, ?>> maps = parseUserDB(fileUsersDB);

        Map<Integer, User> usersInfo = (Map<Integer, User>) maps.get(0);
        Map<Integer, HashSet<String>> usersIP = (Map<Integer, HashSet<String>>) maps.get(1);


        Map<String, Integer> serverLog = parsedServerLog(fileServerLog);
        String maxServerLogIP = findMaxServerLogIP(serverLog);
        int id = findUserIdByIP(usersIP, findMaxServerLogIP(serverLog));

        System.out.println("Злоумышленник найден: ");
        System.out.printf("ФИО: %s %s %s, адрес: %s", usersInfo.get(id).getfName(), usersInfo.get(id).getiName(),
                usersInfo.get(id).getoName(), usersInfo.get(id).getAddress());
    }

    private static ArrayList<Map<?, ?>> parseUserDB(String fileName) {
        ArrayList<Map<?, ?>> users = new ArrayList<>();

        Map<Integer, User> usersInfo = new TreeMap<>();
        Map<Integer, HashSet<String>> usersIP = new HashMap<>();

        File file = new File(fileName);

        try (Scanner scanner = new Scanner(file);) {
            scanner.nextLine();                                         //игнорируем первую строку
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                ArrayList<String> parsedLine = new ArrayList<>(Arrays.asList(line.split(";")));
                User user = makeNewUser(parsedLine);


                collectUsersIP(usersIP, usersInfo, parsedLine, user);
            }
        } catch (FileNotFoundException exception) {
            System.err.println("Не найден файл " + fileName);
        }
        users.add(usersInfo);
        users.add(usersIP);

        return users;
    }

    private static User makeNewUser(ArrayList<String> parsedLine) {
        int id = Integer.parseInt(parsedLine.get(1));
        String address = parsedLine.get(3);
        String[] fio = parsedLine.get(2).split(" ");
        String fName = fio[0];
        String iName = fio[1];
        String oName = fio[2];

        return new User(id, iName, oName, fName, address);
    }

    private static void collectUsersIP(Map<Integer, HashSet<String>> usersIP, Map<Integer, User> usersInfo, ArrayList<String> parsedLine, User user) {
        String ip = parsedLine.get(0);
        if (usersIP.containsKey(user.getId())) {
            usersIP.get(user.getId()).add(ip);
        } else {
            HashSet<String> ips = new HashSet<>();
            ips.add(ip);
            usersIP.put(user.getId(), ips);
        }
        usersInfo.put(user.getId(), user);
    }

    private static Map<String, Integer> parsedServerLog(String fileName) {

        Map<String, Integer> serverLog = new HashMap<>();
        File file = new File(fileName);
        try (Scanner scanner = new Scanner(file);) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String ip = line.substring(0, line.indexOf(":"));
                if (serverLog.containsKey(ip)) {
                    serverLog.put(ip, serverLog.get(ip) + 1);
                } else {
                    serverLog.put(ip, 1);
                }
            }
        } catch (FileNotFoundException exception) {
            System.err.println("Не найден файл " + fileName);
        }

        return serverLog;
    }

    private static String findMaxServerLogIP(Map<String, Integer> serverLog) {
        int max = 0;
        String ip = null;
        for (Map.Entry<String, Integer> entry : serverLog.entrySet()){
            if (entry.getValue() > max){
                max = entry.getValue();
                ip = entry.getKey();
            }
        }
        return ip;
    }

    private static int findUserIdByIP(Map<Integer, HashSet<String>>usersIP, String maxServerLogIP) {
        for(Map.Entry<Integer, HashSet<String>> entry : usersIP.entrySet()){
            if(entry.getValue().contains(maxServerLogIP)){
                return entry.getKey();
            }
        }
        return 0;
    }

}
