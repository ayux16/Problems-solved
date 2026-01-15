# LeetCode Problems Solved

This repository contains solutions to various LeetCode problems, primarily implemented in Java.

## Repository Structure

Each problem is organized in its own directory with the following structure:
- `<problem-number>-<problem-name>/`
  - `<problem-name>.java` - Solution implementation
  - `README.md` - Problem description
  - `Notes.md` - Additional notes (where applicable)

## Utility Classes

To eliminate code duplication and improve maintainability, this repository includes reusable utility classes in the `utils/` package:

### FrequencyMap<K>
Simplifies frequency counting operations with HashMap.

**Benefits:**
- Eliminates repeated `getOrDefault(key, 0) + 1` patterns
- Cleaner increment/decrement operations
- Reduces boilerplate code

**Example:**
```java
// Before refactoring
HashMap<Character, Integer> hm = new HashMap<>();
hm.put(ch, hm.getOrDefault(ch, 0) + 1);
hm.put(ch, hm.get(ch) - 1);

// After refactoring  
FrequencyMap<Character> freq = new FrequencyMap<>();
freq.increment(ch);
freq.decrement(ch);
```

**Used in:** Problems 76, 424, 560, 940

### ArrayUtils
Common array manipulation utilities.

**Methods:**
- `prefixSum(int[] nums)` - Calculate prefix sum array
- `allZero(int[] arr)` - Check if all elements are zero
- `windowLength(int left, int right)` - Calculate sliding window size

**Example:**
```java
// Before refactoring
int[] pf = new int[n];
pf[0] = nums[0];
for (int i = 1; i < n; i++) {
    pf[i] = pf[i - 1] + nums[i];
}

// After refactoring
int[] pf = ArrayUtils.prefixSum(nums);
```

**Used in:** Problems 209, 438, 560, 1046, 1321

### TwoPointerUtils
Utilities for two-pointer pattern on sorted arrays.

**Methods:**
- `skipDuplicatesForward()` - Skip duplicate elements moving right
- `skipDuplicatesBackward()` - Skip duplicate elements moving left
- `initPointers()` - Initialize pointer pair

**Applicable to:** Problems 16, 18 (3Sum, 4Sum patterns)

## Refactored Solutions

The following solutions have been refactored to use utility classes:

| Problem | Utilities Used | Duplication Eliminated |
|---------|---------------|------------------------|
| 76 - Minimum Window Substring | FrequencyMap | HashMap operations |
| 209 - Minimum Size Subarray Sum | ArrayUtils.windowLength | Window size calculation |
| 424 - Longest Repeating Character Replacement | FrequencyMap | HashMap operations |
| 438 - Find All Anagrams in a String | ArrayUtils.allZero | Zero check logic |
| 560 - Subarray Sum Equals K | FrequencyMap, ArrayUtils.prefixSum | Prefix sum + HashMap |
| 940 - Fruit Into Baskets | FrequencyMap | HashMap operations |
| 1046 - Max Consecutive Ones III | ArrayUtils.windowLength | Window size calculation |
| 1321 - Get Equal Substrings Within Budget | ArrayUtils.windowLength | Window size calculation |

## Benefits of Refactoring

1. **Reduced Code Duplication** - Common patterns centralized in utilities
2. **Improved Readability** - Intent-revealing method names
3. **Easier Maintenance** - Fix bugs in one place
4. **Consistency** - Same approach used across solutions
5. **Reusability** - Utilities available for new problems

## Compilation

To compile any solution:
```bash
javac -cp . <problem-directory>/<problem-name>.java
```

To compile utility classes:
```bash
javac utils/*.java
```

## Documentation

For detailed documentation on utility classes, see [utils/README.md](utils/README.md).
