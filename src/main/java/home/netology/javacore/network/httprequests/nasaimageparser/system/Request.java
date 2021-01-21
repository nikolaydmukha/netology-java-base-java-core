package home.netology.javacore.network.httprequests.nasaimageparser.system;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class Request {
    private AppConfig appConfig;

    public Request(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    public String makeRequest(){
        String url = appConfig.getNasaURL().concat("api_key=").concat(appConfig.getNasaApiKey());
        CloseableHttpResponse response = null;
        String responseToString = null; 
        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setDefaultRequestConfig(RequestConfig.custom()
                        .setConnectTimeout(5000)    // максимальное время ожидание подключения к серверу
                        .setSocketTimeout(30000)    // максимальное время ожидания получения данных
                        .setRedirectsEnabled(false) // возможность следовать редиректу в ответе
                        .build())
                .build();
        HttpGet request = new HttpGet(url);
        try {
            response = httpClient.execute(request);
            responseToString = EntityUtils.toString(response.getEntity());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return responseToString;
    }
}
