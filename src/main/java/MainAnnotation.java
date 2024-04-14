import entitiesAnnotation.Eagle;
import entitiesAnnotation.Lion;
import entitiesAnnotation.Wolf;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("entitiesAnnotation");

        Lion lion = context.getBean( Lion.class);
        Wolf wolf = context.getBean("wolf", Wolf.class);
        Eagle eagle =(Eagle) context.getBean("Black_hawk");

        System.out.println(lion.getName());
        System.out.println(wolf.getName());
        System.out.println(eagle.getName());

    }
}