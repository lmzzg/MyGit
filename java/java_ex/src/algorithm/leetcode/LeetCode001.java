package algorithm.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*1.两数之和(无序数组)
        输入：nums = [2,7,11,15], target = 9
        输出：[0,1]
        解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
*/
public class LeetCode001 {
    //1.暴力破解-----时间复杂度O(n2)
    public static int[] solution(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j]==target){
                    return new int[]{i,j};
            }
        }

        }
        return new int[0];
    }

    //2.调用map接口,用hashmap实现.---时间复杂度O(n),空间复杂度O(n)
    public static int[] solution1(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]), i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }

    //3.当数组为有序数组时,可采用二分法或是双指针
    //二分查找
    public static int[] twoSearch(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            int low = i, high = nums.length - 1;
            while(low<=high){
                int mid = (high - low)/2 +low;
                if (nums[mid] == target - nums[i]) {
                    return new int[]{i,mid};
                }else if(nums[mid]>target - nums[i]){
                    high = mid -1;
                }else{
                    low = mid +1;
                }
            }
        }
        return new int[0];
    }

    //双指针算法,比二分强.
    public static int[] twoPointer(int[] nums, int target){
        int low = 0, high = nums.length-1;
        while(low<high){
            int sum = nums[low] + nums[high];
            if(sum == target){
                return new int[]{low,high};
            }
            else if(sum<target){
                low++;
            }else{
                high--;
            }
        }
        return new int[0];
    }


        public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(solution(nums, 9)));
        System.out.println(Arrays.toString(solution1(nums, 9)));
        System.out.println(Arrays.toString(twoSearch(nums, 9)));
        System.out.println(Arrays.toString(twoPointer(nums, 9)));
    }
}
