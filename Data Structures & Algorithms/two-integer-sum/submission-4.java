class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] A = new int[nums.length][2];
        for(int i=0;i<nums.length;i++)
        {
            A[i][0] = nums[i];
            A[i][1] = i;
        }

        Arrays.sort(A, Comparator.comparingInt(a-> a[0]));
        int first=0;
        int last = nums.length-1;
        while(first<last)
        {
            if(A[first][0]+ A[last][0]==target)
            {
               return new int[]{Math.min(A[first][1],A[last][1]),
               Math.max(A[first][1],A[last][1])};
            }
            else if(A[first][0]+ A[last][0]>target)
            {
                last--;
            }
            else{
                first++;
            }
            
        }

        
        return null;
        
    }
}
