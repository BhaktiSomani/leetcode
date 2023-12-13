class Solution {
    public String replaceDigits(String s) {
        String result="";
        for(int i=0;i<s.length();i++){
           if(i%2==0){
               result=result+s.charAt(i);
               continue;
            }
            int ch=s.charAt(i-1);
            char c= s.charAt(i);
            int num = Character.getNumericValue(c);
            //System.out.println(ch+num);
            char c1= (char)(ch+num);
            result= result+ c1;
            }
        return result;
    }
}