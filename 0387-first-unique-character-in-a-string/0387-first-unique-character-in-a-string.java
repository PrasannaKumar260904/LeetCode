class Pair {
    int index, freq;
    Pair(int index, int freq) {
        this.index = index;
        this.freq = freq;

    }
}

class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Pair> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(!map.containsKey(c)) {
                map.put(c, new Pair(i, 1));
            }

            else {
                Pair p = map.get(c);
                int cFreq = p.freq;
                map.put(c, new Pair(i, cFreq + 1));
            }
        }

        int res = s.length();
        for(Map.Entry<Character, Pair> entry :
        map.entrySet()) {
            
            if(entry.getValue().freq == 1) {
                int currentIndex = entry.getValue().index;
                res = Math.min(res, currentIndex);
            }

        }

        return (res == s.length()) ? -1 : res;
    }
}