class Solution {
    public void setZeroes(int[][] matrix) {
        //Brute
       /* int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                setrowmatrix(matrix,m,i);
                setcolummatrix(matrix,n,j);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
        


        
    }
    public static void setrowmatrix(int [][]matrix,int m ,int i){
        for(int j=0;j<m;j++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-1;
            }
        }
    }
    public static void setcolummatrix(int [][]matrix,int n,int j){
        for(int i=0;i<n;i++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-1;
            }
       }*/ 
       //Better(using two extra arrays)
      /* int n=matrix.length;
       int m=matrix[0].length;
       int [] row=new int [n];
       int [] col=new int [m];
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(matrix[i][j]==0){
                row[i]=1;
                col[j]=1;
            }
        }
       }
        for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(row[i]==1||col[j]==1){
                matrix[i][j]=0;
            }
        }
       }*///optimal
       //int [] row=new int [n];==matrix[..][0]
      // int [] col=new int [m];==matrix[0][..]
      int col0=1;
      int n=matrix.length;
      int m=matrix[0].length;

      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(matrix[i][j]==0){
                matrix[i][0]=0;
                if(j!=0){
                    matrix[0][j]=0;
                }else{
                    col0=0;
                }
            }
        }
      }

      for(int i=1;i<n;i++){
        for(int j=1;j<m;j++){
            if(matrix[i][j]!=0){
                if(matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                }
               
            }
        }
      }
      if(matrix[0][0]==0){
        for(int j=1;j<m;j++){
            matrix[0][j]=0;
        }
      }
      if(col0==0){
        for(int i=0;i<n;i++){
            matrix[i][0]=0;
        }
      }
       
    }
}