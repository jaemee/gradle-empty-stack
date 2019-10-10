public class IPhone extends Mobile {

    public IPhone() {
        super("iPhone11", "Black", "iPhone");
    }

    @Override
    public void call(String message) {
        System.out.println("<iPhone>");
        super.call(message);
    }
}
