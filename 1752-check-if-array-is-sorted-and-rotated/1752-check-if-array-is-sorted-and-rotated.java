class Solution {
    public boolean check(int[] nums) {
      int[] original = new int[nums.length];
        if(isSorted(nums))
        {
            return true;
        }
        else{
            for(int x=1;x<nums.length;x++){
                for(int i=0;i<nums.length;i++)
                {
                    original[(i+x)%nums.length] = nums[i];
                }
                System.out.println("Array rotated by "+x);
                printArr(original);

                if(isSorted(original))
                {
                    return true;
                }
            }
        }

      return false;
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