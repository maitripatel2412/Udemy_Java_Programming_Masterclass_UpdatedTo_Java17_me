package Section_7;

public class StringMethods {
    public static void main(String[] args) {

        String birthDate = "30/05/2001";
        int startingIndex = birthDate.indexOf("2001");
        System.out.println("starting index = "+startingIndex);
        System.out.println("birth year = "+birthDate.substring(startingIndex));

        System.out.println("month = "+birthDate.substring(3,5));

//        String newDate = String.join("/","30","05","2001");
//        System.out.println("new date = "+newDate);

        String newDate = "30";
        newDate = newDate.concat("/");
        newDate = newDate.concat("05");
        newDate = newDate.concat("/");
        newDate = newDate.concat("2001");
        System.out.println("new date = "+newDate);

        newDate = "30" + "/" + "05" + "/" + "2001" ;
        System.out.println("new date = "+newDate);

        newDate = "30".concat("/").concat("05").concat("/").concat("2001");
        System.out.println("new date = "+newDate);

        System.out.println(newDate.replace("/","-"));
        System.out.println(newDate.replace("0","$"));

        System.out.println(newDate.replaceFirst("/","-"));
        System.out.println(newDate.replaceAll("/","---"));

        System.out.println("ABC\n".repeat(4).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(4).indent(-2));
        System.out.println("-".repeat(20));
    }
}
