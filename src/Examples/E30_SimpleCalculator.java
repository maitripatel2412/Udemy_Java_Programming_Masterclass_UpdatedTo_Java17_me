package Exercises;

public class E30_SimpleCalculator {

    public static void main(String[] args) {

    }
        private double firstNumber = 9;
        private double secondNumber = 0;

        public double getFirstNumber () {
            return firstNumber;
        }

        public void setFirstNumber ( double firstNumber){
            this.firstNumber = firstNumber;
        }

        public double getSecondNumber () {
            return secondNumber;
        }

        public void setSecondNumber ( double secondNumber){
            this.secondNumber = secondNumber;
        }

        public double getAdditionResult () {
            double sum = firstNumber + secondNumber;
            return sum;
        }

        public double getSubtractionResult () {
            double sub = firstNumber - secondNumber;
            return sub;
        }

        public double getMultiplicationResult () {
            double mul = firstNumber * secondNumber;
            return mul;
        }

        public double getDivisionResult () {
            return (secondNumber == 0) ? 0 : firstNumber / secondNumber;
        }
}
