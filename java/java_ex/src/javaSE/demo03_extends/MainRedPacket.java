package javaSE.demo03_extends;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        //1.创建舰长和领红包的成员
        Captain captain = new Captain("舰长", 2000);
        Member bronya = new Member("bronya", 20);
        Member mei = new Member("mei", 20);
        Member kiana = new Member("kiana", 20);


        //2.包好红包，调用舰长类下的发红包方法，共发1314块，分成3个红包
        ArrayList<Integer> redList = captain.send(1314, 3);

        //3.调用成员类的收红包方法
        bronya.receive(redList);
        mei.receive(redList);
        kiana.receive(redList);
        //4.调用user类的show方法查看各自的余额。
        captain.show();
        bronya.show();
        mei.show();
        kiana.show();

    }
}
