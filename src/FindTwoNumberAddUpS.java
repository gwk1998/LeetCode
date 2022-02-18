import java.util.ArrayList;
import java.util.Arrays;

/**
 *在有序数组中找出两个数，使得和为给定的数 S。如果有多对数字的和等于 S，输出两个数的乘积最小的。
 * tip：有序数组,在和固定的前提下，两数越往中间乘积越大
 */
public class FindTwoNumberAddUpS {



    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,4};
        System.out.println(FindNumbersWithSum(nums,4).toString());
    }

    /**
     * 有序数组为固定条件，无法摆脱
     */
    public static ArrayList<Integer> FindNumbersWithSum(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int cur = nums[i] + nums[j];
            if (cur == target)
                return new ArrayList<>(Arrays.asList(nums[i], nums[j]));
            //当两数和乘积小于目标值target,指针i向右移动
            //大于目标值target时，指针j向左移动
            if (cur < target)
                i++;
            else
                j--;
        }
        return new ArrayList<>();
    }

    /**
     * 1、初始化： 双指针 i , j 分别指向数组 array 的左右两端 （俗称对撞双指针）。
     * 2、循环搜索： 当双指针相遇时跳出；
     * 计算和 s = array[i] + array[j] ；
     * 若 s > sum ，则指针 j 向左移动，即执行 j = j - 1 ；
     * 若 s < sum ，则指针 i 向右移动，即执行 i = i + 1 ；
     * 若 s = sum，立即返回数组 [array[i], array[j]] ；
     * 3、返回空数组，代表无和为 sum 的数字组合
     */
//        public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
//            ArrayList<Integer> res = new ArrayList<>();
//            int i = 0, j = array.length - 1;
//            while (i < j) {
//                int s = array[i] + array[j];
//                if (s < sum)
//                    i++;
//                else if (s > sum)
//                    j--;
//                else {
//                    res.add(array[i]);
//                    res.add(array[j]);
//                    return res;
//                }
//            }
//            return res;
//        }

}
