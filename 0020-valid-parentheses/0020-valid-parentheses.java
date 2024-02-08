class Solution {
    public boolean isValid(String s) {
        if(s.length()==1){
            return false;
        }
        Stack<Character> st = new Stack<Character>();
        int top=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                if(st.size()==0)
                    return false;
                char c = st.pop();
                if(c=='('){
                    continue;
                }
                else{
                    return false;
                }
            }
            else if(s.charAt(i)=='}'){
                if(st.size()==0)
                    return false;
                char c = st.pop();
                if(c=='{'){
                    continue;
                }
                else{
                    return false;
                }
            }
            else if(s.charAt(i)==']'){
                if(st.size()==0)
                    return false;
                char c =st.pop();
                if(c=='['){
                    continue;
                }
                else{
                    return false;
                }
            }
            else{
                st.push(s.charAt(i));
            }

        }
        if(st.size()==0)
            return true;
        return false;
    }
}