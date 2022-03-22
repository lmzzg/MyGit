package algorithm.leetcode.ex;
//斐波那契数列 0,1,1,2,3,5,8..... 求第n位数
public class Fib {
    public static int iterate(int n){//有序数列,用双指针迭代很方便.
        if(n == 1)return 0;
        if(n == 2)return 1;
        int low = 0, high = 1;
        for( int i=3;i<=n;i++){
            int sum = low +high;
            low = high;
            high = sum;
        }
        return high;
    }

    public static void main(String[] args) {
        System.out.println(iterate(10));
    }
}
