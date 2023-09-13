package Section_8;

public class PersonalComputer extends Product{

    private ComputerCase computerCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PersonalComputer(String model, String manufacturer,
                            ComputerCase computerCase, Monitor monitor,
                            MotherBoard motherBoard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200,50,"yellow");
    }

    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }

//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//    public Monitor getMonitor() {
//        return monitor;
//    }
//    public MotherBoard getMotherBoard() {
//        return motherBoard;
//    }

    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208","Dell","240");
        Monitor monitor = new Monitor("27inch beast","Acer",27,"2540 x 1440");
        MotherBoard theMotherBoard = new MotherBoard("BJ-200","Asus",4,6,"V2.44");
        PersonalComputer thePc = new PersonalComputer("2208","Dell",theCase,monitor,theMotherBoard);

        thePc.powerUp();

//        thePc.getMonitor().drawPixelAt(10,10,"red");
//        thePc.getMotherBoard().loadPrograms("windows OS");
//        thePc.getComputerCase().pressPowerButton();

    }
}
