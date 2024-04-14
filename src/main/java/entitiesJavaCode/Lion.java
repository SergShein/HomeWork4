package entitiesJavaCode;

import org.springframework.stereotype.Component;



public class Lion {

    private String name ="Jack";

    //getters setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init() {
        System.out.println("The bean is initialized");
    }
}
