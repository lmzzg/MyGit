package javaSE.demo02_api;
/*
键盘录入三个数据并获取最大值
 */
import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据：");
        int b = sc.nextInt();
        System.out.println("请输入第三个数据：");
        int c = sc.nextInt();

        int temp = (a > b ? a : b);
        int max = (temp > c ?temp : c);
        System.out.println("max:"+ max);

    }
}
