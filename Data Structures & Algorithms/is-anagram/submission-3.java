class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        int[] src = new int[26];
        for(char ch : s.toCharArray())
        {
            src[ch-'a']++;
        }

        for(char ch : t.toCharArray())
        {
            src[ch-'a']--;
        }

        for(int i : src)
        {
            if(i!=0)
            {
               return false;
            }
        }
        return true;

    }
}
