class Solution {
    public int lengthOfLongestSubstring(String s) {
       Map<Character, Integer> mp = new HashMap<Character, Integer>();
       int n=s.length();
       int left=0,right=0,len=0;
       while(right<n) {
           if(mp.containsKey(s.charAt(right)))
                left=Math.max(mp.get(s.charAt(right))+1, left);
            mp.put(s.charAt(right), right);
            len = Math.max(right-left+1, len);
            right++;
       }
       return len;
    }
}
