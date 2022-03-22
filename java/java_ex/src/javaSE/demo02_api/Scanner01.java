package javaSE.demo02_api;
//1.导包
import java.util.Scanner;
/*
利用scanner类求输入的两个数之和
 */
public class Scanner01 {
    public static void main(String[] args) {
        //2.创建键盘录入数据的对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        //3.接收数据
        int a = sc.nextInt();//将输入信息的下一个标记扫描为一个int值
        System.out.println("请输入第二个数据：");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum:" + sum);
    }
}
