package Section_8.Polymorphism;

public class main_polymorphism {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        Movie theMovie = Movie.getMovie("ScienceFiction","Star Wars");
//        theMovie.watchMovie();
//
//        while (true){
//            System.out.println("enter type (A for Adventure , C for Comedy , S for ScienceFiction or Q for Quit) : ");
//            String type = scanner.nextLine();
//            if ("Qq".contains(type)){
//                break;
//            }
//            System.out.println("enter movie title : ");
//            String title = scanner.nextLine();
//            Movie movie = Movie.getMovie(type,title);
//            movie.watchMovie();
//        }

        Car car = new Car("hyundai aura 2021");
        runRace(car);

        Car ferrari = new GasPoweredCar("aura",15.4,6);
        runRace(ferrari);

        Car tesla = new ElectricCar("2022 red tesla model 3",568,75);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("2022 black ferrari SF90 stradale",16,8,8);
        runRace(ferrariHybrid);

    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
