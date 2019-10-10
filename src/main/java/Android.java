public class Android extends Mobile{

    public Android() {
        super("Huawei", "Black", "Android");
    }

    @Override
    public void call(String message) {
        System.out.println("<Android>");
        super.call(message);
    }

    @Override
    public void getMobileBasicInfo() {
        super.getMobileBasicInfo();
    }
}
