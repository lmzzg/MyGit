package javaSE.demo04_apiUsb;

public class DemoMain {
    public static void main(String[] args) {
        //首先创建一个笔记本电脑，调用PowerOn（）方法
        Computer computer =new Computer();
        computer.powerOn();
        //准备一个鼠标，供电脑使用（调用useDevice()方法）
//        Mouse mouse = new Mouse();
        USB mouse = new Mouse();//多态写法，左接口右实现类--即mouse是鼠标，也是USB设备
        computer.useDevice(mouse);//向上转型一定是安全的，因为从小范围转向了大范围。（鼠标->usb设备）
        //准备一个键盘，供电脑使用
        Keyboard keyboard = new Keyboard();
        computer.useDevice(keyboard);//这里参数keyboard隐式转换为了USB设备
        //使用完毕，关机。
        computer.powerOff();

    }
}
