package algorithm.leetcode.ex;
//排列硬币,第n行放n个,输出m个硬币可以排多少行.
public class ArrangeCoins {
    public static int arrangeCoins(int m){
        for (int i = 1; i <= m; i++) {
            m = m - i;
            if(m <= i){
                return i;
            }
            }
        return 0;
        }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(15));
    }

}
