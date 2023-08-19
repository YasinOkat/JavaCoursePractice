package ClassesPartI.Car;

public class Car {

    private String brand = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        if (brand == null) brand = "Unknown";
        String lowercaseBrand = brand.toLowerCase();
        switch (lowercaseBrand) {
            case "holden", "porsche", "tesla" -> this.brand = brand;
            default -> {
                this.brand = "Unsupported";
            }
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {

        System.out.println(doors + "-Door " +
                color + " " +
                brand + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }

}
