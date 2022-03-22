package algorithm.leetcode.ex;
//求n以内的素数个数

public class SuShu {
    //1.暴力解法
    public static int bf(int n){
        int count = 0;
        for(int i=2;i<n;i++){
            count += isPrime(i)?1:0;
        }
        return count;
    }

    private static boolean isPrime(int x){
        for(int i=2;i<x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }

    //2.埃氏筛法
    public static int eratosthenes(int n){
        boolean[] isPrime = new boolean[n];//初始化全部为0,用0代表素数
        int count=0;
        for(int i=2;i<n;i++){
            if(!isPrime[i]){
                count++;
                for(int j = 2 *i; j<n;j+=i){//例如i为2时,把4,6都置为true了
                    isPrime[j] = true;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(bf(20));
        System.out.println(eratosthenes(20));
    }


}
