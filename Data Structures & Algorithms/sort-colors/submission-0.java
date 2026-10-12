class Solution {
public void sortColors(int[] nums) {
int n = nums.length;
    for (int i = 0; i < n - 1; i++) {
        int min = nums[i];
        int minind = i;

        for (int j = i + 1; j < n; j++) {
            if (nums[j] < min) {
                min = nums[j];
                minind = j;
            }
        }

        int temp = nums[i];
        nums[i] = nums[minind];
        nums[minind] = temp;
    }

}

}
