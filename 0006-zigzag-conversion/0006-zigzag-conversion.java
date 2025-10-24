class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1||numRows>=s.length())return s;
        StringBuilder [] strs=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++)strs[i]=new StringBuilder();
        int index=0;
        int step=1;
        

        for(char c:s.toCharArray()){
            strs[index].append(c);
            if(index==0)step=1;
            else if(index==numRows-1)step=-1;
            index+=step;
        }
        StringBuilder res=new StringBuilder();
        for(StringBuilder sb:strs){
            res.append(sb);
        }
        return res.toString();
        
    }
}