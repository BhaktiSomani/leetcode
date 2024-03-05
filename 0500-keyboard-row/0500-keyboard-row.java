class Solution {
    public String[] findWords(String[] words) {
        // String[] res = new String[words.length];
        // int k= 0;

        List<String> values = new ArrayList<String>();

        String s1="qwertyuiopQWERTYUIOP";
        String s2 = "asdfghjklASDFGHJKL";
        String s3 = "zxcvbnmZXCVBNM";
        for(int i=0;i<words.length;i++){
            String s="";
            int row=0;
            String temp = words[i];
            if(s1.contains( String.valueOf(temp.charAt(0)))){
                row = 1;
                s=s1;
            }
            else if(s2.contains( String.valueOf(temp.charAt(0)))){
                row = 2;
                s=s2;
            }
            else{
                row = 3;
                s=s3;
            }
            int flag = 0;
            for(int j = 0;j<temp.length();j++){
                if(s.contains( String.valueOf(temp.charAt(j)))){
                    continue;
                }
                else{
                    flag=1;
                    break;
                }
            }
            
            if(flag==0){
                values.add(temp);
            }
        }
        
        String[] target = values.toArray(new String[values.size()]);
        return target;
        
    }
}