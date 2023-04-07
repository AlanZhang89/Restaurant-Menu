import java.util.Objects;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private String isNew;

    public MenuItem(String name, double price, String description, String category, String isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String isNew() {
        if(this.isNew == "new"){
            return "Is New";
        }else if(this.isNew == "old"){
            return "Is Old";
        }
        return "Unknow!";
    }

    public void setNew(String isNew) {
        this.isNew = isNew.toLowerCase();
    }
    @Override
    public String toString() {
        return this.category.toUpperCase() + " name:" + this.name + ", price:" + this.price + ", Description:" + this.description + ", Category:" + ", New Or Old:" + this.isNew + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.getPrice(), getPrice()) == 0 &&
                Objects.equals(getName(), menuItem.getName()) &&
                Objects.equals(getDescription(), menuItem.getDescription()) &&
                Objects.equals(getCategory(), menuItem.getCategory()) &&
                Objects.equals(isNew, menuItem.isNew);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getDescription(), getCategory(), isNew);
    }
}
