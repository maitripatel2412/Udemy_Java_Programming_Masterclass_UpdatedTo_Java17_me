package Section_19;

import java.util.List;

public class MiniChallenge {

    public static void main(String[] args) {

        String sentence = "Hello World";
        boolean matches =  sentence.matches("Hello World");
        System.out.println(matches);

        String challenge2 = "[A-Z][a-z\\s]+[.] ";

        for (String s : List.of("the bike is red.",
                "I am a new student",
                "hello world",
                "how are you?"))
        {
            boolean matched = s.matches(challenge2);
            System.out.println(matched + " : " + s);
        }

        String challenge3 = "[A-Z][a-z\\s]+[.] ";

        for (String s : List.of("the bike is red and has flat tires.",
                "I am a new student",
                "hello world",
                "how are you?"))
        {
            boolean matched = s.matches(challenge2);
            System.out.println(matched + " : " + s);
        }
    }
}
