class Solution {
    public int maxVowels(String s, int k) {
        
        int n = s.length();
        int left = 0, right = 0;
        int count = 0;
        int res = Integer.MIN_VALUE;

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        while(right < k) {
            char c = s.charAt(right);
            if(vowels.contains(c)) count++;
            right++;
        }

        res = count;

        while(right < n) {
            char c = s.charAt(right);

            if(vowels.contains(c)) {
                count += 1;
            }

            char x = s.charAt(left);
            
            if(vowels.contains(x)) {
                count -= 1;
            }

            res = Math.max(res, count);

            left++;
            right++;
        }
        return res;
    }
}