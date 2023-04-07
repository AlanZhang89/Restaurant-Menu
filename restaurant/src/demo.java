import java.util.Date;

public class demo {
    public static void main(String[] args) {
        MenuItem vegMeatSalad = new MenuItem("VegMeat Salad",5.99,
                "small pieces of food (such as pasta, meat, fruit, " +
                        "or vegetables)","appetizer","New");
        MenuItem vegSalad = new MenuItem("Veg Salad",3.99,
                "small pieces of food ( fruit, " +
                        "or vegetables)","appetizer","Old");
        MenuItem friedOnion = new MenuItem("Fried Onion",6.99,
                "They generally consist of a cross-sectional (ring) of onion dipped in batter" +
                        " or bread crumbs and then deep fried; a variant is made with" +
                        " onion paste.","appetizer","New");
        MenuItem hamburger = new MenuItem("Beef Hamburger",8.99,
                " a sandwich consisting of a cooked Beef patty on a bun","main course","New");
        Menu appetizers = new Menu();
        Menu mainCourse = new Menu();
        appetizers.addItem(vegMeatSalad);
        appetizers.addItem(vegSalad);
        appetizers.addItem(friedOnion);
        appetizers.removeItem(vegSalad);
        mainCourse.addItem(hamburger);
        appetizers.setLastUpdated();
        appetizers.printMenu(appetizers);
        mainCourse.printMenu(mainCourse);
        System.out.println("Appetizer Menu UpdateTime: " + appetizers.getLastUpdated());
        System.out.println(appetizers.equals(mainCourse));
    }
}