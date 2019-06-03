package cn.huangchucai.shopping_cart.cart.model;

import java.util.List;

public class GetCartsResponse {
    private List<Cart> carts;

    public GetCartsResponse() {
    }

    public GetCartsResponse(List<Cart> carts) {
        this.carts = carts;
    }

    public List<Cart> getCarts() {
        return carts;
    }

    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }
}
