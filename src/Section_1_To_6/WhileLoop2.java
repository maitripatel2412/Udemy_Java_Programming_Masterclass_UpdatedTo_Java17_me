public class WhileLoop2 {

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;

//        while (number <= finishNumber){
//            number++;
//            if (!isEvenNumber(number)){
//                continue;
//            }
//            System.out.println("even number = "+number);
//        }

        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                oddCount++;
                continue;
            }
            System.out.println("even number = "+number);
            evenCount++;
            if (evenCount >= 5){
                break;
            }
        }

        System.out.println("total odd number found = "+oddCount);
        System.out.println("total even number found = "+evenCount);
    }

    public static boolean isEvenNumber(int number){

        if ((number % 2 ) == 0){
            return true;
        }else {
            return false;
        }
    }
}
