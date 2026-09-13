class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();

        for(int i:nums)
        {
            if (hashSet.contains(i))
            {
                return true;
            }

            hashSet.add(i);
        }

        return false;
    }
}