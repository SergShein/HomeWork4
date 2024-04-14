package entitiesAnnotation;

import org.springframework.stereotype.Component;

@Component("Black_hawk")
public class Eagle {
    private String name = "Mike";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
