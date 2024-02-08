class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        if(pattern.length()!= words.length){
            return false;
        }
        HashMap<Character,String> hsmap = new HashMap<Character,String>();
        for(int i=0;i< pattern.length();i++){
            if(hsmap.containsKey(pattern.charAt(i))){
                if(hsmap.get(pattern.charAt(i)).equals( words[i]) ){
                    continue;
                }
                else{
                    return false;
                }
            }
            else{
                if(hsmap.containsValue(words[i])){
                    return false;
                }
                hsmap.put(pattern.charAt(i),words[i]);
            }
        }

        return true;
    }
}