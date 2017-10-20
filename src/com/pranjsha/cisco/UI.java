package com.pranjsha.cisco;

public class UI implements Prepable{
    public static final String ANSI_BOLD = "\033[0;1m";
    @Override
    public void prepared(Sandwich sandwich) {
        System.out.println(sandwich.getName() + "The sandwich is ready to pickup !!!");
    }

    public static void main(String[] args) {
        Sandwich s1 = new Sandwich("BLT Sandwich", 7.50, 120, 1, "Bacon, Lettuce, Tomatoes");
        Sandwich s2 = new Sandwich("Veggie DLite", 6.50, 150, 2, "Fresh Vegetables");
        Sandwich s3 = new Sandwich("Turkey Sandwich", 6.0, 180, 3, "Bacon, Lettuce, Tomatoes");
        Sandwich s4 = new Sandwich("Roasted Chicken Sandwich", 7.25, 120, 4, "Bacon, Lettuce, Tomatoes");
        Sandwich s5 = new Sandwich("Egg and Cheese", 7.50, 120, 5, "Bacon, Lettuce, Tomatoes");
        Sandwich s6 = new Sandwich("Grilled Portobello", 7.50, 120, 6, "Bacon, Lettuce, Tomatoes");
        Sandwich s7 = new Sandwich("Roasted Duck", 7.50, 120, 7, "Bacon, Lettuce, Tomatoes");
        Sandwich s8 = new Sandwich("Egg and Ham", 7.50, 120, 8, "Bacon, Lettuce, Tomatoes");
        Menu menu = new Menu();
        menu.sandwichList.add(s1);
        menu.sandwichList.add(s2);
        menu.sandwichList.add(s3);
        menu.sandwichList.add(s4);
        menu.sandwichList.add(s5);
        menu.sandwichList.add(s6);
        menu.sandwichList.add(s7);
        menu.sandwichList.add(s8);
        System.out.println("\n\n" + ANSI_BOLD + "Welcome to Subways. What would you like to Enjoy\n\n");
        for(Sandwich s: menu.sandwichList) {
            System.out.println(s.itemID + "\t" + s.getName() + "\t" + s.getPrice() );
        }
        // write your code here
    }
}
