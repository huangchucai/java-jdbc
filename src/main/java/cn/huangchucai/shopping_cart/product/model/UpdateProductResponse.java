package cn.huangchucai.shopping_cart.product.model;

/**
 * 更新商品的返回格式
 */
public class UpdateProductResponse {
    private Product product;

    public UpdateProductResponse(Product product) {
        this.product = product;
    }

    public UpdateProductResponse() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

