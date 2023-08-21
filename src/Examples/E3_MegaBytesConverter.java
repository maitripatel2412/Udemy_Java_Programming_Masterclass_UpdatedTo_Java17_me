package Exercises;

public class E3_MegaBytesConverter {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(10023);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        int megabytes = Math.round(kiloBytes/1024);

        int rkilobytes = kiloBytes%1024;

        if(kiloBytes < 0){

            System.out.println("Invalid Value");

        } else {

            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + rkilobytes + " KB");
        }
    }
}
