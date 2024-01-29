package creational.prototype;

public class Main {
    public static void main(String[] args) {
        Brand brand = new Brand(1, "Mercedes");


        Car car = new Car(1, brand,"ABC",2023,"Kırmızı");
        /*
        Brand brand2 = new Brand(brand.getId(), brand.getName());
        Car car2 = new Car(car.getId(),
                car.getBrand(), car.getModel(),
                car.getYear(),car.getColor());
        */
        Car car3 = car.clone();
        car3.getBrand().setName("BMW");

        System.out.println(car.getBrand().getName());

        System.out.println("**");
    }
}
