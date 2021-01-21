package home.netology.javacore.network.httprequests.nasaimageparser.system;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import home.netology.javacore.network.httprequests.nasaimageparser.NasaResponseObject;

import java.text.SimpleDateFormat;

public class Mapper {

    public NasaResponseObject convert(String jsonString) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        NasaResponseObject comments = objectMapper.readValue(jsonString, new TypeReference<NasaResponseObject>() {});

        return comments;
    }

}
