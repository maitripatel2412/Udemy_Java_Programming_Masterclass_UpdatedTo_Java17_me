package Section_9_10;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name,String type,int count){

    public GroceryItem(String name){
        this(name,"DAIRY",1);
    }

    @Override
    public String toString(){
        return String.format("%d %s in %s",count,name.toUpperCase(),type.toUpperCase());
    }
}
public class arrayList {

    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples","produce",6);
        groceryArray[2] = new GroceryItem("oranges","produce",5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("yogurt"));
        objectList.add("butter");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.set(0,new GroceryItem("apples","produce",6));
        groceryList.remove(1);
        System.out.println(groceryList);

    }
}
