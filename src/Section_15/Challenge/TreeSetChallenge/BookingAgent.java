package Section_15.Challenge.TreeSetChallenge;

public class BookingAgent {
    public static void main(String[] args) {

        int rows = 10;
        int totalSeats = 100;

        Theatre rodgersNYC = new Theatre("Richard Rodgers",rows,totalSeats);
        rodgersNYC.printSeatMap();

        bookSeat(rodgersNYC,'A',5);
        bookSeat(rodgersNYC,'A',5);
        bookSeat(rodgersNYC,'A',6);
        bookSeat(rodgersNYC,'A',4);

        bookSeats(rodgersNYC,4 ,'B',3,10);
        bookSeats(rodgersNYC,6,'B','C',2,8);

    }

    private static void bookSeat(Theatre theatre,char row, int seatNo){

        String seat = theatre.reserveSeat(row,seatNo);
        if (seat != null){
            System.out.println("Congratulations! Your reserved seat is " + seat);
            theatre.printSeatMap();
        } else {
            System.out.println("Sorry! Unable to reserve " + row + seatNo);
        }
    }

    private static void bookSeats(Theatre theatre, int tickets, char minRow,
                                  int minSeat, int maxSeat){

        bookSeats(theatre,tickets,minRow,minRow,minSeat,maxSeat);
    }
    private static void bookSeats(Theatre theatre, int tickets, char minRow,
                                  char maxRow, int minSeat, int maxSeat){

        var seats = theatre.reservedSeats(tickets,minRow,maxRow,minSeat,maxSeat);
        if (seats != null){
            System.out.println("Congratulations! Your reserved seat is " + seats);
            theatre.printSeatMap();
        } else {
            System.out.println("Sorry! no matching contiguous seats in rows : " + minRow + "-" + maxRow);
        }
    }
}
