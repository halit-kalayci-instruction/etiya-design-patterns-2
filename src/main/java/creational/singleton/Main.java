package creational.singleton;


public class Main {
    public static void main(String[] args) {

        // Single Thread
        /*DatabaseContext db1 = new DatabaseContext("db1");
        db1.connect();
        System.out.println(db1);

        DatabaseContext db2 = new DatabaseContext("db2");
        db2.connect();
        System.out.println(db2);

        System.out.println("**************************");

        DatabaseContext db3 = DatabaseContext.getInstance("db3");
        db3.connect();
        System.out.println(db3);

        DatabaseContext db4 = DatabaseContext.getInstance("db4");
        db4.connect();
        System.out.println(db4); */
        //
        Thread thread1 = new Thread(new ThreadOne());
        Thread thread2 = new Thread(new ThreadTwo());
        thread2.start();
        thread1.start();
    }

    static class ThreadOne implements Runnable {

        @Override
        public void run() {
            DatabaseContext dbContext = DatabaseContext.getInstance("thread1");
            dbContext.connect();
            System.out.println(dbContext);
        }
    }

    static class ThreadTwo implements Runnable {

        @Override
        public void run() {
            DatabaseContext dbContext = DatabaseContext.getInstance("thread2");
            dbContext.connect();
            System.out.println(dbContext);
        }
    }
}
