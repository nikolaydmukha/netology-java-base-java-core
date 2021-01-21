package home.netology.javacore.network.httprequests.nasaimageparser.system;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {

    private Properties props = new Properties();

    public AppConfig() {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("app.properties")) {
            props.load(input);
        } catch (IOException ex) {
            throw new RuntimeException("Error during loading app.properties! " + ex.getMessage());
        }
    }

    public String getNasaApiKey() {
        return getParam("nasa.api.key");
    }

    public String getNasaURL() {
        return getParam("nasa.url");
    }

    private String getParam(String param) {
        return props.getProperty(param);
    }


}
