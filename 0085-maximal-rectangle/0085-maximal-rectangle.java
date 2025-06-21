class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0)return 0;
        int n=matrix.length;
        int m=matrix[0].length;
        int [][] psum=new int [n][m];
        int maxA=0;
        for(int j=0;j<m;j++){
            int sum=0;
            for(int i=0;i<n;i++){
                if(matrix[i][j]=='1'){
                    sum+=1;
                }else{
                    sum=0;
                }
                psum[i][j]=sum;
            }
           
        }
        for(int i=0;i<n;i++){
            maxA=Math.max(maxA,maxRectArea(psum[i]));
        }
            return maxA;
        }
        private int maxRectArea(int [] heights){
            int n=heights.length;
            Stack <Integer> st=new Stack<>();
            int maxA=0;
            for(int i=0;i<=n;i++){
                while(!st.isEmpty()&&(i==n||heights[st.peek()]>=heights[i])){
                    int height=heights[st.pop()];
                    int width;
                    if(st.isEmpty()){
                        width=i;
                    }else{
                        width=i-st.peek()-1;
                    }
                    maxA=Math.max(maxA,height*width);
                }
                st.push(i);

            }
            return maxA;
        }
        
    }
