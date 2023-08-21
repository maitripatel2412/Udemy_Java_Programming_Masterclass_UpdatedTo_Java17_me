package Exercises;

public class E35_ComplexNumber {

    private double real;
    private double imaginary;

    public E35_ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return this.real;
    }

    public double getImaginary(){
        return this.imaginary;
    }

    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(E35_ComplexNumber complexA){
        add(complexA.getReal(), complexA.getImaginary());
    }

    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(E35_ComplexNumber complexA){
        subtract(complexA.getReal(), complexA.getImaginary());
    }

}
