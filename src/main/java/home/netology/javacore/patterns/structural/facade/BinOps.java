package home.netology.javacore.patterns.structural.facade;

public class BinOps {

    public String sum(String a, String b) {
        int aDec = Integer.parseInt(a, 2);
        int bDec = Integer.parseInt(b, 2);
        return Integer.toBinaryString(aDec + bDec);
    }

    public String mult(String a, String b) {
        int aDec = Integer.parseInt(a, 2);
        int bDec = Integer.parseInt(b, 2);
        return Integer.toBinaryString(aDec * bDec);
    }

}
