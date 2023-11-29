class Solution {
    public String restoreString(String s, int[] indices) {
        String str="";
        Map<Integer,Character> hsmap=new HashMap<>();
        for(int i =0;i<s.length();i++){
            hsmap.put(indices[i],s.charAt(i));
        }
        for( Character c : hsmap.values() ){
            str=str+c;
        }
        //hsmap.forEach((k,v) -> System.out.println(k+" "+v));
        return str;
        
    }
}