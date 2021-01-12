package main.java.home.netology.javabase.collections.hashmap.transportbase;

import main.java.home.netology.javabase.collections.hashmap.transportbase.transportеtype.BaseTransport;
import main.java.home.netology.javabase.collections.hashmap.transportbase.transportеtype.abstractfactory.*;
import main.java.home.netology.javabase.collections.hashmap.transportbase.transportеtype.features.BodyTypes;
import main.java.home.netology.javabase.collections.hashmap.transportbase.transportеtype.features.EngineTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class Main {

    static HashSet<BaseTransport> transportBase = new HashSet<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите тип ТС:");
            showTransportTypes();
            String bodyType = scanner.nextLine();
            if (bodyType.isEmpty()) {
                break;
            }

            System.out.println("Введите информацию о ТС (в формате: номер, марка, цвет): ");
            String abstractTransport = scanner.nextLine();

            System.out.println("Выберите тип двигателя: ");
            showEnginesTypes();
            int engineType = scanner.nextInt();
            scanner.nextLine();

            BaseTransport newTransport = makeTransport(parseTransportInfo(abstractTransport), Integer.parseInt(bodyType), engineType);
            addTransportToBase(newTransport);
        }
        printTransportBase();
    }

    private static BaseTransport makeTransport(ArrayList<String> transportInfo, int bodyType, int engineType) {
        TransportFactory factory = getFactory(bodyType);
        String tsNumber = transportInfo.get(0).trim();
        String tsModel = transportInfo.get(1).trim();
        String tsColor = transportInfo.get(2).trim();
        EngineTypes tsEngine = EngineTypes.values()[engineType - 1];
        factory.createTransport(tsNumber, tsModel, tsColor, tsEngine);
        return (BaseTransport) factory.createTransport(tsNumber, tsModel, tsColor, tsEngine);
    }

    private static void addTransportToBase(BaseTransport baseTransport) {
        transportBase.add(baseTransport);
    }

    private static TransportFactory getFactory(int bodyType) {
        switch (bodyType - 1) {
            case 0:
                return new CarsFactory();
            case 1:
                return new BusFactory();
            case 2:
                return new TrucksFactory();
            case 3:
                return new MotorcyclesFactory();
            case 4:
                return new TramsFactory();

            default:
                throw new IllegalArgumentException("Couldn`t found the proper transport factory.");

        }
    }

    private static void showTransportTypes() {
        for (BodyTypes bodyType : BodyTypes.values()) {
            System.out.println(BodyTypes.valueOf(bodyType.toString()).ordinal() + 1 + ". " + bodyType);
        }
    }

    private static void showEnginesTypes() {
        for (EngineTypes engineType : EngineTypes.values()) {
            System.out.println(EngineTypes.valueOf(engineType.toString()).ordinal() + 1 + ". " + engineType);
        }
    }

    private static ArrayList<String> parseTransportInfo(String abstractTransport) {
        return new ArrayList<>(Arrays.asList(abstractTransport.split(",")));
    }

    private static void printTransportBase() {
        ArrayList<HashSet<BaseTransport>> transportByType = new ArrayList<>(5);


        for (HashSet<BaseTransport> type : filterTransport()) {
            for (BaseTransport transport : type) {
                System.out.printf("Тип %s: Марка %s. Номер %s. Цвет %s.\n", transport.getType(), transport.getModel(), transport.getNumber(), transport.getColor());
            }
        }
    }

    private static ArrayList<HashSet<BaseTransport>> filterTransport() {

        ArrayList<HashSet<BaseTransport>> transportByType = new ArrayList<>(5);

        HashSet<BaseTransport> cars = new HashSet<>();
        HashSet<BaseTransport> bus = new HashSet<>();
        HashSet<BaseTransport> trams = new HashSet<>();
        HashSet<BaseTransport> trucks = new HashSet<>();
        HashSet<BaseTransport> motorcycles = new HashSet<>();

        for (BaseTransport transport : transportBase) {
            if (transport.getType().equals(BodyTypes.PASSENGER)) {
                cars.add(transport);
            } else if (transport.getType().equals(BodyTypes.BUS)) {
                bus.add(transport);
            } else if (transport.getType().equals(BodyTypes.TRAM)) {
                trams.add(transport);
            } else if (transport.getType().equals(BodyTypes.TRUCK)) {
                trucks.add(transport);
            } else if (transport.getType().equals(BodyTypes.MOTORCYCLE)) {
                motorcycles.add(transport);
            }
        }
        transportByType.add(cars);
        transportByType.add(bus);
        transportByType.add(trams);
        transportByType.add(trucks);
        transportByType.add(motorcycles);

        return transportByType;
    }

}
