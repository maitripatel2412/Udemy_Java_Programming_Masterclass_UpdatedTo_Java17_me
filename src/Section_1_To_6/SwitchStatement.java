package Section_1_To_6;

public class SwitchStatement {

    public static void main(String[] args) {

        char charvalue = 'A';
        switch (charvalue){
            case 'A':
                System.out.println("A is able");
                break;
            case 'B':
                System.out.println("B is backer");
                break;
            case 'C':
                System.out.println("C is charlie");
                break;
            case 'D':
                System.out.println("D is dog");
                break;
            case 'E':
                System.out.println("E is easy");
                break;
            default:
                System.out.println("letter "+charvalue+" was not found in switch");
                break;
        }
    }

}
