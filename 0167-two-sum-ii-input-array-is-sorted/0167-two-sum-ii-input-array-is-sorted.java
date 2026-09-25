class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int[] arr = new int[2];

        while(i<j){
            int res=numbers[i]+numbers[j];

            if(res>target){j--;}
            else if(res<target){i++;}
            else if(res==target){break;}
        }
        arr[0]=i+1;
        arr[1]=j+1;

        return arr;
        
    }
}