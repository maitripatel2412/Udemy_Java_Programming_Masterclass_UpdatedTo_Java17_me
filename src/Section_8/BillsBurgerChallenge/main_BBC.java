package Section_8.BillsBurgerChallenge;

public class main_BBC {

    public static void main(String[] args) {

//        Item coke = new Item("drink","coke",1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("topping","avocado",1.50);
//        avocado.printItem();

//        Burger burger = new Burger("regular",4);
//        burger.addToppings("bacon","cheese","mayo");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON","CHEESE","MAYO");
//        regularMeal.setDrinkSize("MEDIUM");
//        regularMeal.printItemizedList();

//        MealOrder secondMeal = new MealOrder("TURKEY","7-UP","CHILI");
//        secondMeal.addBurgerToppings("LETTUCE","CHEESE","MAYO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe","7-up","fries");
        deluxeMeal.addBurgerToppings("avocado","bacon","lettuce","cheese","mayo");
        deluxeMeal.setDrinkSize("small");
        deluxeMeal.printItemizedList();


    }
}
