package home.netology.javacore.network.httprequests.nasaimageparser.system;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;

public class DownloadImage {

    public void download(String url){

        try (BufferedInputStream in = new BufferedInputStream(new URL(url).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(getFileName(url))) {
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private String getFileName(String url){
        String path = "src/main/java/home/netology/javacore/network/httprequests/nasaimageparser/image/";
        return path.concat(url.substring(url.lastIndexOf("/") + 1));
    }
}
