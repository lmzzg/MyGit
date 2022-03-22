package javaSE;
//1-99的之和
public class Ex002_NumSum {
    public static void main(String[] args) {
        System.out.println("结果是："+getSum());
    }


    public static int getSum() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
