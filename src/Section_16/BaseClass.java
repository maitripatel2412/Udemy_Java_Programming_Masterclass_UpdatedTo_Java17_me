package Section_16;

public class BaseClass {

    public final void recommendedMethod(){
        System.out.println("[BaseClass.recommendedMethod]: best way to do it");
        optionalMethod();
        mandatoryMethod();
    }

    protected void optionalMethod(){
        System.out.println("[BaseClass.optionalMethod]: customizable optional method");
    }

    private void mandatoryMethod(){
        System.out.println("[BaseClass.mandatoryMethod]: NON-NEGOTIABLE!");
    }

    public static void recommendedStatic(){
        System.out.println("[BaseClass.recommendedStatic]: best way to do it");
        optionalStatic();
        mandatoryStatic();
    }

    protected static void optionalStatic(){

        System.out.println("[BaseClass.optionalStatic]: optional");
    }

    private static void mandatoryStatic(){

        System.out.println("[BaseClass.mandatoryStatic]: NON-NEGOTIABLE!");
    }
}
