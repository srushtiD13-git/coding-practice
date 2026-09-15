class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[k];
        int arrCount=0;
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(int i=0;i<k;i++)
        {
            int maxFreq = 0;
            int maxNum = 0;
           for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                
                if(entry.getValue() > maxFreq){maxFreq=entry.getValue();
                maxNum = entry.getKey();}

           }

           map.remove(maxNum);
           arr[arrCount] = maxNum;
           arrCount++;
        }

        return arr;
    }
}