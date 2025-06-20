class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&k>0&&st.peek()>num.charAt(i)){
                st.pop();
                k--;
            }
           st.push(num.charAt(i));
        }
         while(!st.isEmpty()&&k>0){
                st.pop();
                k--;
            }
         StringBuilder res=new StringBuilder();
            while(!st.isEmpty()){
                res.append(st.pop());
            }
            res.reverse();
            while(res.length()>0&&res.charAt(0)=='0'){
                res.deleteCharAt(0);
            }
            if(res.length()==0)return "0";
            return res.toString();


        
    }
}