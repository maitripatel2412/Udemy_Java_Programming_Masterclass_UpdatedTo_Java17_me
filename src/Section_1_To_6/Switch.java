public class Switch {

    public static void main(String[] args) {

        int value = 4;

        switch (value) {
            case 1 -> System.out.println("value was 1");
            case 2 -> System.out.println("value was 2");
            case 3, 4, 5 -> {
                System.out.println("value was a 3 , a 4 or a 5 ");
                System.out.println("actual value was " + value);
            }
            default -> System.out.println("value was not 1 , 2 , 3 , 4 or 5");
        }

        String month = "MAY";
        System.out.println(month+" is in the "+getQuarter(month)+" quarter");
    }

    public static String getQuarter(String month){
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {yield "1st";}
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month +" is bad";
                yield badResponse;
            }
        };
    }

}
