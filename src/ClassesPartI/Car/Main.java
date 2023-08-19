package ClassesPartI.Car;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        car.setBrand("Audi");
        car.setModel("A3");
        car.setColor("Black");
        car.setDoors(4);
        car.setConvertible(false);

        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Doors: " + car.getDoors());
        System.out.println("Color: " + car.getColor());
        System.out.println("Convertible: " + car.isConvertible());

        car.describeCar();

        Car targa = new Car();

        targa.setBrand("Porsche");
        targa.setModel("Targa");
        targa.setColor("Red");
        targa.setDoors(4);
        targa.setConvertible(false);

        System.out.println("Brand: " + targa.getBrand());
        System.out.println("Model: " + targa.getModel());
        System.out.println("Doors: " + targa.getDoors());
        System.out.println("Color: " + targa.getColor());
        System.out.println("Convertible: " + targa.isConvertible());

        targa.describeCar();
    }
}
