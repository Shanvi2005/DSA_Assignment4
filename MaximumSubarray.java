class Solution {
    public int maxSubArray(int[] nums) {
       
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        { 
            sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum=sum+nums[j];
                max=Math.max(sum,max);
            }
        }
        return max;
    }}
