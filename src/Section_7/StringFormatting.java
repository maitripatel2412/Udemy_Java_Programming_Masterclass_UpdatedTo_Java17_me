package Section_7;

public class StringFormatting {

    public static void main(String[] args) {

        String bulletIt = "print a bulleted list : \n" +
                "\t\u2022 first point \n" +
                "\t\u2022 sub point ";
        System.out.println(bulletIt);


        String textBlock = """
                print a bulleted list :
                    \u2022 first point
                    \u2022 sub point""";

        System.out.println(textBlock);

        int age = 22;
        System.out.printf("your age is %d%n",age);

        int yearOfBirth = 2023 - age;
        System.out.printf("age = %d , date of birth = %d%n ",age,yearOfBirth);

        System.out.printf("your age is %.2%f%n",(float)age);

//        for (int i = 1 ; i <= 100000 ; i *= 10){
//            System.out.printf("printing %d \n",i);
//        }

        String formatedstring = String.format("your age is %d",age);
        System.out.println(formatedstring);

    }
}
