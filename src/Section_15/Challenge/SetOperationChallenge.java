package Section_15.Challenge;

import java.util.*;

public class SetOperationChallenge {

    public static void main(String[] args) {

        Set<Task> tasks = TaskData.getTasks("all");
        sortAndPrint("All Tasks",tasks);

        Comparator<Task> sortByPriority = Comparator.comparing(Task::getPriority);
        Set<Task> annsTasks = TaskData.getTasks("Ann");
        sortAndPrint("Ann's Tasks",annsTasks,sortByPriority);

        Set<Task> bobsTasks = TaskData.getTasks("Bob");
        sortAndPrint("Bob's Tasks",bobsTasks,sortByPriority);

        Set<Task> carolsTasks = TaskData.getTasks("Carol");
        sortAndPrint("Carol's Tasks",carolsTasks,sortByPriority);

    }

    public static void sortAndPrint(String header, Collection<Task> collection){

        sortAndPrint(header,collection,null);

    }

    public static void sortAndPrint(String header, Collection<Task> collection, Comparator<Task> sorter){

        String lineSeparator = "-".repeat(90);
        System.out.println(lineSeparator);

        System.out.println(header);
        System.out.println(lineSeparator);

        List<Task> list = new ArrayList<>(collection);
        list.sort(sorter);
        list.forEach(System.out::println);

    }

}
