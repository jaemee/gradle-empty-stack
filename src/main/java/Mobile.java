public class Mobile {
    private String name;
    private String color;
    private String brand;

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public void call(String message){
        if((name.equalsIgnoreCase("Android") && message.length() <= 20) || (name.equalsIgnoreCase("iPhone") && message.length() <= 15)) {
            System.out.print("Message : " + message);
        }else{
            System.out.print("Message : Message cannot be sent");
        }
    }

    public void getMobileBasicInfo(){
        System.out.println("name : " + getName() + ", color : " + getColor() + ", brand : " + getBrand());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
