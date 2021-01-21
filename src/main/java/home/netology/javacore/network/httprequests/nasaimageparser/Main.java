package home.netology.javacore.network.httprequests.nasaimageparser;

import com.fasterxml.jackson.core.JsonProcessingException;
import home.netology.javacore.network.httprequests.nasaimageparser.system.AppConfig;
import home.netology.javacore.network.httprequests.nasaimageparser.system.DownloadImage;
import home.netology.javacore.network.httprequests.nasaimageparser.system.Mapper;
import home.netology.javacore.network.httprequests.nasaimageparser.system.Request;

public class Main {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        Request request = new Request(appConfig);
        Mapper mapper = new Mapper();
        DownloadImage downloadImage = new DownloadImage();

        try {
            String url = mapper.convert(request.makeRequest()).getUrl();
            downloadImage.download(url);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }


    }
}
