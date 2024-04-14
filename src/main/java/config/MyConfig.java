package config;


import entitiesJavaCode.Eagle;
import entitiesJavaCode.Lion;
import entitiesJavaCode.Wolf;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class MyConfig {

    @Bean
    public Lion getLion() {
        return new Lion();
    }

    @Bean
    public Wolf getWolf() {
        return new Wolf();
    }

    @Bean("white_hawk")
    public Eagle getEagle(){
        return new Eagle();
    }


}
