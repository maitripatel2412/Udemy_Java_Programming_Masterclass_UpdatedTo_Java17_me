package Section_19;

public class RegularExpression {

    public static void main(String[] args) {

        String helloWorld = "%s %s".formatted("hello","world");
        String helloWorld2 = String.format("%s %s","hello","world");

        System.out.println("using String formatted method" + helloWorld);
        System.out.println("using String.format method" + helloWorld2);

        String helloWorld3 = RegularExpression.format("%s %s","Hello"," World");
        System.out.println("Using Main.Format method : " + helloWorld3);

        String testString = "Maitri Patel abc's 123's A";
        String replacement = "(-)";

        String[] patterns = {
                "a|b|c",
                "ab|bc",
                "[a-zA-Z]*$",
                "[0-9]{2}",
                "[A-Z]*",
                "^[a-zA-Z]{3}",
                "[aA]ny\\b"
        };

        for (String pattern : patterns){
            String output = testString.replaceFirst(pattern,replacement);
            System.out.println("patterns : " + pattern + " => " + output);
        }

    }

    private static String format(String regexp, String... args){

        int index = 0;

        while (regexp.matches(".*%s.*")){
            regexp = regexp.replaceFirst("%s",args[index++]);
        }
        return regexp;
    }

}
