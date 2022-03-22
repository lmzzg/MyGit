package javaSE.demo04_apiUsb;

public class Computer {
    //电脑的功能：开关机 --成员方法
    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }
    public void powerOff(){
        System.out.println("笔记本电脑关机");
    }

    //定义使用USB设备的方法，使用USB接口作为方法的参数
    public void useDevice(USB usb){
        usb.open();//打开usb设备
        //判断usb是什么实现类，进而对特定功能进行使用。instanceof判断前面的对象是否是后面接的实现类，如是为true。
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;//向下转型，即这个usb设备是鼠标
//            Mouse mouse = new Mouse();
            mouse.click();
        }
        else if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;//向下转型：子类名称 子类对象 = （子类名称）父类对象
//            Keyboard keyboard = new Keyboard();
            keyboard.type();
        }

        usb.close();//关闭usb设备
    }

}


