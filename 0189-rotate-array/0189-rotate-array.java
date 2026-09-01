class Solution {
    public void rotate(int[] nums, int k) {

        if(nums.length>1)
        {
            k = k % nums.length;
            reverseArray(0,nums.length-1,nums);

        reverseArray(0,k-1,nums);
        reverseArray(k,nums.length-1,nums);
        }
        
    }

    public void reverseArray(int left, int right, int[] nums)
    {
        while(right>left)
        {
            int temp=nums[right];
            nums[right]=nums[left];
            nums[left]=temp;
            right--;
            left++;
        }
    }
        
}