class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet num = new HashSet<>();
        for(int i=0; i<nums.length;i++)
            num.add(nums[i]);
        if(num.size()!=nums.length)
            return true;
        else
            return false;
    }
}
