package algorithm.leetcode.ex;
//求某个正整数的平方根,只要整数部分(二分查找)
public class SqrtX {
    public static int binarySearch(int x){
        int index = -1, l = 0, r = x;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(mid*mid<=x){
                index = mid;
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return index;
    }


    public static void main(String[] args) {
        System.out.println(binarySearch(25));
    }
}
