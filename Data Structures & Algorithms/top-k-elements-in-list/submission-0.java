class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] freq = new int[2001];
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i] + 1000] = freq[nums[i] + 1000] + 1;
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            int maxCount = 0;
            int maxIndex = 0;
            for (int j = 0; j < freq.length; j++) {
                if (freq[j] > maxCount) {
                    maxCount = freq[j];
                    maxIndex = j;
                }
            }
            result[i] = maxIndex - 1000;
            freq[maxIndex] = 0;     
        }

        return result;
    }
}