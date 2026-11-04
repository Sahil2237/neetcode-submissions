class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        char[] sourceCh = s.toCharArray();
        char[] targetCh = t.toCharArray();
        Arrays.sort(sourceCh);
        Arrays.sort(targetCh);

        String src = new String(sourceCh);
        String tar = new String(targetCh); 
        
        return src.equals(tar)?true:false;

    }
}
