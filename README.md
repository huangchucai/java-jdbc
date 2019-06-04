# java-orm
## 使用orm连接数据库
#### ORM(Object Relational Mapping) 对象关系影射
在master分支中，我们使用了jdbc来连接数据库，首先需要
##### 以前的JDBC
1. 创建JDBC的连接`statement`
```java
@Component("statement")
public class StatementFactory implements FactoryBean<Statement> {
    // TODO: 把数据库地址放到配置文件里
    private static final String DB_PATH = "jdbc:sqlite:resources/sample.db";
    @Override
    public Statement getObject() throws Exception {
        // 创建数据库连接
        Connection connection = DriverManager.getConnection(DB_PATH);
        Statement statement = connection.createStatement();
    }
    ...
}
```
2. 创建DAO(连接数据库)和解析JDBC的返回结果
```java
@Component
public class ProductDao {
    private Statement statement;

    public ProductDao(Statement statement) {
        this.statement = statement;
    }

    public Product get(int id) {
        try {
            String query = "SELECT * FROM `product` WHERE id = " + id;
            ResultSet rs = statement.executeQuery(query);

            if (rs.next()) {
                return new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getDouble("price")
                );
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Failed to query product from DB.");
        }

        return null;
    }
}
```
3. 为每个具体的数据查询操作创建SQL语句
```java
String query = "SELECT * FROM `product` WHERE id = " + id;
ResultSet rs = statement.executeQuery(query);
```
这样操作的话,我们的Java代码和SQL有强耦合，我们需要专门处理Java的数据结构和SQL的转换，然后还需要解析SQL的返回的结果，如果有多个接口操作，就会出现
很多**重复重复**的代码

#### ORM 
1. 根据具体业务和面向对象的思想来设计数据模型
2. 使用orm 在Java代码中声明和定义数据结构,也就是Java的类和对象
3. 使用ORM  提供的接口和方法,声明和定义对数据的访问层(**这里我们不需要再写SQL语句**)
4. ORM框架根据我们的定义 (面向对象方式), 构建相应的SQL语句和环境, 执行对数据的访问

##### 优势
* 抽象层次高, 和现实业务更接近
* 数据访问操作的抽象层次高, ORM框架帮助隐藏了很多细节
* 面向对象封装
##### 劣势
* 相对固定的数据模型
* 不如直接使用SQL灵活
