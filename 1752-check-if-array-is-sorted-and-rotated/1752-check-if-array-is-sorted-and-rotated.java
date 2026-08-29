class Solution {
    public boolean check(int[] nums) {
        int x=0;
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]>nums[(i+1)%nums.length])
        {
            x++;
        }
        if(x>1)
        {
            return false;
        }
      }

      

      return true;
    }

    public void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public boolean isSorted(int[] arr)
    {
        for(int l=0;l<arr.length-1;l++)
        {
            if(arr[l]>arr[l+1])
            {return false;}
        }

        return true;
    }
}