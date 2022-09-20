public class Iphone {
    private String color;
    private static double price;

    public void setColor(String color) {

        this.color = color;
    }

    public static void setPrice(double price) {

        Iphone.price = price;
    }

    public static double getPrice() {
        return price;
    }

}
