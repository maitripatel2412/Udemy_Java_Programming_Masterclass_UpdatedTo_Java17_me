package Section_8.Polymorphism;

public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title+" is a "+instanceType+" film");
    }

    public static Movie getMovie(String type,String title){
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }

}

class Adventure extends Movie{

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "pleasant scene",
                "scary music",
                "something bad happens");
    }

    public void watchAdventure(){
        System.out.println("watching an adventure! ");
    }
}

class Comedy extends Movie{

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "something funny happens",
                "something even funnier happens",
                "happy ending");
    }
    public void watchComedy(){
        System.out.println("watching an comedy! ");
    }
}

class ScienceFiction extends Movie{

    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "bad aliens do bad stuff",
                "space guys chase aliens",
                "planet blows up");
    }
    public void watchScienceFiction(){
        System.out.println("watching an ScienceFiction! ");
    }
}
