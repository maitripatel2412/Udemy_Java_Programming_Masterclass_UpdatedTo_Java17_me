package Section_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

class PlainOld{

    private static int last_id = 1;
    private int id;
    public PlainOld(){
        id = PlainOld.last_id++;
        System.out.println("Creating a PlainOld Object: id = "+id);
    }
}
public class MethodReferences {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of(
                "Anna","Bob","Chuck","Dave"
        ));
        list.forEach(System.out::println);

        calculator(Integer::sum,10,25);
        calculator(Double::sum,2.5,7.5);

        Supplier<PlainOld> reference1 = PlainOld::new;

        PlainOld newPojo = reference1.get();

        System.out.println("getting array");
        PlainOld[] pojo1 = seedArray(PlainOld::new,10);

        calculator((s1,s2) -> s1.concat(s2),"maitri ","patel");
        calculator(String::concat,"maitri ","patel");

        BinaryOperator<String> b1 = String::concat;
        BiFunction<String,String,String> b2 = String::concat;
        UnaryOperator<String> u1 = String::toUpperCase;

        System.out.println(b1.apply("hello ","world"));
        System.out.println(b2.apply("Hello ","World"));
        System.out.println(u1.apply("hello"));

        String result = "hello".transform(u1);
        System.out.println("result = "+result);

        result = result.transform(String::toLowerCase);
        System.out.println("result = "+result);

        Function<String,Boolean> f0 = String::isEmpty;
        boolean resultBoolean = result.transform(f0);
        System.out.println("result = "+resultBoolean);


    }
    private static <T> void calculator(BinaryOperator<T> function, T value1, T value2){

        T result = function.apply(value1,value2);
        System.out.println("result of operation : "+result);
    }

    private static PlainOld[] seedArray (Supplier<PlainOld> reference, int count){

        PlainOld[] array = new PlainOld[count];
        Arrays.setAll(array,i -> reference.get());
        return array;
    }
}
