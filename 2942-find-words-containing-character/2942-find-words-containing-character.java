class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        //String s = x;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if((words[i].indexOf(x))>=0){
                list.add(i);
            }
        }
        return list;
    }
}