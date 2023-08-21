public class MainChallenge {

    public static void main(String[] args) {

        boolean gameover = true;
        int score = 800;
        int levelcompleted = 5;
        int bonus = 100;

       int highscore = calculatescore(gameover,score,levelcompleted,bonus);
       System.out.println("highscore is "+highscore);

        score = 10000;
        levelcompleted = 8;
        bonus = 200;

        System.out.println("next highscore is "+calculatescore(gameover,score,levelcompleted,bonus));

//        calculatescore(true,800,5,100);

    }
    public static int calculatescore(boolean gameover,int score,int levelcompleted,int bonus){

        int finalscore = score;

        if(gameover){
            finalscore += (levelcompleted *bonus);
            finalscore += 1000;
            System.out.println("your final score is "+finalscore);
        }

        return finalscore;
    }
}
