// package cn.huangchucai.shopping_cart.product;
//
// import cn.huangchucai.shopping_cart.product.model.*;
// import cn.huangchucai.shopping_cart.product.view.validator.CreateProductRequestValidator;
// import org.junit.Test;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
//
// import static org.junit.Assert.assertEquals;
//
// public class ProductControllerTest {
//     private ProductController productController = new ProductController(new CreateProductRequestValidator(), new ProductDao());
//
//     private CreateProductRequest createProductRequest = new CreateProductRequest("yx", "测试用例",12.2f);
//     private UpdateProductRequest updateProductRequest = new UpdateProductRequest("yx", "修改商品信息", 13f);
//
//     // 测试获取商品
//     @Test
//     public void shouldGetProductSuccessfully() {
//         ResponseEntity<GetProductResponse> response = productController.getProduct(1);
//         assertEquals(HttpStatus.OK, response.getStatusCode());
//     }
//
//     // 测试创建商品
//     @Test
//     public void shouldCreateProductSuccessfully() {
//         ResponseEntity<CreateProductRespose> response = productController.createProduct(createProductRequest);
//         assertEquals(HttpStatus.CREATED, response.getStatusCode());
//     }
//
//     // 测试获取所有的商品
//     @Test
//     public void shouldGetAllProductSuccessfully() {
//         ResponseEntity<ListProductResponse> response = productController.listProducts();
//         assertEquals(HttpStatus.OK, response.getStatusCode());
//     }
//
//     // 测试修改商品
//     @Test
//     public void shouldUpdateProductSuccessfully() {
//         ResponseEntity<UpdateProductResponse> response = productController.updateProduct("122", updateProductRequest);
//         assertEquals(HttpStatus.OK, response.getStatusCode());
//     }
// }
