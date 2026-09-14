class Solution {
    

    public List<List<String>> groupAnagrams(String[] strs) {
        List <List <String>> ans = new ArrayList<>();
        Map<String, List<String>> map= new HashMap<>();

        for(int i=0;i<strs.length;i++)
        {
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String str = new String(charArr);//common key for anagrams
            List<String> list = map.get(str);

            if (list == null) {
                list = new ArrayList<>();
            }

            list.add(strs[i]);
            map.put(str, list);
            
            
        }
        
        for(Map.Entry<String, List<String>> entry : map.entrySet())
        {
            ans.add(entry.getValue());
        }
    

        printMap(map);


        return ans;
    }

    public static void printMap(Map<String, List<String>> map) {
    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
        System.out.println("Key: " + entry.getKey());
        System.out.println("Values: " + entry.getValue());
    }
}

    
}