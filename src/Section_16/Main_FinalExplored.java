package Section_16;

import Section_16.specific.ChildClass;

public class Main_FinalExplored {

    public static void main(String[] args) {

        BaseClass parent = new BaseClass();
        ChildClass child = new ChildClass();
        BaseClass childReferredAsBase = new ChildClass();

        parent.recommendedMethod();
        System.out.println("--------------------------------------------------------");
        
         childReferredAsBase.recommendedMethod();
         System.out.println("-------------------------------------------------------");

         child.recommendedMethod();
         System.out.println("-------------------------------------------------------");

        parent.recommendedStatic();
        System.out.println("--------------------------------------------------------");

        childReferredAsBase.recommendedStatic();
        System.out.println("-------------------------------------------------------");

        child.recommendedStatic();

        System.out.println("-------------------------------------------------------");
        BaseClass.recommendedStatic();
        ChildClass.recommendedStatic();

        String xArgument = " This is all I've got to say about Section";
        StringBuilder zArgument = new StringBuilder("only saying this: Section");
        doXYZ(xArgument,16,zArgument);
        System.out.println("after method, xArgument: " + xArgument);
        System.out.println("after method, zArgument: " + zArgument);

        StringBuilder tracker = new StringBuilder("step 1 is abc");
        Logger.logToConsole(tracker.toString());
        tracker.append(" , step 2 is xyz.");
        Logger.logToConsole(tracker.toString());
        System.out.println("after logging, tracker = " + tracker);
    }

    private static void doXYZ(String x, int y, final StringBuilder z){
        final String c = x + y;
        System.out.println("c = " + c);
        z.append(y);
//        z = new StringBuilder("this is a new reference");
    }
}
