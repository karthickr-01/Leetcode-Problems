class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int leftsum[]=new int[nums.length];
        leftsum[0]=0;
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            leftsum[i]=sum;
            sum+=nums[i];
        }
        
        int rightsum[]=new int[nums.length];
        rightsum[nums.length-1]=0;
        int sum1=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            rightsum[i]=sum1;
            sum1+=nums[i];
        }
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(rightsum[i]-leftsum[i]);
        }
        return ans;
    }
}
