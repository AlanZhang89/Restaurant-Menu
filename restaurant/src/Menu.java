import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<MenuItem> items;
    private String lastUpdated;

    public Menu() {
        this.items = new ArrayList<>();
        this.lastUpdated="";
    }

    public Menu(List<MenuItem> items,String lastUpdated) {
        this.items = items;
        this.lastUpdated = lastUpdated;
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated() {
        Scanner inputUpdateDate = new Scanner(System.in);
        System.out.println("Type Update month :");
        String month = inputUpdateDate.next();
        System.out.println("Type Update day :");
        String day = inputUpdateDate.next();
        System.out.println("Type Update year :");
        String year = inputUpdateDate.next();
        this.lastUpdated = month + "/" + day + "/" + year;
    }
    public void printMenu (Menu foodType){
        for(MenuItem item : foodType.getItems()){
            System.out.println(item.toString() );
        }
    }
}
