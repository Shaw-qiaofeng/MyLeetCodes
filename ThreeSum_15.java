import java.util.List;

public class ThreeSum_15{
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        //Pretreat the list;
        int beginNum = 0;
        int endNum = nums.length-1;
            //Delete all the too-big number;
        for(int k = 2; k < nums.length; k++){
            if(nums[0] + nums[1] + nums[k] > 0){
                endNum = k - 1;
                break;
            }
        }
            //Delete all the too-small number;
        for(int i = nums.length-3; i >= 0; i--){
            if(nums[i] + nums[nums.length-2] + nums[nums.length-1] < 0){
                beginNum = i + 1;
                break;
            }
        }
            //The main process;
        for(int i = beginNum; i < nums.length-2; i++){
            if(nums[i] > 0){
                break;
            }
            if(i > 0){
                if(nums[i]==nums[i-1]){
                    continue;
                } 
            }
            for(int j = i+1; j < nums.length-1; j++){
                if(j > 0){
                    if(nums[j]==nums[j-1]&&j>i+1){
                        continue;
                    }
                }
                for(int k = endNum; k > j; k--){
                        if(nums[k] < 0){
                            break;
                        }
                        if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[k]);
                        if(list.size()==0){
                            list.add(tmp);
                            break;
                        }
                        else if(!list.get(list.size()-1).equals(tmp)){
                            list.add(tmp);
                            break;
                        }
                    }
                }
            }
        }
    return list;
    }
}