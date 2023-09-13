public class main__notes {

    public static void main(String[] args) {

        /*
(student and java-student class)
          for (int i = 1 ; i <= 5 ; i++){
            JavaStudents student = new JavaStudents("1001" + i ,
                    switch (i) {
                        case 1 -> "maitri";
                        case 2 -> "payal";
                        case 3 -> "henvi";
                        case 4 -> "astha";
                        case 5 -> "hetvi";
                        default -> "anonymous";
                    },
                    "30/05/2001",
                    "java masterclass");
            System.out.println(student);
        }

        Student pojoStudent = new Student("101","harry","9/5//2004","java masterclass");
        JavaStudents recordStudent = new JavaStudents("102","jerry","10/5/2004","java masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList()+", java OCP exam 829");
//        recordStudent.setClassList(recordStudent.classList()+", java OCP exam 829");

        System.out.println(pojoStudent.getName()+" is taking class of "+pojoStudent.getClassList());
        System.out.println(recordStudent.name()+" is taking class of "+recordStudent.classList());


(car class)
        Car car = new Car();
        car.describeCar();
        car.setMake("mmm");
        System.out.println("Make = "+car.getMake());

(bank account class)
        BankAccount account = new BankAccount();
        account.setAccountBalance(100000);
        account.depositFunds(10000);
        account.withdrawFunds(100);

(customer class)
        Customer customer = new Customer("maitri","maitri@gmail.com",10000);
            System.out.println(customer.getName());
            System.out.println(customer.getEmail());
            System.out.println(customer.getCreditLimit());

        Customer secondcustomer = new Customer();
            System.out.println(secondcustomer.getName());
            System.out.println(secondcustomer.getEmail());
            System.out.println(secondcustomer.getCreditLimit());

(example 32)
         E32_Wall wall = new E32_Wall(9,8);
            System.out.println("area = "+wall.getArea());

(example 33)
         E33_Point point = new E33_Point(6,9);
            System.out.println("point = "+point.distance());

(example 35)
         E35_ComplexNumber complexNumber = new E35_ComplexNumber(8,9);

(inheritance example class - animal , dog,fish)

        Animal animal = new Animal("generic animal","huge",400);
        doAnimalStuff(animal,"slow");

        Dog dog = new Dog();
        doAnimalStuff(dog,"fast");
        Dog yorkie = new Dog("yorkie",15);
        doAnimalStuff(yorkie,"fast");

        Dog wolf  = new Dog("wolf",40);
        doAnimalStuff(wolf,"slow");

        Fish goldy = new Fish("goldfish",0.25,2,3);
        doAnimalStuff(goldy,"fast");

    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println(".....");
    }

//        student max = new student("max",21);
//        System.out.println(max);
//
//        primarySchoolStudent jimmy = new primarySchoolStudent("jimmy",8,"oreo");
//        System.out.println(jimmy);

(printer class main methods)

        Printer printer = new Printer(50,true);
        System.out.println("initial page counts = "+printer.getPagesPrinted());

        int  pagesPrinted = printer.printPages(5);
        System.out.printf("current job pages : %d, printer total = %d %n",pagesPrinted,printer.getPagesPrinted());

        pagesPrinted = printer.printPages(10);
        System.out.printf("current job pages : %d, printer total = %d %n",pagesPrinted,printer.getPagesPrinted());
*/

    }

}


/*
class student{

    private String name;
    private int age;

    student(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name+ " is "+age;
//        return "student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class primarySchoolStudent extends student{

    private String parentName;

    primarySchoolStudent(String name, int age,String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName+"'s kid ,"+super.toString();
//        return "primarySchoolStudent{" +
//                "parentName='" + parentName + '\'' +
//                "} " + super.toString();
    }
     }
(inheritance example employee  , worker , hourly-employee , salaried-employee)

        Employee me = new Employee("maitri","30/05/2001","04/04/2004");
        System.out.println(me);
        System.out.println("Age = "+me.getAge());
        System.out.println("pay = "+me.collectPay());

        SalariedEmployee joey = new SalariedEmployee("joey","19/02/1999","03/03/2022",350000);
        System.out.println(joey);
        System.out.println("Age = "+joey.getAge());
        System.out.println("joey's paycheck = $"+joey.collectPay());
        joey.retired();
        System.out.println("joey's pension paycheck = $"+joey.collectPay());

        HourlyEmployee merry = new HourlyEmployee("merry","30/05/2001","03/08/2023",15);
        System.out.println(merry);
        System.out.println("merry's paycheck = $"+merry.collectPay());
        System.out.println("merry's holiday pay = $"+merry.getDoublePay());

(class string-formatting main class methods)

        for (int i = 1 ; i <= 100000 ; i *= 10){
            System.out.printf("printing %6d \n",i);
        }

        Object age = 22;
        String formatedstring = String.format("your age is %d",age);
        System.out.println(formatedstring);

*/
