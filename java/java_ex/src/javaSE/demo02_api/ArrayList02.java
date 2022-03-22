package javaSE.demo02_api;
import java.util.ArrayList;
import java.util.Random;

/*
从一个由20个随机数组成的集合里找出所有偶数元素
 */
public class ArrayList02 {
    public static void main(String[] args) {
        //1.生成随机数集合
        //创建Random类对象
        Random random = new Random();
        //创建arrayList集合类对象
        ArrayList<Integer> bigLsit = new ArrayList<>();
        //利用Random类对象中的成员方法产生20个随机数，并用add（）方法把每个数放入bigList中。
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(100) + 1;
            bigLsit.add(num);

        }
//        System.out.println(bigLsit);
        //2.从集合中挑选偶数
        //创建一个小集合来接收挑选的偶数
        ArrayList<Integer> smallList = new ArrayList<>();
        //遍历大集合中的元素找出其中的偶数
        for (int i = 0; i < bigLsit.size(); i++) {
            Integer evenNum = bigLsit.get(i);
            if  (evenNum % 2 == 0){
                smallList.add(evenNum);//注意此处num的类型为Integer，由于数据是从arrayList中获取的。
            }
        }
        //输出所需集合
        System.out.println(smallList);
    }
}
