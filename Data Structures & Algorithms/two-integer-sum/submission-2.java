class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int num = nums[i];
            int remaining = target -num;
            if(map.containsKey(remaining) && map.get(remaining)!=i)
            {
                return new int[]{map.get(remaining),i};

            }
            map.put(num,i);
                
        }
        return null;
        
    }
}
