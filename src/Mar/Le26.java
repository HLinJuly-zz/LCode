package Mar;

public class Le26 {
    public int removeDuplicates(int[] nums){
        if(nums==null||nums.length==0)
            return 0;
        int index = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[index]!=nums[i]){
                index++;
                nums[index]=nums[i];
            }
        }
        return index;
    }
}
