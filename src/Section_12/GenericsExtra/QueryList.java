package Section_12.GenericsExtra;

import Section_12.GenericsExtra.model.Student;

import java.util.ArrayList;
import java.util.List;

public class QueryList <T extends Student & QueryItem> extends ArrayList<T>{

//    private List<T> items;

    public QueryList(){}
    public QueryList(List<T> items) {
        super(items);
//        this.items = items;
    }

    public static <S extends QueryItem> List<S> getMatches(List<S> items,String field,String value) {

        List<S> matches = new ArrayList<>();
        for (var i : items){
            if (i.matchFieldValue(field, value)){
                matches.add(i);
            }
        }
        return matches;
    }

    public QueryList<T> getMatches(String field,String value) {

        QueryList<T> matches = new QueryList<>();
        for (var i : this){
            if (i.matchFieldValue(field, value)){
                matches.add(i);
            }
        }
        return matches;
    }
}
