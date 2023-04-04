import java.util.Date;

public class demo {
    public static void main(String[] args) {
        MenuItem vegMeatSalad = new MenuItem("VegMeat Salad",5.99,
                "small pieces of food (such as pasta, meat, fruit, " +
                        "or vegetables)","appetizer",true);
        MenuItem vegSalad = new MenuItem("Veg Salad",3.99,
                "small pieces of food ( fruit, " +
                        "or vegetables)","appetizer",true);
        MenuItem friedOnion = new MenuItem("Fried Onion",6.99,
                "They generally consist of a cross-sectional (ring) of onion dipped in batter" +
                        " or bread crumbs and then deep fried; a variant is made with" +
                        " onion paste.","appetizer",true);
        Menu appetizers = new Menu();
        appetizers.addItem(vegMeatSalad);
        appetizers.addItem(vegSalad);
        appetizers.addItem(friedOnion);
        for(MenuItem item : appetizers.getItems()){
            System.out.println(item.toString() + "Last datetime:" + appetizers.getLastUpdated());
        }
    }
}