import java.util.ArrayList;
import java.util.List;

public class Category {

    private Long id;
    private String name;
    private List<Item> items = new ArrayList<>();

    // Constructors, getters, and setters

    public Category() {
    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    // Method to calculate product count
    public int getProductCount() {
        return items.size();
    }
}
