public class Person {
    private String name;

    public Person(Mobile mobile, String message) {
        mobile.call(getName() + message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
