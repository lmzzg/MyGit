package algorithm.leetcode.ex;

//从整型数组中找出三个乘积起来最大的数,并输出这个最大值

import java.util.Arrays;

public class MaxProduct {
    //1.普通排序算法,复杂度O(n)
    public static int sort(int nums[]){
        Arrays.sort(nums);
        int n=nums.length;
        return Math.max(nums[0]*nums[1]*nums[n-1],nums[n-1]*nums[n-2]*nums[n-3]);//考虑到存在负数的情况
    }

    //2.线性扫描,复杂度O(logn) 类似于准备3个装大数容器和2个装小数的容器,两种容器同时进行条件判断往里装数.
    public static int getMaxMin(int nums[]){
        int min1 = Integer.MAX_VALUE,min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE,max2 = Integer.MIN_VALUE,max3 = Integer.MIN_VALUE;
        for(int x : nums){
            if(x < min1){
                min2 = min1;
                min1 = x;
            }else if(x < min2){
                min2 = x;
            }
            if(x > max1){
                max3 = max2;
                max2 = max1;
                max1 = x;
            }else if(x>max2){
                max3 = max2;
                max2 = x;
            }else if(x>max3){
                max3 = x;
            }
        }
        return Math.max(min1*min2*max1, max1*max2*max3);
    }



    public static void main(String[] args) {
        System.out.println(sort(new int[]{-3,-2,-1,1,2,3}));
        System.out.println(getMaxMin(new int[]{-3,-2,-1,1,2,3}));
    }

}
