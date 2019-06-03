package cn.huangchucai.shopping_cart.cart.model;

public class GetCartResponse {
    public GetCartResponse() {
    }

    private Cart cart;

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public GetCartResponse(Cart cart) {
        this.cart = cart;
    }
}
