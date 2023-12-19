class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[nums.length];
        int i=0,j=n;
        int k=0;
        while(i!=n){
            //System.out.println(nums[i]+" "+nums[j]);
            res[k]=nums[i];
            res[k+1]=nums[j];
            i++;
            j++;
            k++;
            k++;
        }
        return res;
    }
}