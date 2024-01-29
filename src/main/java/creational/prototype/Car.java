package creational.prototype;

public class Car implements Cloneable
{
    private int id;
    private Brand brand;
    private String model;
    private int year;
    private String color;


    public Car(int id, Brand brand, String model, int year, String color) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public Car() {}

    @Override
    protected Car clone()  {
        try {
            // Shallow Copy => Yüzeysel Kopyalama
            // Deep Copy => Derinsel Kopyalama
            Car car = (Car) super.clone();
            car.brand = this.brand.clone();
            return car;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
