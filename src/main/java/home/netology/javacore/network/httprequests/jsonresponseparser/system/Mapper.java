package home.netology.javacore.network.httprequests.jsonresponseparser.system;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import home.netology.javacore.network.httprequests.jsonresponseparser.Comment;

import java.util.ArrayList;

public class Mapper {

    public ArrayList<Comment> convert(String jsonString) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        ArrayList<Comment> comments = objectMapper.readValue(jsonString, new TypeReference<ArrayList<Comment>>() {});

        return comments;
    }


}
