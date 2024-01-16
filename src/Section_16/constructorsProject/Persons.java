package Section_16.constructorsProject;

public record Persons(String name, String dob) {

//    public Persons(String name, String dob) {
//        this.name = name;
//        this.dob = dob.replace('-','/');
//    }

    public Persons(Persons p) {
        this(p.name, p.dob);
    }

    public Persons {

        if (dob == null) throw new IllegalArgumentException("Bad Data");
        dob = dob.replace('-','/');

        

    }
}
