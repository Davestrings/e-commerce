package commerce;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Category {
    private String categoryName;
    private Collection<SubCategory> subCategories = new HashSet<>();
}
