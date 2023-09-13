package Examples;

public class E27_DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);

    }
    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        int row = 1;
        int col = 1;

        while (row <= number) {
            col = 1;
            while (col <= number) {
                if (col == 1 || col == number || row == 1 || row == number || row == col || col == (number - row + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                col++;
            }
            row++;
            System.out.println();
        }
    }
}
