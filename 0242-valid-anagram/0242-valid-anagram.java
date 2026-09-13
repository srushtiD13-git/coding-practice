class Solution {
    public boolean isAnagram(String s, String t) {
      Map<Character, Integer> Smap = new HashMap<>();
      Map<Character, Integer> Tmap = new HashMap<>();

    //   char[] sArr = s.toCharArray();
    //   char[] tArr = t.toCharArray();

      if(s.length() != t.length())
      {
        return false;
      }

      for(int i=0;i<s.length();i++)
      {
        Smap.put(s.charAt(i), Smap.getOrDefault(s.charAt(i), 0)+1);
        Tmap.put(t.charAt(i), Tmap.getOrDefault(t.charAt(i), 0)+1);
      }

      if( !Smap.equals(Tmap))
      {
        return false;
      }


      //System.out.println(s[0]);

      return true;  
    }
}