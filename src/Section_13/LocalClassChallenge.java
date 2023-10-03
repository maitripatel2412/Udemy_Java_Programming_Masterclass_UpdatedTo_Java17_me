package Section_13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LocalClassChallenge {

    public static void main(String[] args) {

        Employee e1 = new Employee("maitri","patel","11/11/2011");
        Employee e2 = new Employee("payal","solanki","11/11/2011");
        Employee e3 = new Employee("henvi","patel","11/11/2011");
        Employee e4 = new Employee("hetvi","patel","11/11/2011");
        Employee e5 = new Employee("aastha","shah","11/11/2011");

        List<Employee> list = new ArrayList<>(Arrays.asList(e1,e2,e3,e4,e5));

        printOrderedList(list,"name");
        System.out.println();
        printOrderedList(list,"year");
    }

    public static void printOrderedList(List<Employee> eList, String sortField){

        int currentYear = LocalDate.now().getYear();

        class MyEmployee{

            Employee containedEmployee;
            int yearsWorked;
            String fullName;

            public MyEmployee(Employee containedEmployee) {
                this.containedEmployee = containedEmployee;
                yearsWorked = currentYear - Integer.parseInt(containedEmployee.hireData().split("/")[2]);
                fullName = String.join(" ",containedEmployee.first(), containedEmployee.last());
            }

            @Override
            public String toString() {
                return "%s has been an employee for %d years ".formatted(fullName,yearsWorked);
            }
        }
        List<MyEmployee> list = new ArrayList<>();
        for (Employee employee : eList){
            list.add(new MyEmployee(employee));
        }

        var comparator  = new Comparator<MyEmployee>(){
            @Override
            public int compare(MyEmployee o1, MyEmployee o2) {
                if (sortField.equals("name")) {
                    return o1.fullName.compareTo(o2.fullName);
                }
                return o1.yearsWorked - o2.yearsWorked;
            }
        };
        list.sort(comparator);

        for (MyEmployee myEmployee : list){
            System.out.println(myEmployee);
        }
    }
}
