package ClassesPartI.Inheritance;

import java.util.Objects;

public class Fish extends Animal {

    private int fins;
    private int fills;

    public Fish(String type, double weight, int fins, int fills) {
        super(type, "small", weight);
        this.fins = fins;
        this.fills = fills;
    }

    private void moveMuscles() {
        System.out.println("muscles moving ");
    }

    private void moveBackFin() {
        System.out.println("backfin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (Objects.equals(speed, "fast")) {
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", fills=" + fills +
                "} " + super.toString();
    }
}
