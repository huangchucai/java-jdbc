package cn.huangchucai.shopping_cart.product.model;

public class CreateProductRespose {
    private Product product;

    public CreateProductRespose(Product product) {
        this.product = product;
    }

    public CreateProductRespose() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
