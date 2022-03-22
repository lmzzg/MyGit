package algorithm.leetcode.ex;
//返回数组的中心下标,中心下标满足其左右两边元素之和相等
import java.util.Arrays;

public class ArrayCenterIndex {
    public static int pivotIndex(int[] nums){//迭代
        int sum = Arrays.stream(nums).sum();
        int total = 0;//左边按顺序累加和
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            if(total == sum){
                return i;
            }
            sum = sum - nums[i];//用总和减去左边数的形式表示右边累加和
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,2,3,4,1,2,3}));
    }
}
