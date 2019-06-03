package cn.huangchucai.shopping_cart.order.model;

import cn.huangchucai.shopping_cart.cart.model.Cart;

public class CreateOrderResponse {
    private Cart cart;
    private String id;

    public CreateOrderResponse(Cart cart, String id) {
        this.cart = cart;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateOrderResponse() {
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
