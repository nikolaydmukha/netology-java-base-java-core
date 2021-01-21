package home.netology.javacore.network.httprequests.nasaimageparser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class NasaResponseObject {
    @JsonProperty("copyright")
    public String copyright;

    @JsonProperty("date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyy-MM-dd")
    public Date date;

    @JsonProperty("explanation")
    public String explanation;

    @JsonProperty("media_type")
    public String media_type;

    @JsonProperty("hdurl")
    public String hdurl;

    @JsonProperty("service_version")
    public String service_version;

    @JsonProperty("title")
    public String title;

    @JsonProperty("url")
    public String url;

    public String getUrl() {
        return url;
    }
}
