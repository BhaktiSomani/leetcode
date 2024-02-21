class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String paragraph1=paragraph.toLowerCase().replaceAll("\\W+"," ");
        String[] arr = paragraph1.split(" ");
        int count = 0 ;
        String result="";
        List<String> slist = Arrays.asList(banned);
           
        for(String s:arr){
            if(slist.contains(s)){
                continue;
            }

            int temp=0;
            for(String s1:arr){
                if(s.equals(s1)){
                    temp++;
                }
            }
            if (temp>count){
                count = temp;
                result=s;
            } 
            System.out.println(s+" "+temp);
        }
        return result;
        
    }
}