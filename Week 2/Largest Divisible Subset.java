class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        if (nums.length == 0) return result;

        Arrays.sort(nums); // step 1
        int[] count = new int[nums.length];
        Arrays.fill(count, 1); // individual element is subset of length 1

        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] % nums[j] == 0) {
                    count[i] = Math.max(count[i], count[j] + 1); // step 2 for each element in nums, find the length of largest subset it has.
                }
            }
        }

        
        int maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            maxIndex = count[i] > count[maxIndex] ? i : maxIndex; // step 3 pick the index of the largest element in count.
        }

        int temp = nums[maxIndex];
        int currentCount = count[maxIndex];
        for (int i = maxIndex; i >= 0; i--) {
            if (temp % nums[i] == 0 && count[i] == currentCount) {
                result.add(nums[i]); // step 4 from nums[maxIndex] to 0, add every element belongs to the largest subset.
                temp = nums[i];
                currentCount--;
            }
        }
        return result;
        
    }
}