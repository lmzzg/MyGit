package javaSE.demo03_extends;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member() {
    }

    public Member(String username, int leftMoney) {
        super(username, leftMoney);
    }
    //抢红包方法,参数值是舰长发的红包
    public void receive(ArrayList<Integer> redList){
        //1.从红包集合当中抽取一个红包：即是随机获取集合中的一个索引编号
        int index = new Random().nextInt(redList.size());
        //2.删除获取的索引，即获得红包,避免每个人获得相同的红包
        int delta = redList.remove(index);
        //3.把获得的红包金额放入余额
        int money = getLeftMoney();
        super.setLeftMoney(money + delta);
    }
}
