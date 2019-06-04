package cn.huangchucai.shopping_cart.product.view;

public class UpdateProductRequest {
    private String name;
    private String description;
    private Double price;

    public UpdateProductRequest(String name, String description, Double price) {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
