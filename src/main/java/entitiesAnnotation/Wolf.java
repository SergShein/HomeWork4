package entitiesAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Wolf {
    private String name = "Billy";

    public String getName() {
        return name;
    }

    public void setName(String name) {
         this.name = name;
    }
}
