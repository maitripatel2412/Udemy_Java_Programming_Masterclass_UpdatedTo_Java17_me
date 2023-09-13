package Section_7;

public class AllAboutString {

    public static void main(String[] args) {

        printInformation("hello world");
//        printInformation("");
//        printInformation("\t  \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n",helloWorld.indexOf('r'));
        System.out.printf("index of world = %d %n",helloWorld.indexOf("world"));
        System.out.printf("index of l = %d %n",helloWorld.indexOf('l'));
        System.out.printf("index of last l = %d %n",helloWorld.lastIndexOf('l'));
        System.out.printf("index of second l = %d %n",helloWorld.indexOf('l',3));
        System.out.printf("index of last l = %d %n",helloWorld.lastIndexOf('l',8));

        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower)){
            System.out.println("values match exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("values match ignoring case");
        }
        if (helloWorld.startsWith("Hello")){
            System.out.println("String starts with Hello");
        }
        if (helloWorld.endsWith("World")){
            System.out.println("String ends with world");
        }
        if (helloWorld.contentEquals("Hello World")){
            System.out.println("values match exactly");
        }
    }

    public static void printInformation(String string){

        int length = string.length();
        System.out.printf("length = %d %n",length);

        if (string.isEmpty()){
            System.out.println("string is empty");
        }

        if (string.isBlank()){
            System.out.println("string is blank");
            return;
        }
        System.out.printf("first characters = %c %n",string.charAt(0));

        System.out.printf("last character = %c%n",string.charAt(length-1));
    }
}
