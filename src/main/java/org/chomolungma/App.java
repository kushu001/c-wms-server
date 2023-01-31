package org.chomolungma;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author kushu001
 * @date 2022-01-30
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.chomolungma"})
@MapperScan("com.chomolungma.**.mapper")
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
