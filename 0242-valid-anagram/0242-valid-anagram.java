class Solution {
    public boolean isAnagram(String s, String t) {
      Map<Character, Integer> Smap = new HashMap<>();
      Map<Character, Integer> Tmap = new HashMap<>();

      char[] sArr = s.toCharArray();
      char[] tArr = t.toCharArray();

      if(sArr.length != tArr.length)
      {
        return false;
      }

      for(int i=0;i<sArr.length;i++)
      {
        Smap.put(sArr[i], Smap.getOrDefault(sArr[i], 0)+1);
        Tmap.put(tArr[i], Tmap.getOrDefault(tArr[i], 0)+1);
      }

      if( !Smap.equals(Tmap))
      {
        return false;
      }


      return true;  
    }
}