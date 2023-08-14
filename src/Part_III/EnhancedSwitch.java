package Part_III;

public class EnhancedSwitch {
    public static void main(String[] args) {

        System.out.println(getQuarter("January"));
    }

    public static String getQuarter(String month) {

        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}
