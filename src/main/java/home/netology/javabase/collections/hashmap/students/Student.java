package main.java.home.netology.javabase.collections.hashmap.students;

public class Student {
    private String fio;
    private String groupId;
    private String accountId;

    public Student(String fio, String groupId, String accountId) {
        this.fio = fio;
        this.groupId = groupId;
        this.accountId = accountId;
    }

    public String getFio() {
        return fio;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getAccountId() {
        return accountId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + accountId.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that)
            return true;
        if (that == null)
            return false;
        if (getClass() != that.getClass())
            return false;
        Student other = (Student) that;
        if (accountId.hashCode() != other.accountId.hashCode())
            return false;
        return true;
    }

    @Override
    public String toString() {
        System.out.println("Студент: " + fio.toLowerCase() + " Студенческий билет №" + accountId + " Группа №" + groupId);
        return null;
    }
}
