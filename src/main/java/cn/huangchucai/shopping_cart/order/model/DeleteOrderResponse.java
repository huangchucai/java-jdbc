package cn.huangchucai.shopping_cart.order.model;

import cn.huangchucai.shopping_cart.cart.model.Cart;

public class DeleteOrderResponse {
    private Cart cart;

    public DeleteOrderResponse(Cart cart) {
        this.cart = cart;
    }

    public DeleteOrderResponse() {
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
