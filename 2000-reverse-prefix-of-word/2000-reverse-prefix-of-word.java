class Solution {
    public String reversePrefix(String word, char ch) {
        String final_res="";
        int index=word.indexOf(ch);
        if(index==-1)
            return word;
        for(int i=index;i>=0;i--){
            final_res+=word.charAt(i);
        }
        for(int j=index+1;j<word.length();j++){
            final_res+=word.charAt(j);
        }
        //System.out.println(final_res);
        return final_res;
    }
}