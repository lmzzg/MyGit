package javaSE.demo02_api;

import java.util.ArrayList;//可变长数组

/*定义指定格式打印集合的方法（arraylist类型作为参数），
使用{}扩起集合，使用@分隔每个元素。
格式：{@元素@元素@元素}
常用方法：add（）--添加元素，remove（）--删除指定位置的元素，get（）--获取指定位置的元素，size（）---返回集合元素数量
*/
public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();//<>数据类型只能是泛型（引用类型的数据），不能是基本数据类型。
        list.add("Kiana");
        list.add("Mei");
        list.add("Bronya");
        list.add("FuHua");
        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (i!= list.size()-1 ){
                System.out.print(s + "@");
            }
            else System.out.print(s + "}");

        }
    }
}
