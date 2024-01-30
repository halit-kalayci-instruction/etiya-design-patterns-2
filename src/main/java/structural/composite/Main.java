package structural.composite;

public class Main {
    public static void main(String[] args) {
        Employee CEO = new Employee("Engin","Demiroğ","CEO");
        Employee headOfDevelopment = new Employee("Batuhan","Keskin","HOD");
        Employee headOfSales = new Employee("Okan","Taşin","HOS");

        CEO.addSubordinate(headOfDevelopment);
        CEO.addSubordinate(headOfSales);

        Employee developer = new Employee("Halit","Kalaycı","Dev");
        headOfDevelopment.addSubordinate(developer);

        Employee salesman = new Employee("Berkay","Sezgin","salesman");
        headOfSales.addSubordinate(salesman);

        System.out.println("");
    }
}
