package Section_7;

public class StringOptions {
    public static void main(String[] args) {

        String helloWorld = "hello"+"world";
        helloWorld.concat(" and goodbye!");

        StringBuilder helloWorldBuilder = new StringBuilder("hello" + "world");
        helloWorldBuilder.append(" and goodbye!");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        StringBuilder emptyStart32 = new StringBuilder(32);

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello "+"World ");
        builderPlus.append("And GoodBye");

        builderPlus.deleteCharAt(16).insert(16,'g');
        System.out.println(builderPlus);

        builderPlus.replace(16,17,"G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }
    public static void printInformation(String string){
        System.out.println("String = "+string);
        System.out.println("length = "+string.length());

    }

    public static void printInformation(StringBuilder builder){
        System.out.println("StringBuilder = "+builder);
        System.out.println("StringBuilder length = "+builder.length());
        System.out.println("capacity = "+builder.capacity());

    }
}
