package home.netology.javacore.files.gamesetup;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    static StringBuilder log = new StringBuilder();
    static String root = "src/main/java/home/netology/javacore/files/gamesetup/";

    public static void main(String[] args) {
        createRoot();
        createSrc();
        createRes();
        createSaveGames();
        createTmp();
        writeLog();
    }

    private static void log(String event) {
        log.append(event + "\n");
    }

    private static void createRoot() {
        File rootDir = new File(root + "/gamesdir");
        rootDir.mkdirs();
        log("games dir created");
    }

    private static void createSrc() {
        File srcDir = new File(root + "/gamesdir/src");
        File srcMainDir = new File(root + "/gamesdir/src/main");
        File srcTestDir = new File(root + "/gamesdir/src/test");
        File mainFile = new File(root + "/gamesdir/src/main/Main.java");
        File utilsFile = new File(root + "/gamesdir/src/main/Utils.java");

        srcDir.mkdirs();
        log("src dir created");

        srcMainDir.mkdirs();
        log("src/main dir created");

        srcTestDir.mkdirs();
        log("src/test dir created");

        try {
            mainFile.createNewFile();
            log("/gamesdir/src/main/Main.java created");

            utilsFile.createNewFile();
            log("/gamesdir/src/main/Utils.java created");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

    }

    private static void createRes() {
        File resDir = new File(root + "/gamesdir/res");
        File drawablesDir = new File(root + "/gamesdir/res/drawables");
        File vectorsDir = new File(root + "/gamesdir/res/vectors");
        File iconsDir = new File(root + "/gamesdir/res/icons");

        resDir.mkdirs();
        log("res dir created");

        drawablesDir.mkdirs();
        log("drawable dir created");

        vectorsDir.mkdirs();
        log("vectors dir created");

        iconsDir.mkdirs();
        log("iconcs dir created");

    }

    private static void createSaveGames() {
        File savegamesDir = new File(root + "/gamesdir/savegames");

        savegamesDir.mkdirs();
        log("savegames dir created");

    }

    private static void createTmp() {
        File tmpDir = new File(root + "/gamesdir/tmp");
        File tmpFile = new File(root + "/gamesdir/tmp/temp.txt");

        tmpDir.mkdirs();
        log.append("tmp dir created");

        try {
            tmpFile.createNewFile();
            log.append("/gamesdir/tmp/temp.txt created");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    private static void writeLog() {
        try (FileWriter writer = new FileWriter(root + "/gamesdir/tmp/temp.txt", false)) {
            writer.write(log.toString());

            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }


}
