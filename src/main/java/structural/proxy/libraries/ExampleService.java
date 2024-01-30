package structural.proxy.libraries;

public class ExampleService {
    public int getData(int number)
    {
        int total = 0;
        for (int i = 0; i < number; i++) {
            total+=i;
            try {
                Thread.sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return total;
    }
}
