package cn.huangchucai.shopping_cart.cart;

import cn.huangchucai.shopping_cart.cart.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {

    // 创建购物车
    @PostMapping("/cart")
    public ResponseEntity<CreateCartResponse> createCart(@RequestBody CreateCartRequest createCartRequest) {
        return new ResponseEntity<>(new CreateCartResponse(), HttpStatus.CREATED);
    }
    // 查询购物车
    @GetMapping("/carts/{cartId}")
    public ResponseEntity<GetCartResponse> getCart(@PathVariable String id){
        return new ResponseEntity<>(new GetCartResponse(), HttpStatus.OK);
    }

    // 列举购物车
    @GetMapping("/carts")
    public ResponseEntity<GetCartsResponse> getCarts() {
        return new ResponseEntity<>(new GetCartsResponse(), HttpStatus.OK);
    }

    // 更新购物车
    @PutMapping("/cart/{cartId)")
    public ResponseEntity<UpdateCartResponse> updateCart(@PathVariable String id, @RequestBody UpdateCartRequest updateCartRequest) {
        return new ResponseEntity<>(new UpdateCartResponse(), HttpStatus.OK);
    }
}
