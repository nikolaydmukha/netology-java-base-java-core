package home.netology.javabase.collections.treemap.thief;

public class User {
    private int id;
    private String fName;
    private String iName;
    private String oName;
    private String address;

    public User(int id, String fName, String iName, String oName, String address) {
        this.id = id;
        this.fName = fName;
        this.iName = iName;
        this.oName = oName;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public String getiName() {
        return iName;
    }

    public String getoName() {
        return oName;
    }

    public String getAddress() {
        return address;
    }
}
