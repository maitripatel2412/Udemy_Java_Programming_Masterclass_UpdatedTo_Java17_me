package Section_9_10;

public enum Enum_Topping {

    MUSTARD,
    PICKLES,
    BACON,
    CHEDDAR,
    TOMATO;

    public double getPrice(){

        return switch (this){
            case BACON -> 1.5;
            case CHEDDAR -> 1.0;
            case PICKLES -> 1.0;
            case TOMATO ->  2.0;
            default -> 0.0;
        };
    }
}
