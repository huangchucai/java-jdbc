package cn.huangchucai.shopping_cart.order.model;

import cn.huangchucai.shopping_cart.cart.model.Cart;

public class CreateOrderRequest {
    private Cart cart;

    public CreateOrderRequest(Cart cart) {
        this.cart = cart;
    }

    public CreateOrderRequest() {
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
