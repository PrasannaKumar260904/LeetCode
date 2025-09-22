class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int x:arr){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        ArrayList<Integer> ls=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            ls.add(e.getValue());

        }
        if(ls.size()==1)return true;
        for(int i=0;i<ls.size();i++){
            for(int j=i+1;j<ls.size();j++){
                if(ls.get(i).equals(ls.get(j))){
                    return false;
                }
            }
        }
        return true;
        
    }
}