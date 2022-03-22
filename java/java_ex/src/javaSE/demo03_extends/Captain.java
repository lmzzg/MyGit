package javaSE.demo03_extends;


import java.util.ArrayList;

public class Captain extends User{
    public Captain(){}
    //通过super调用父类构造方法
    public Captain(String username,int leftMoney){
        super(username,leftMoney);
    }
    //舰长发红包方法：返回值是由多个红包构成的集合arrayList,参数是舰长拿出的钱和红包个数

    public ArrayList<Integer> send(int money, int count){
        //1.创建一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();
        //2.获取舰长余额，判拿出的钱是否超额，超额则提醒余额不足
        int leftMoney = super.getLeftMoney();
        if (money>leftMoney) System.out.println("余额不足");
        //3.扣钱，重新设置余额
        super.setLeftMoney(leftMoney-money);

        //4.计算每个红包的数额：红包需要平均拆分成为count份，除不开的零头包在最后一个红包中
        int avg = money / count;
        int mod = money % count;
        //5.把红包一个一个放到红包集合中,前（count-1）个一致，最后一个带零头
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }
        int last = avg + mod;
        redList.add(last);
        //6.返回红包集合
        return redList;

    }

}


