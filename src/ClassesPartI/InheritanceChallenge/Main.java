package ClassesPartI.InheritanceChallenge;

public class Main {

    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee("Ahmet", "1999",
                "null", 234L, "2020", 100000, false);

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Mehmet", "1998",
                "null", 12L, "2021", 50);

        salariedEmployee.retire();
        hourlyEmployee.getDoublePay();
    }
}
