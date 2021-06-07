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