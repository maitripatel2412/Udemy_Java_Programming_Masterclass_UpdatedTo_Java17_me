public class MethodOverloading {

    public static void main(String[] args) {

        int newscore = calculatescore("maitri",500);
        System.out.println(" new score is :- "+newscore);

        calculatescore(80);
    }

    public static int calculatescore(String playername,int score){
        System.out.println(" player "+playername+" scored "+score+" points.");
        return score * 1000;
    }

    public static int calculatescore(int score){
        System.out.println(" unknown player scored "+score+" points.");
        return score * 1000;
    }

    public static int calculatescore(){
        System.out.println(" no player name no scored points.");
        return 0;
    }

}
