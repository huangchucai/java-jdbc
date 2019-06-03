package cn.huangchucai.shopping_cart.order;

import cn.huangchucai.shopping_cart.cart.model.Cart;
import cn.huangchucai.shopping_cart.order.model.CreateOrderRequest;
import cn.huangchucai.shopping_cart.order.model.CreateOrderResponse;
import cn.huangchucai.shopping_cart.order.model.DeleteOrderResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @PostMapping("/orders")
    public ResponseEntity<CreateOrderResponse> createOrder(@RequestBody CreateOrderRequest cart){
        return new ResponseEntity<>(new CreateOrderResponse(), HttpStatus.CREATED);
    }

    @DeleteMapping("/orders/{orderId}")
    public ResponseEntity<DeleteOrderResponse> deleteOrder(@PathVariable String id) {
        return new ResponseEntity<>(new DeleteOrderResponse(), HttpStatus.OK);
    }
}
