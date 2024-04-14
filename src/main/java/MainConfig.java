import config.MyConfig;
import entitiesJavaCode.Eagle;
import entitiesJavaCode.Lion;
import entitiesJavaCode.Wolf;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainConfig {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext( MyConfig.class);

        Lion lion = context.getBean(Lion.class);
        Wolf wolf = (Wolf) context.getBean("getWolf");
        Eagle eagle = context.getBean("white_hawk", Eagle.class);

        System.out.println(lion.getName());
        System.out.println(wolf.getName());
        System.out.println(eagle.getName());



    }
}
