package cn.huangchucai.shopping_cart.order;

import cn.huangchucai.shopping_cart.order.model.CreateOrderRequest;
import cn.huangchucai.shopping_cart.order.model.CreateOrderResponse;
import cn.huangchucai.shopping_cart.order.model.DeleteOrderResponse;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;

public class OrderControllerTest {
    private CreateOrderRequest createOrderRequest = new CreateOrderRequest();
    private OrderController orderController = new OrderController();
    // 创建订单
    @Test
    public void shouldCreateOrder() {
        ResponseEntity<CreateOrderResponse> createOrderResponse = orderController.createOrder(createOrderRequest);
        // assert
        assertEquals(HttpStatus.CREATED, createOrderResponse.getStatusCode());

    }

    // 删除订单
    @Test
    public void shouldDeleteOrder() {
        ResponseEntity<DeleteOrderResponse> deleteOrderResponse = orderController.deleteOrder("123");

        // assert
        assertEquals(HttpStatus.OK, deleteOrderResponse.getStatusCode());
    }
}
