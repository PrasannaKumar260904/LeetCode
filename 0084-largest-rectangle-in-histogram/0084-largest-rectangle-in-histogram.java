class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> st=new Stack<>();
        int maxA=0;
        for(int i=0;i<=n;i++){
        while(!st.isEmpty() &&(i==n||heights[st.peek()]>=heights[i]))
{
    int height=heights[st.peek()];
    st.pop();
    int width;
    int Area;
    if(st.isEmpty()){
        width=i;
    }else{
        width=i-st.peek()-1;
    }
    Area=height*width;
    maxA=Math.max(maxA,Area);

}
st.push(i);
        }
        return maxA;

        
    }
}