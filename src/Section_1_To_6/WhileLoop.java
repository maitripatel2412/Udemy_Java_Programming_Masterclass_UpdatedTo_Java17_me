package Section_1_To_6;

public class WhileLoop {

    public static void main(String[] args) {

//        for (int i =1;i<=5;i++){
//            System.out.println(i);
//        }
//
//        int j=1;
//        boolean isready = false;
//        do {
//            if (j>5){
//                break;
//            }
//            System.out.println(j);
//            j++;
//            isready = (j > 0);
//        }while (isready);

        int number = 0;
        while (number<50){
            number+=5;
            if (number % 25 == 0){
                continue;
            }
            System.out.println(number);
        }
    }
}
