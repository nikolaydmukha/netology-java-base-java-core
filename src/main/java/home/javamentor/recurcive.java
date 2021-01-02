package main.java.home.javamentor;

public class recurcive {

    public static void main(String[] args) {
        System.out.println(fibonachi(6));
    }
    static int fibonachi(int n){

        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else{
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }
}
