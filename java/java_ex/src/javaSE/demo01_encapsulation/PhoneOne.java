package javaSE.demo01_encapsulation;

import javaSE.demo01_encapsulation.Phone;

public class PhoneOne {
    public static void main(String[] args) {
        Phone myphone  = new Phone();
        myphone.brand = "xiaomi";
        myphone.price = 2999;
        System.out.println(myphone);//直接打印对象需要tostring()方法转换才能看见文本
        myphone.call("leijun");
        myphone.sendMessage();
        System.out.println("+++++++");

        method(myphone);
        //当一个对象作为参数，传递到方法当中，实际上传递进去的是对象的地址值。

        System.out.println("+++++++");
        Phone two = getPhone();//当使用一个对象类型作为方法的返回值，返回值其实就是对象的地址。
        System.out.println(two.brand);
        System.out.println(two.price);



    }

    public static void method(Phone phone) {
        System.out.println(phone.brand);
        System.out.println(phone.price);
        phone.call("雷军");

    }

    public static Phone getPhone() {
        Phone one = new Phone();
        one.brand = "hongmi";
        one.price = 2499;
        return one;

    }
}
