//Runtime 39ms, Memory 38.6MB
public class TwoSumII_167 {
    public int[] twoSum(int[] nums, int target) {
        int[] answers = {-1,-1};
        
        int index1 = 0;
        int index2 = nums.length-1;
        while(answers[0]==-1){
            while(nums[index1] + nums[index2] > target){
                index2--;
            }
            while(nums[index1] + nums[index2] < target){
                index1++;
            }
            if(nums[index1] + nums[index2] == target){
                answers[0] = index1++;
                answers[1] = index2++;
            }
        }
        return answers;
    }
}