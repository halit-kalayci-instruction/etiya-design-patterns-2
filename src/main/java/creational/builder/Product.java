package creational.builder;

//@Builder
public class Product
{
    private int id;
    private String name;
    private float unitPrice;
    private String categoryName;

    private Product(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.unitPrice = builder.unitPrice;
        this.categoryName = builder.categoryName;
    }
    public Product() {
    }

    public Product(int id, String name, float unitPrice, String categoryName) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.categoryName = categoryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    // Boilerplate
    public static class Builder {
        private int id;
        private String name;
        private float unitPrice;
        private String categoryName;

        public Builder id(int id)
        {
            this.id = id;
            return this;
        }
        public Builder name(String name)
        {
            this.name = name;
            return this;
        }
        public Builder unitPrice(float unitPrice)
        {
            this.unitPrice = unitPrice;
            return this;
        }
        public Builder categoryName(String categoryName)
        {
            this.categoryName = categoryName;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
//  Product.builder().id(1).name("").build();