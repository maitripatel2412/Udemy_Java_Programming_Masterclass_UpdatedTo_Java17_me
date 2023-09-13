package Section_7;

public class Car {
    private  String make = "Hyundai";
    private String model = "Aura";
    private String color = "White";
    private int door = 4;
    private boolean convertible = false;


    public String getMake(){
        return make;
    }
    public void setMake(String make) {
        if (make == null) make = "unknown";
        String lowercasemake = make.toLowerCase();
        switch (lowercasemake){
            case "Hyundai","MarutiSuzuki","Honda" -> this.make = make;
            default -> {
                this.make = "unsupported";
            }
        }
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getDoor() {
        return door;
    }
    public void setDoor(int door) {
        this.door = door;
    }
    public boolean isConvertible() {
        return convertible;
    }
    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
    public void describeCar(){
        System.out.println("door = " +door+
                  " color = " + color +
                  " model = " +model +
                  " make = " + make +
                  (convertible ? " convertible = " : " "));
    }

}
