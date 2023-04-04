import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Menu {
    private List<MenuItem> items;
    private Date lastUpdated;

    public Menu() {
        this.items = new ArrayList<>();
        this.lastUpdated = new Date();
    }

    public Menu(List<MenuItem> items, Date lastUpdated) {
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

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date date) {
        this.lastUpdated = date;
    }
}
