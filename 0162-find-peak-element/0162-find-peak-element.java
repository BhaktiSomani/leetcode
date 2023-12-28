class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==2){
                if(nums[1]>nums[0]){
                    return 1;
                }
            }
        if(nums.length==1){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            if(i==0){
                if(nums[i]>nums[i+1]){
                    return i;
                }
            }
            else if(i==nums.length-1){
                if(nums[i]>nums[i-1]){
                    return i;
                }
            }
            else{
                if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                    return i;
                }
            }
        }
        // if(nums[(nums.length)-1] > nums[(nums.length)-2] )
        //     return 2;
        return 0;
    }
}