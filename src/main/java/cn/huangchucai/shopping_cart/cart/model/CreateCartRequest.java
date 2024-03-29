package cn.huangchucai.shopping_cart.cart.model;

import cn.huangchucai.shopping_cart.product.model.Product;

import java.util.List;

public class CreateCartRequest {
    private String name;
    private List<Product> products;
    public CreateCartRequest() {
    }

    public CreateCartRequest(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
