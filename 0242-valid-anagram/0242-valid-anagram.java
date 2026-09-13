class Solution {
    public boolean isAnagram(String s, String t) {
      Map<Character, Integer> map = new HashMap<>();
      Map<Character, Integer> Tmap = new HashMap<>();

    //   char[] sArr = s.toCharArray();
    //   char[] tArr = t.toCharArray();

      if(s.length() != t.length())
      {
        return false;
      }

      for(int i=0;i<s.length();i++)
      {
        map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)-1);
      }

    for (int value : map.values()) {
    if (value != 0) {
        return false;
    }
}


      //System.out.println(s[0]);

      return true;  
    }
}