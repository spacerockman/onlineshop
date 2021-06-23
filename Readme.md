## trouble shooting

  
- Mybatis generator
  - Maven
  - For mybatis generator, please apply 1.3.2 version
  - @Mapper
    <!--缺少此jar包，导致@Mapper注解无效-->
        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
            <version>1.2.0</version>
        </dependency>
  - Import the connecting jar
    `
    location="/Users/xujintao/.m2/repository/mysql/mysql-connector-java/8.0.25/mysql-connector-java-8.0.25.jar"/>`
    
  - The connecting information could be also set in generatorConfig.xml
    
  - We can use Maven to generate the models or mappers and add the configuration as following:
   
        <plugin>
            <groupId>org.mybatis.generator</groupId>
            <artifactId>mybatis-generator-maven-plugin</artifactId>
            <version>1.3.2</version>
            <configuration>
           
            <configurationFile>src/main/resources/generatorConfig.xml</configurationFile>
            <verbose>true</verbose>
            <overwrite>true</overwrite>
            </configuration>
        </plugin>
  
- JWT
  - <!--JWT(Json Web Token)登录支持,缺少此jar包把版本转为0.9.1-->
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt</artifactId>
            <version>0.9.1</version>
        </dependency>
  
  - <!--@NotEmpty 找不到-->
        <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
  
- DAO层报错
  - UmsAdminRoleRelationDao
  - 报错原因是UserDao的bean没有被找到。所以可以通过@Component注解来标记你要自动的类
  - @Component
    @Mapper