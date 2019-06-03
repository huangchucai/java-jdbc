package cn.huangchucai.shopping_cart.cart;

import cn.huangchucai.shopping_cart.cart.model.*;
import cn.huangchucai.shopping_cart.product.model.Product;
import cn.huangchucai.shopping_cart.order.model.CreateOrderResponse;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CartControllerTest {
    // Arrange
    private CartController cartController = new CartController();
    private List<Product> products;

    private CreateCartRequest createCartRequest = new CreateCartRequest("测试用例", products);
    private UpdateCartRequest updateCartRequest = new UpdateCartRequest();

    @Test
    public void shuoldCreateCart() {
        // Act
        ResponseEntity<CreateCartResponse> createOrderResponse = cartController.createCart(createCartRequest);
        // Assert
        assertEquals(HttpStatus.CREATED, createOrderResponse.getStatusCode());
    }

    @Test
    public void shouldGetCart() {
        ResponseEntity<GetCartResponse> getCartResponse = cartController.getCart("123");
        // Assert
        assertEquals(HttpStatus.OK, getCartResponse.getStatusCode());
    }

    @Test
    public void shouldGetCarts() {
        ResponseEntity<GetCartsResponse> getCartsResponse = cartController.getCarts();
        // Assert
        assertEquals(HttpStatus.OK, getCartsResponse.getStatusCode());
    }

    @Test
    public void shouldUpdateCart() {
        ResponseEntity<UpdateCartResponse> updateCartResponse = cartController.updateCart("123", updateCartRequest);
        // Assert
        assertEquals(HttpStatus.OK, updateCartResponse.getStatusCode());
    }
}
