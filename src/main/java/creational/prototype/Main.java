package creational.prototype;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1, "Mercedes","ABC",2023,"Kırmızı");


        Car car2 = new Car(car.getId(), car.getBrand(), car.getModel(), car.getYear(),car.getColor());

        Car car3 = car.clone();

        System.out.println("**");
    }
}
