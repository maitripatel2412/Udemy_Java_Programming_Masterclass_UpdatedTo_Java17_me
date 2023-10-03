package Section_12.GenericsExtra;

import Section_12.GenericsExtra.model.LPAStudent;

import java.util.Comparator;
import java.util.List;

//record Employee(String name)implements QueryItem{
//    @Override
//    public boolean matchFieldValue(String fieldName, String value) {
//        return false;
//    }
//};
public class GenericsExtra {
//    public static void main(String[] args) {
//
//        int studentCount = 10;
//        List<Student> students = new ArrayList<>();
//        for (int i = 0; i < studentCount; i++){
//            students.add(new Student());
//        }
//        students.add(new LPAStudent());
////        printList(students);
//        printMoreLists(students);
//
//        List<LPAStudent> lpaStudent = new ArrayList<>();
//        for (int i = 0; i < studentCount; i++){
//            lpaStudent.add(new LPAStudent());
//        }
////        printList(students);
//        printMoreLists(lpaStudent);
//
//        testList(new ArrayList<String>(List.of("Able","Barry","Charlie")));
//        testList(new ArrayList<Integer>(List.of(1,2,3)));
//
//        var queryList = new QueryList<>(lpaStudent);
//        var matches = queryList.getMatches("course","Python");
//        printMoreLists(matches);
//
//        var student2021 = QueryList.getMatches(students,"YearStarted","2021");
//        printMoreLists(student2021);
//
////        QueryList<Employee> employeeList = new QueryList<>();
//
//
//    }
//
//    public static void printMoreLists(List<? extends  Student> students){
////        Student last = students.get(students.size()-1);
////        students.set(0,last);
//        for (var student : students){
//            System.out.println(student.getYearStarted()+" : "+student);
//        }
//        System.out.println();
//    }
//
//    public static void testList(List<?> list){
//        for (var element : list){
//            if (element instanceof String s){
//                System.out.println("String : "+s.toUpperCase());
//            } else if (element instanceof Integer i) {
//                System.out.println("Integer : "+i.floatValue());
//            }
//        }
//    }

//    public static void testList(List<String> list){
//
//        for (var element : list){
//            System.out.println("String : "+element.toUpperCase());
//        }
//    }
//
//    public static void testList(List<Integer> list){
//
//        for (var element : list){
//            System.out.println("Integer : "+element.floatValue());
//        }
//    }

//    public static <T extends Student> void printList(List<T> students){
//        for (var student : students){
//            System.out.println(student.getYearStarted()+" : "+student);
//        }
//        System.out.println();
//    }

    public static void main(String[] args) {

        QueryList<LPAStudent> queryList = new QueryList<>();
        for (int i = 0; i < 25 ; i++){
            queryList.add(new LPAStudent());
        }
        System.out.println("ordered");
        queryList.sort(Comparator.naturalOrder());
        printList(queryList);

        System.out.println("matches ");
        var matches = queryList.getMatches("PercentComplete","50").getMatches("course","Python");
        printList(matches);

        System.out.println("ordered");
        matches.sort(null);
        printList(matches);

    }

        public static void printList(List<?> students){
        for (var student : students) {
            System.out.println(student);
        }
    }



    }
