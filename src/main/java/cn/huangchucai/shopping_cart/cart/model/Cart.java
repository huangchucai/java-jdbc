package cn.huangchucai.shopping_cart.cart.model;

import cn.huangchucai.shopping_cart.product.model.Product;

import java.util.List;

public class Cart {
    private String name;
    private String id;
    private List<Product> products;

    public Cart() {
    }

    public Cart(String name, String id, List<Product> products) {
        this.name = name;
        this.id = id;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
