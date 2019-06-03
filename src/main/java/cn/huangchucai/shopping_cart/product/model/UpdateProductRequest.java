package cn.huangchucai.shopping_cart.product.model;

public class UpdateProductRequest {
    private String name;
    private String description;
    private Float price;

    public UpdateProductRequest(String name, String description, Float price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public UpdateProductRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
