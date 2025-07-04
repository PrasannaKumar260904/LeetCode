class Solution {
    public void rotate(int[][] matrix) {
        //brute
        /*int n=matrix.length;
       
        int [][] ans=new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[j][n-i-1]=matrix[i][j];
            }
        }
        //copy back to original matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=ans[i][j];
            }
        }
        */
        //optimal 
        int n=matrix.length;
        //transpose
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }

        }
        //reverse each row
        for(int i=0;i<n;i++){
            reverseRow(matrix[i]);
        }

        
    }
    private void reverseRow(int [] row){
        
        int left=0,right=row.length-1;
        while(left<right){
            int temp=row[left];
            row[left]=row[right];
            row[right]=temp;
            left++;
            right--;
        }



    }
}