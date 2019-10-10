public class IPhone extends Mobile {

    @Override
    public void call(String message) {
        System.out.println("<iPhone>");
        super.call(message);
    }
}
