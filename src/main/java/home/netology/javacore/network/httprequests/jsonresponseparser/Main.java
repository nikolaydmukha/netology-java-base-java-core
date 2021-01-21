package home.netology.javacore.network.httprequests.jsonresponseparser;

import com.fasterxml.jackson.core.JsonProcessingException;
import home.netology.javacore.network.httprequests.jsonresponseparser.system.Mapper;
import home.netology.javacore.network.httprequests.jsonresponseparser.system.Request;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String url = "http://jsonplaceholder.typicode.com/comments";

        Request request = new Request(url);
        Mapper mapper = new Mapper();

        try {
            ArrayList<Comment> comments = mapper.convert(request.makeRequest());
            comments.stream().filter(item -> item.getPostId() == 100).forEach(comment -> System.out.println(comment.toString()));
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
    }
}
