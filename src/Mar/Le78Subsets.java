package Mar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Le78Subsets {
    public List<List<Integer>> subsets(int[] nums){

        List<List<Integer>> res = new ArrayList<>();
        if(nums==null)
            return res;
        if(nums.length==0){
            res.add(new ArrayList<Integer>());
            return res;
        }
        Arrays.sort(nums);
        dfs(nums, 0, new ArrayList<Integer>(), res);
        return res;
    }
    public void dfs(int[] nums, int index, List<Integer> tmp, List<List<Integer>> res){
        res.add(new ArrayList<Integer>(tmp));

        for(int i=index; i<nums.length;i++){
            tmp.add(nums[i]);
            dfs(nums, i+1, tmp, res);
            tmp.remove(tmp.size()-1);
        }
    }

}
