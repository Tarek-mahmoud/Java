

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal price;

    Product() {

    }

    Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [name = " + name + ", Price = " + price + "]";
    }
}
