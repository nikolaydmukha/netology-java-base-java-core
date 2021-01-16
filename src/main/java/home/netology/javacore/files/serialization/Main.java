package home.netology.javacore.files.serialization;

import org.apache.commons.io.FilenameUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {
    static final String PATH_DIR = "src/main/java/home/netology/javacore/files/gamesetup/gamesdir/savegames/";

    public static void main(String[] args) {
        GameProgress gameProgress1 = new GameProgress(100, 5, 80, 200.0);
        GameProgress gameProgress2 = new GameProgress(10, 3, 10, 2.0);
        GameProgress gameProgress3 = new GameProgress(80, 7, 8, 10.0);
        GameProgress gameProgress4 = new GameProgress(46, 4, 45, 38.0);

        serializeGame(gameProgress1);
        serializeGame(gameProgress2);
        serializeGame(gameProgress3);
        serializeGame(gameProgress4);
        zipFile();
        removeFiles();
    }

    private static void serializeGame(GameProgress gameProgress) {
        String fileName;
        int i = 1;
        while (true) {
            fileName = PATH_DIR + "gameProgress" + i + ".dat";
            File file = new File(fileName);
            if (file.exists()) {
                i++;
                continue;
            }
            try {
                new File(fileName).createNewFile();
                break;
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(gameProgress);
        } catch (Exception ex) {

            System.err.println(ex.getMessage());
        }
    }

    private static void zipFile() {
        ArrayList<File> files = scanDir();
        ZipOutputStream zout = null;
        try {
            zout = new ZipOutputStream(new FileOutputStream(PATH_DIR + "1.zip"));
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
        for (File file : files) {
            try (FileInputStream fis = new FileInputStream(file);) {
                ZipEntry entry1 = new ZipEntry(file.getName());
                zout.putNextEntry(entry1);
                // считываем содержимое файла в массив byte
                byte[] buffer = new byte[fis.available()];
                fis.read(buffer);
                // добавляем содержимое к архиву
                zout.write(buffer);
                // закрываем текущую запись для новой записи
                zout.closeEntry();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        try {
            zout.close();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    private static ArrayList<File> scanDir() {
        ArrayList<File> files = new ArrayList<>();
        for (File item : new File(PATH_DIR).listFiles()) {
            if (!item.isDirectory()) {
                files.add(item);
            }
        }
        return files;
    }

    public static void removeFiles() {
        ArrayList<File> files = scanDir();
        for (File file : files){
            if (!FilenameUtils.getExtension(file.getName()).equals("zip")) {
                file.delete();
            }
        }
    }

}
