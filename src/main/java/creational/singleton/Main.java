package creational.singleton;


public class Main {
    public static void main(String[] args) {
        DatabaseContext db1 = new DatabaseContext("db1");
        db1.connect();
        System.out.println(db1);

        DatabaseContext db2 = new DatabaseContext("db2");
        db2.connect();
        System.out.println(db2);
    }
}
