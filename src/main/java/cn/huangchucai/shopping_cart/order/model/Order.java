package cn.huangchucai.shopping_cart.order.model;

import cn.huangchucai.shopping_cart.cart.model.Cart;

public class Order {
    private Cart cart;
    private String id;

    public Order(Cart cart, String id) {
        this.cart = cart;
        this.id = id;
    }

    public Order() {
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
