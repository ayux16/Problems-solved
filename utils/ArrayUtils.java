package utils;

/**
 * Utility class for common array operations.
 * Eliminates duplicated array manipulation patterns.
 */
public class ArrayUtils {
    
    /**
     * Calculate prefix sum array
     * @param nums Input array
     * @return Prefix sum array where pf[i] = sum of nums[0..i]
     */
    public static int[] prefixSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        int n = nums.length;
        int[] pf = new int[n];
        pf[0] = nums[0];
        for (int i = 1; i < n; i++) {
            pf[i] = pf[i - 1] + nums[i];
        }
        return pf;
    }
    
    /**
     * Check if all elements in array are zero
     * @param arr Input array
     * @return true if all elements are 0, false otherwise
     */
    public static boolean allZero(int[] arr) {
        for (int n : arr) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Calculate window length in sliding window problems
     * @param left Left pointer
     * @param right Right pointer
     * @return Window length (right - left + 1)
     */
    public static int windowLength(int left, int right) {
        return right - left + 1;
    }
}
