package Examples;

public class E46_Song {

    // member vars
    private String title;

    private double duration;

    public E46_Song(String name,double duration){

        this.title=name;

        this.duration=duration;

    }
    public String getTitle() {

        return title;

    }
    @Override

    public String toString() {

        return title +": "+ duration;

    }

}
