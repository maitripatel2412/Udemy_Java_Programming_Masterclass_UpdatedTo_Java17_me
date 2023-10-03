package Section_12;

interface Player{
    String name();
}
record BaseballPlayer(String name,String position) implements Player{}
record FootballPlayer(String name,String position) implements Player{}
record volleyballPlayer(String name,String position) implements Player{}
public class Generic {

    public static void main(String[] args) {

        var philly = new Affiliation("city","philadelphia , PA","US");

        BaseballTeam phillies1 = new BaseballTeam("philadelphia phillies");
        BaseballTeam astros1 = new BaseballTeam("houston astros");
        scoreResult(phillies1,3,astros1,4);

        SportsTeam phillies2 = new SportsTeam("philadelphia phillies");
        SportsTeam astros2 = new SportsTeam("houston astros");
        scoreResult(phillies2,3,astros2,4);

        Team<BaseballPlayer, Affiliation> phillies = new Team<>("philadelphia phillies",philly);
        Team<BaseballPlayer, Affiliation> astros = new Team<>("houston astros");
        scoreResult(phillies,3,astros,4);

        var harper = new BaseballPlayer("B Harper","right fielder");
        var marsh = new BaseballPlayer("B Marsh","right fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        var guthrie = new BaseballPlayer("D guthrie","centre fielder");
        phillies.addTeamMember(guthrie);
        phillies.listTeamMembers();

        SportsTeam afc1 = new SportsTeam("adelaide crows");
        Team<FootballPlayer, String> afc = new Team<>("adelaide crows",
                "City of adelaide, South Australia, in AU");
        var tex = new FootballPlayer("tex walker","centre half forward");
        afc.addTeamMember(tex);
        var rory = new FootballPlayer("rory laird","midfield");
        afc.addTeamMember(rory);
        afc.listTeamMembers();

        Team<volleyballPlayer, Affiliation> adelaide = new Team<>("adelaide storm");
        adelaide.addTeamMember(new volleyballPlayer("N Roberts","setter"));
        adelaide.listTeamMembers();

        var canberra = new Team<volleyballPlayer, Affiliation>("canberra heat");
        canberra.addTeamMember(new volleyballPlayer("B Black","opposite"));
        canberra.listTeamMembers();
        scoreResult(canberra,0,adelaide,2);

//        Team<Integer> melbourneVB = new Team<>("melbourne vipers");

    }

    public static void scoreResult(BaseballTeam team1, int t1Score,BaseballTeam team2, int t2Score){
        String message = team1.setScore(t1Score,t2Score);
        team2.setScore(t2Score,t1Score);
        System.out.printf("%s %s %s %n",team1,message,team2);
    }

    public static void scoreResult(SportsTeam team1, int t1Score,SportsTeam team2, int t2Score){
        String message = team1.setScore(t1Score,t2Score);
        team2.setScore(t2Score,t1Score);
        System.out.printf("%s %s %s %n",team1,message,team2);
    }

    public static void scoreResult(Team team1, int t1Score,Team team2, int t2Score){
        String message = team1.setScore(t1Score,t2Score);
        team2.setScore(t2Score,t1Score);
        System.out.printf("%s %s %s %n",team1,message,team2);
    }

}
