package Week2.src;

public class Child implements Parent,Parent2 {

    String name;

    @Override
    public String getParent1name() {

        return name;
    }

    public void setName(String name) {
        this.name = name;


    }
}
