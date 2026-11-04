class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        Map<Character,Integer> map = new HashMap<>();
        char[] charSource = s.toCharArray();
        for(char ch : charSource)
        {
            map.put(ch,map.getOrDefault(ch,0)+1);

        }

        char[] charTarget= t.toCharArray();
        for(char ch : charTarget)
        {
            Integer value = map.get(ch);
            if(value==null)
            {
                return false;
            }
            else if(value==1)
            {
                map.remove(ch);
            }
            else{
                map.put(ch, value-1);
            }
        }

        return map.size()==0? true:false;

    }
}
