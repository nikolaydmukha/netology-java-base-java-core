package main.java.home.netology.customutils.renamedirs;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи адрес: ");
        String dirName = scanner.nextLine();
        //root dir: C:\Users\n.dmukha\Desktop\Work\Omilia\JavaModules\MyModules\LearningJava\src\main\java\home\javarush\
        try (DirectoryStream<Path> rootDir = Files.newDirectoryStream(Paths.get(dirName))) {
            for (Path path : rootDir) {
                if (Files.isDirectory(path)) {
                    try (DirectoryStream<Path> streamSubDirs = Files.newDirectoryStream(path)) {    //sub dirs
                        for (Path subPath : streamSubDirs) {
                            System.out.println("Current Directory " + subPath);
                            for (final File f : subPath.toFile().listFiles()) {
                                if (f.isFile() && f.getName().equals("Условие.jrtc")) {
                                    renameFile(f.getName(), subPath);
                                }
                            }
                        }
                    }
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
    private static void renameFile(String oldfile, Path path) {

        File file = new File(path.toString() + "\\" + oldfile);
        File newFile = new File(path.toString() + "\\Readme.md");
        System.out.println(file.toString());
        if(file.renameTo(newFile)){
            System.out.println("File rename success");;
        }else{
            System.out.println("File rename failed");
        }
    }
}
