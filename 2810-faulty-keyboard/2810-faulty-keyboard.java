class Solution {
    public String finalString(String s) {
        String final_str="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='i'){
                final_str+=s.charAt(i);
        }
        else{   

                String reverse="";
                for (int j = 0; j < final_str.length(); j++) {
                reverse = final_str.charAt(j) + reverse;
                }
                final_str=reverse;
            }
        }
        return final_str;
    }
}