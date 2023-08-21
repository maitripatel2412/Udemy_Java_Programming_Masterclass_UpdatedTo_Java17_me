package Exercises;

public class E32_Wall {

    private double width;
    private double height;

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public double getArea(){
        return width*height;
    }

    public void setWidth(double width){
        this.width = width < 0 ? 0 : width;
    }

    public void setHeight(double height){
        this.height = height < 0 ? 0 : height;
    }

    public E32_Wall(double width, double height) {
        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;
    }

    public E32_Wall() {
        this(0, 0);
    }

}
