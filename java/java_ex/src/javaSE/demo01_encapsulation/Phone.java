package javaSE.demo01_encapsulation;

public class Phone {
    String brand;
    double price;
    public void call(String who) {
        System.out.println("给" + who + "打电话");
    }
    public void sendMessage(){
        System.out.println("群发短信");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
