class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /*int y=m+n;
        int i=0,j=0,k=0;
        int [] temp=new int [y];
        for(int x=0;x<y;x++){
            temp[x]=nums1[x];
        }
        
        while(i<y&&j<m&&k<n){
            if(temp[j]<=nums2[k]){
                nums1[i]=temp[j];
                j++;
            }
            else{
                nums1[i]=nums2[k];
                k++;
            }
            i++;
        }
        while(j<m&&i<y){
            nums1[i]=temp[j];
            j++;
            i++;
        }
        while(k<n&&i<y){
            nums1[i]=nums2[k];
            k++;
            i++;
        } */
 //from back pointers
  int x1=m+n-1;
  int x2=m-1;
  int x3=n-1;
  while(x1>=0 && x2>=0 && x3>=0){
    if(nums1[x2]>=nums2[x3]){
        nums1[x1]=nums1[x2--];
    }else{
        nums1[x1]=nums2[x3--];
    }
    x1--;
  }
  while(x1>=0&& x3>=0){
    nums1[x1--]=nums2[x3--];
  }
        
        




        
    }
}