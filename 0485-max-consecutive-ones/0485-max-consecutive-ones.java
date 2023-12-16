class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int cout=0,max=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
               cout++;
               if(cout>max){
               max=cout;
               }
            }
            else{
                cout=0;
            }
            
        }
        return max;
    }
}