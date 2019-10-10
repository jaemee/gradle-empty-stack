public class Person {
    private String name;

    public static void main(String[] args){
        Mobile mobile = new Android("Android", "Black", "LG");
        mobile.call("123213123asdsaasdsad213");
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
