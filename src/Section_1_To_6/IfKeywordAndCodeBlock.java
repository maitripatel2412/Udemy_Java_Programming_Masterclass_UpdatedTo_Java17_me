public class IfKeywordAndCodeBlock {

    public static void main(String[] args) {

        boolean gameover = true;
        int score = 500;
        int levelcompleted = 5;
        int bonus = 100;

        if(score < 5000 && score >1000){
            System.out.println("your score was less then 5000 and greater then 1000 ");
        } else if (score < 1000) {
            System.out.println("score was less then 1000");
        } else {
            System.out.println("go here");
        }
    }

}
