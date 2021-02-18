package home.netology.javacore.files.desearilization;

import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import home.netology.javacore.files.serialization.GameProgress;

public class Main {

    static String PATH_DIR = "src/main/java/home/netology/javacore/files/gamesetup/gamesdir/savegames/";

    public static void main(String[] args) {
        openZip();
        deserialization();
    }

    private static void openZip() {
        File zipFile = getZipFile();
        try (ZipInputStream zin = new ZipInputStream(new FileInputStream(zipFile))) {
            ZipEntry entry;
            int i = 1;
            while ((entry = zin.getNextEntry()) != null) {
                // распаковка
                FileOutputStream fout = new FileOutputStream(PATH_DIR + "gameProgress" + i + ".dat");
                for (int c = zin.read(); c != -1; c = zin.read()) {
                    fout.write(c);
                }
                fout.flush();
                zin.closeEntry();
                fout.close();
                i++;
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    private static File getZipFile() {
        for (File file : new File(PATH_DIR).listFiles()) {
            if (FilenameUtils.getExtension(file.getName()).equals("zip")) {
                return file;
            }
        }
        return null;
    }

    private static void deserialization() {
        ArrayList<File> files = scanDir();
        for (File file : files) {
            if (!FilenameUtils.getExtension(file.getName()).equals("zip")) {
                try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                    GameProgress gameProgress = (GameProgress) ois.readObject();
                    System.out.printf(gameProgress.toString());
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
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
}
