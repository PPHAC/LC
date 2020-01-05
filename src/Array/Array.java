package Array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (map.containsKey(target - curr)) {
                res[1] = i;
                res[0] = map.get(target - curr);
                return res;
            }
            map.put(curr, i);
        }
        return res;
    }
}

class Solution26 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (num != nums[i]) {
                nums[++i] = num;
            }
        }
        return i + 1;
    }
}

class Solution283 {
    public void moveZeroes(int[] nums) {
        int iter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[iter++] = nums[i];
            }
        }
        for (int i = iter; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}

class Solution169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}

class Solution122 {
    public int maxProfit(int[] prices) {
        int count = 0, buyPrice = 0;
        boolean flag = false;
        for (int i = 0; i < prices.length - 1; ++i) {
            if (prices[i] < prices[i + 1]) {
                if (!flag) {
                    buyPrice = prices[i];
                    flag = true;
                }
            } else {
                if (flag) {
                    count += (prices[i] - buyPrice);
                    buyPrice = 0;
                    flag = false;
                }
            }
        }
        if (flag) {
            count += prices[prices.length - 1] - buyPrice;
        }
        return count;
    }
}

class Solution121 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, max = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Integer.min(min, prices[i]);
            max = Integer.max(max, prices[i] - min);
        }
        return max;
    }
}

class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> result = new ArrayList<Integer>();
        int p1 = 0, p2 = 0;
        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] > nums2[p2]) {
                p2++;
            } else if (nums1[p1] < nums2[p2]) {
                p1++;
            } else {
                result.add(nums1[p1]);
                p1++;
                p2++;
            }
        }
        int size = result.size();
        int temp[] = new int[size];
        for (int i = 0; i < size; i++) {
            temp[i] = result.get(i);
        }
        return temp;
    }
}

class Solution268 {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int sum = length * (length + 1) / 2;
        for (int i = 0; i < length; i++) {
            sum -= nums[i];
        }
        return sum;
    }
}


public class Array {
    public static void main(String[] args) {
        Solution26 solution26 = new Solution26();
        int test1[] = {4, 9, 5};
        int test2[] = {9, 4, 9, 8, 4};
        Solution350 solution350 = new Solution350();
        solution350.intersect(test1, test2);
        int[] nums = {1, 2, 3, 4, 5, 6};
        solution26.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));

    }
}