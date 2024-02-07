class Solution {
    public String longestCommonPrefix(String[] strs) {
    int total = strs.length;
    int k = strs[0].length();
    String prefix="";
     if(total==0){
        return prefix;
    }
     if(total==1){
        return strs[0];
    }
    int j = 0;
    String temp="";
    int flag=0;
    while(j<=k){
        for(int i=0;i<total-1;i++){
            if(strs[i].length()==0){
                return "";
            }
            if(j>=strs[i].length() || j>=strs[i+1].length() ){
                return prefix;
            }

            if(strs[i].charAt(j) == strs[i+1].charAt(j)){
                flag=0;
            }
            else{
                flag=1;
                break;
            }
        }
        if(flag==0){
            prefix+=strs[0].charAt(j);
            j++;
        }
        else{
            break;
        }
    }
       return prefix;
    }
}