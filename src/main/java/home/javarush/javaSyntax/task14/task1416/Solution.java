package home.javarush.javaSyntax.task14.task1416;

public class Solution {

    public static void main(String[] args) {
        try {
            dangerousMethod();
        }catch (Exception exception){
            exception.printStackTrace();
        }


    }

    static void dangerousMethod() throws Exception {
        throw new Exception("Mu-ha-ha!");
    }
}
