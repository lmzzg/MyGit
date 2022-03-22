package algorithm.leetcode.ex;
//删除数组内重复的元素,输出删除后的数组的元素个数(采用双指针算法)
public class SortedArrayDuplicates {
    public static int removeDuplicates(int[] nums){
        if(nums.length==0){
            return 0;
        }
        int i = 0;//慢指针i
        for (int j = 1; j < nums.length; j++) {//快指针j
            if(nums[j]!= nums[i]){
                i++;
                nums[i] = nums[j];//保证慢指针之前都是不重复的元素
            }

        }
        return i+1;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{2,3,2}));
    }

}
