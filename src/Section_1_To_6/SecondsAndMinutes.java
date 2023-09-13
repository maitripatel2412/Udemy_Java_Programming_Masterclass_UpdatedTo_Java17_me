package Section_1_To_6;

public class SecondsAndMinutes {

    public static void main(String[] args) {

        System.out.println(getdurationstring(-3945));
        System.out.println(getdurationstring(-65,45));
        System.out.println(getdurationstring(65,145));
        System.out.println(getdurationstring(65,45));
        System.out.println(getdurationstring(3945));
    }

    public static String getdurationstring(int seconds){

        if( seconds < 0 ){
            return "invalid data for seconds ("+seconds+") must be positive integer";
        }
            int minutes = seconds / 60;
            return getdurationstring(seconds/60, seconds%60);
//          int hours = minutes/60;

//        int remainingminutes = minutes % 60;
//        int remainingseconds = seconds % 60;
//
//        return hours+"h"+remainingminutes+"m"+remainingseconds+"s";
    }

    public static String getdurationstring(int minutes,int seconds){

        if( minutes < 0 ){
            return "invalid data for minutes ("+minutes+") must be positive integer";
        }

        if( seconds <= 0 || seconds >= 59){
            return "invalid data for seconds("+seconds+") must be between 0 and 59";
        }

        int hours = minutes/60;

        int remainingminutes = minutes % 60;

        return hours+"h"+remainingminutes+"m"+seconds+"s";
    }

}
