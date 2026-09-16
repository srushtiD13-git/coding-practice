class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();
        int[] arr = new int[k];

        for (int i = 0; i <= nums.length; i++) {
            list.add(new ArrayList<>());
        }
  

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            list.get(entry.getValue()).add(entry.getKey());
        }

        //System.out.println(list);

        int n = 0;

for (int i = nums.length; i > 0; i--) {

    if (!list.get(i).isEmpty()) {

        for (int j : list.get(i)) {
            arr[n] = j;
            n++;

            if (n == k) {
                break;
            }
        }
    }

    if (n == k) {
        break;
    }
}
        return arr;
        
    }
}