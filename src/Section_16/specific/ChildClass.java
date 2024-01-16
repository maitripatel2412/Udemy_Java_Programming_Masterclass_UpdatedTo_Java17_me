package Section_16.specific;

import Section_16.BaseClass;

public class ChildClass extends BaseClass {

    @Override
    protected void optionalMethod() {

        System.out.println("[child:optionalMethod]: extra stuff here");
        super.optionalMethod();
    }

//    @Override
//    public void recommendedMethod() {
//        System.out.println("[child:recommendedMethod]: i'll do things my way");
//        optionalMethod();
//    }

    public static void recommendedStatic(){
        System.out.println("[ChildClass.recommendedStatic]: best way to do it");
        optionalStatic();
//        mandatoryStatic();
    }
}
