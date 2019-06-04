package cn.huangchucai.shopping_cart.product.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
    DAO -- Data access object
    专门用来处理数据读取, Product相关的数据访问的逻辑!

    ORM 会帮我实现这个接口, 也就是实现其中的操作! (生成SQ语句, 执行SQL语句, 转换返回结果到JAVA对象)
 */
@Repository
public interface ProductDao  extends CrudRepository<Product, Integer> {
    Product getById(Integer id);
    List<Product> findAll();
    Product save(Product product);
}
