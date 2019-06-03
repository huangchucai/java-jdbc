package cn.huangchucai.shopping_cart.cart.model;

import java.util.List;

public class UpdateCartRequest {
    private String name;
    private List<String> products;

    public UpdateCartRequest() {
    }

    public UpdateCartRequest(String name, List<String> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }
}
