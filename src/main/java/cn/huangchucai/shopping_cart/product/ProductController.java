package cn.huangchucai.shopping_cart.product;

import cn.huangchucai.shopping_cart.product.model.*;
import cn.huangchucai.shopping_cart.validator.CreateProductRequestValidator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    // 校验创建创建商品的参数
    private CreateProductRequestValidator createProductRequestValidator;
    private ProductDao productDao;

    // 注入依赖
    public ProductController(CreateProductRequestValidator createProductRequestValidator, ProductDao productDao) {
        this.createProductRequestValidator = createProductRequestValidator;
        this.productDao = productDao;
    }

    // 获取所有的商品
    @GetMapping("/products")
    public ResponseEntity<ListProductResponse> listProducts() {
        return new ResponseEntity<>(new ListProductResponse(), HttpStatus.OK);
    }

    // 获取单个商品
    @GetMapping("/products/{productId}")
    public ResponseEntity<GetProductResponse> getProduct(@PathVariable int productId) {
        System.out.println(productId);
        Product product = productDao.get(productId);
        return new ResponseEntity<>(new GetProductResponse(product), HttpStatus.OK);
    }

    // 创建商品
    @PostMapping("/products")
    public ResponseEntity<CreateProductRespose> createProduct(@RequestBody CreateProductRequest createProductRequest) {
        createProductRequestValidator.validate(createProductRequest);
        return new ResponseEntity<>(new CreateProductRespose(), HttpStatus.CREATED);
    }

    // 更新商品
    @PutMapping("/products/{productId}")
    public ResponseEntity<UpdateProductResponse> updateProduct(@PathVariable String productId, @RequestBody UpdateProductRequest updateProductRequest) {
        return new ResponseEntity<>(new UpdateProductResponse(), HttpStatus.OK);
    }
}
