public class Solution{
    public void sortColors(int[] nums) {
    int[] count = new int[3];

    for (int num : nums) {
        count[num]++;
    }

    int i = 0;
    for (int color = 0; color < 3; color++) {
        for (int j = 0; j < count[color]; j++) {
            nums[i++] = color;
        }
    }
}

}