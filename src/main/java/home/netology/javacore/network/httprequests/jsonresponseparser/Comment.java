package home.netology.javacore.network.httprequests.jsonresponseparser;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Formatter;

public class Comment {

    @JsonProperty("postId")
    private int postId;
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("email")
    private String email;
    @JsonProperty("body")
    private String body;

    public int getPostId() {
        return postId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        Formatter f = new Formatter();

        return f.format("Comment\n     postId = %d," +
                "\n     name = %s," +
                "\n     body = %s", this.postId, this.name, this.body).toString();
    }
}
