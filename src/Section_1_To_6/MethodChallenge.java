public class MethodChallenge {

    public static void main(String[] args) {

        int highscoreposition = calculatehighcoreposition(1500);
        displayhighscoreposition("maitri",highscoreposition);

        highscoreposition = calculatehighcoreposition(1000);
        displayhighscoreposition("payal",highscoreposition);

        highscoreposition = calculatehighcoreposition(500);
        displayhighscoreposition("henvi",highscoreposition);

        highscoreposition = calculatehighcoreposition(100);
        displayhighscoreposition("aastha",highscoreposition);

        highscoreposition = calculatehighcoreposition(25);
        displayhighscoreposition("yesha",highscoreposition);
    }

    public static void displayhighscoreposition(String playername,int highscoreposition){
        System.out.println(playername+" managed to get into position "
                +highscoreposition+" on the high score list ");
    }

    public static int calculatehighcoreposition(int playerscore) {

        int position = 0;
        if (playerscore >= 1000) {
            position = 1;
        } else if (playerscore >= 500 && playerscore < 1000) {
            position = 2;
        } else if (playerscore >= 100 && playerscore < 500) {
            position = 3;
        } else {
            position = 4;
        }
        return position;
    }
}
