# Utility Classes for LeetCode Solutions

This package contains reusable utility classes that eliminate common code duplication across multiple LeetCode solutions.

## Classes

### FrequencyMap<K>
A wrapper around HashMap<K, Integer> that simplifies frequency counting operations.

**Common Use Cases:**
- Character frequency counting in strings
- Element frequency tracking in arrays
- Sliding window problems with frequency requirements

**Key Methods:**
- `increment(K key)` - Increment frequency by 1
- `decrement(K key)` - Decrement frequency by 1
- `get(K key)` - Get frequency (returns 0 if not present)
- `containsKey(K key)` - Check if key exists
- `size()` - Get number of unique keys

**Example:**
```java
FrequencyMap<Character> freq = new FrequencyMap<>();
freq.increment('a');  // Instead of: hm.put('a', hm.getOrDefault('a', 0) + 1)
freq.decrement('a');  // Instead of: hm.put('a', hm.get('a') - 1)
```

### ArrayUtils
Static utility methods for common array operations.

**Key Methods:**
- `prefixSum(int[] nums)` - Calculate prefix sum array
- `allZero(int[] arr)` - Check if all elements are zero
- `windowLength(int left, int right)` - Calculate window size

**Example:**
```java
int[] pf = ArrayUtils.prefixSum(nums);  // Instead of manual loop
boolean isZero = ArrayUtils.allZero(arr);  // Instead of manual check
```

### TwoPointerUtils
Utility methods for two-pointer pattern in sorted arrays.

**Key Methods:**
- `skipDuplicatesForward(int[] nums, int index)` - Skip duplicates moving right
- `skipDuplicatesBackward(int[] nums, int index)` - Skip duplicates moving left
- `initPointers(int startAfter, int endAt)` - Initialize pointer pair

**Example:**
```java
int left = TwoPointerUtils.skipDuplicatesForward(nums, i);
int[] pointers = TwoPointerUtils.initPointers(i, n - 1);
```

## Benefits

1. **Reduced Code Duplication** - Common patterns are centralized
2. **Improved Readability** - Intent-revealing method names
3. **Easier Maintenance** - Fix bugs in one place
4. **Consistency** - Same pattern used across all solutions

## Usage in Solutions

See refactored versions of problems that use these utilities:
- Problem 1 (Two Sum) - uses FrequencyMap
- Problem 438 (Find All Anagrams) - uses ArrayUtils.allZero
- Problem 560 (Subarray Sum Equals K) - uses ArrayUtils.prefixSum
- Problem 76 (Minimum Window Substring) - uses FrequencyMap
- Problem 424 (Longest Repeating Character Replacement) - uses FrequencyMap
