package cn.huangchucai.shopping_cart.utils;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


/*
    依赖注入

    Statement 是SQL包里面的一个类, 没办法直接声明成Component, 需要用工厂模式去生成这个可以注入的依赖对象
 */
@Component("statement")
@ConfigurationProperties(prefix = "spring.datasource")
public class StatementFactory implements FactoryBean<Statement> {
    private String url;
    @Value("${name}")
    private String name;
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public Statement getObject() throws Exception {
        // 创建数据库连接
        Connection connection = DriverManager.getConnection(url);
        Statement statement = connection.createStatement();
        statement.setQueryTimeout(30);

        return statement;
    }

    @Override
    public Class<?> getObjectType() {
        return Statement.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
