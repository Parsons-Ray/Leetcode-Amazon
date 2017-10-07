class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0)
            return 0;
        HashSet<Character> set = new HashSet<Character>();
        int left = 0, right = 1;
        int result = 1;
        set.add(s.charAt(left));
        while(left < s.length() && right < s.length()) {
            if(!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
            }else {
                result = Math.max(result, right - left);
                while(s.charAt(left) != s.charAt(right)) {
                    set.remove(s.charAt(left));
                    left++;
                }
                left++;
                right++;
            }
        }
        result = Math.max(result, right - left);
        return result;
    }
}
