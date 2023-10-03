package Section_13;

import Section_13.domain.Employee;
import Section_13.domain.EmployeeComparator;
import Section_13.domain.StoreEmployee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RunMethods {

    public static void main(String[] args) {

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10015,"Meg",2019,"Target"),
                new StoreEmployee(10515,"Joe",2021,"Walmart"),
                new StoreEmployee(10105,"Tom",2020,"Macys"),
                new StoreEmployee(10215,"Marty",2018,"Walmart"),
                new StoreEmployee(10322,"Bud",2016,"Target")
        ));

        var c0 = new EmployeeComparator<StoreEmployee>();
        var c1 = new Employee.EmployeeComparator<StoreEmployee>();
        var c2 = new StoreEmployee().new StoreComparator<StoreEmployee>();

        //using local class

        class NameSort<T> implements Comparator<StoreEmployee>{

            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }
        var c3 = new NameSort<StoreEmployee>();

        //using anonymous class
        var c4 = new Comparator<StoreEmployee>(){
            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        sortIt(storeEmployees,c0);
        sortIt(storeEmployees,c1);
        sortIt(storeEmployees,c2);
        sortIt(storeEmployees,c3);
        sortIt(storeEmployees,c4);
        sortIt(storeEmployees, (o1, o2) -> o1.getName().compareTo(o2.getName()));
    }

    public static <T> void sortIt(List<T> list, Comparator <? super T> comparator){

        System.out.println("sorting with Comparator: "+comparator.toString());
        list.sort(comparator);
        for (var employee : list){
            System.out.println(employee);
        }
    }
}
