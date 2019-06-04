package cn.huangchucai.shopping_cart.product.controller;

import cn.huangchucai.shopping_cart.product.model.Product;
import cn.huangchucai.shopping_cart.product.model.ProductDao;
import cn.huangchucai.shopping_cart.product.view.GetProductResponse;
import cn.huangchucai.shopping_cart.product.view.ListProductResponse;
import cn.huangchucai.shopping_cart.product.view.UpdateProductRequest;
import cn.huangchucai.shopping_cart.product.view.UpdateProductResponse;
import cn.huangchucai.shopping_cart.product.view.create.CreateProductRequest;
import cn.huangchucai.shopping_cart.product.view.create.CreateProductRespose;
import cn.huangchucai.shopping_cart.product.view.validator.CreateProductRequestValidator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        List<Product> productsList = productDao.findAll();
        return new ResponseEntity<>(new ListProductResponse(productsList), HttpStatus.OK);
    }

    // 获取单个商品
    @GetMapping("/products/{productId}")
    public ResponseEntity<GetProductResponse> getProduct(@PathVariable int productId) {
        Product product = productDao.getById(productId);
        return new ResponseEntity<>(new GetProductResponse(product), HttpStatus.OK);
    }

    // 创建商品
    @PostMapping("/products")
    public ResponseEntity<CreateProductRespose> createProduct(@RequestBody CreateProductRequest createProductRequest) {
        createProductRequestValidator.validate(createProductRequest);
        Product product = productDao.save(new Product(createProductRequest.getName(), createProductRequest.getDescription(), createProductRequest.getPrice()));
        return new ResponseEntity<>(new CreateProductRespose(product), HttpStatus.CREATED);
    }

    // 更新商品
    @PutMapping("/products/{productId}")
    public ResponseEntity<UpdateProductResponse> updateProduct(@PathVariable Integer  productId, @RequestBody UpdateProductRequest updateProductRequest) {
        Product product = productDao.getById(productId);
        if(product == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        product.setName(updateProductRequest.getName());
        product.setDescription(updateProductRequest.getDescription());
        product.setPrice(updateProductRequest.getPrice());
        product = productDao.save(product);
        return new ResponseEntity<>(new UpdateProductResponse(product), HttpStatus.OK);
    }
}
