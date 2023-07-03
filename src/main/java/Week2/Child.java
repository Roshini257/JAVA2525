package src.main.java.Week2;

import src.main.java.Week2.Parent;
import src.main.java.Week2.Parent2;

public class Child implements Parent, Parent2 {

    String name;

    @Override
    public String getParent1name() {

        return name;
    }

    public void setName(String name) {
        this.name = name;


    }
}
