//Runtime 39ms, Memory 38.6MB
public class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        int[] answers = {-1,-1};
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    answers[0] = i;
                    answers[1] = j;
                    break;
                }
                
            }
            if(answers[0]!=-1){
                break;
            }
        }
        return answers;
    }
}