import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class CategoryController {

    private final Map<Long, Category> categories = new HashMap<>();
    private long nextCategoryId = 1;

    // Endpoint to create a new category
    @PostMapping("/categories")
    public Category createCategory(@RequestBody Category category) {
        category.setId(nextCategoryId++);
        categories.put(category.getId(), category);
        return category;
    }

    // Endpoint to delete a category
    @DeleteMapping("/categories/{categoryId}")
    public void deleteCategory(@PathVariable Long categoryId) {
        categories.remove(categoryId);
    }

    // Endpoint to update the name of a category
    @PutMapping("/categories/{categoryId}")
    public Category updateCategoryName(@PathVariable Long categoryId, @RequestBody Category updatedCategory) {
        Category category = categories.get(categoryId);
        if (category != null) {
            category.setName(updatedCategory.getName());
        }
        return category;
    }

    // Endpoint to get all categories
    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return new ArrayList<>(categories.values());
    }

    // Other methods for adding, updating, and deleting items within a category
    // ...
}
