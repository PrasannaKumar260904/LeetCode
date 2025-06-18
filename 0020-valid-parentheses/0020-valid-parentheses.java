class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char x:s.toCharArray()){
            if(x=='['||x=='{'||x=='('){
                st.push(x);
            }else{
                if(st.isEmpty())return false;
                char c=st.pop();
                if((x==']'&&c=='[')||(x=='}'&&c=='{')||(x==')'&&c=='('))continue;
                else return false;
            }
        }
        return st.isEmpty();
        
    }
}