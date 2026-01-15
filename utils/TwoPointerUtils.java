package utils;

import java.util.Arrays;

/**
 * Utility class for two-pointer pattern in sorted arrays.
 * Eliminates duplicated two-pointer search logic.
 */
public class TwoPointerUtils {
    
    /**
     * Skip duplicate elements moving forward
     * @param nums Sorted array
     * @param index Current index
     * @return Next index where nums[index] != nums[return_value]
     */
    public static int skipDuplicatesForward(int[] nums, int index) {
        while (index < nums.length - 1 && nums[index] == nums[index + 1]) {
            index++;
        }
        return index;
    }
    
    /**
     * Skip duplicate elements moving backward
     * @param nums Sorted array
     * @param index Current index
     * @return Previous index where nums[index] != nums[return_value]
     */
    public static int skipDuplicatesBackward(int[] nums, int index) {
        while (index > 0 && nums[index] == nums[index - 1]) {
            index--;
        }
        return index;
    }
    
    /**
     * Initialize two pointers for sorted array search
     * @param startAfter Index to start left pointer after
     * @param endAt Index to end right pointer at
     * @return Array [left, right] with initialized pointers
     */
    public static int[] initPointers(int startAfter, int endAt) {
        return new int[]{startAfter + 1, endAt};
    }
}
