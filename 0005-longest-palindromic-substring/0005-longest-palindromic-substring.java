class Solution {
    public String longestPalindrome(String s) {
        Map<Integer, String> map = new HashMap<>();
        if(s.length() ==1){return s;}
        if(s.length()==2 && s.charAt(0)!= s.charAt(1)){return s.substring(0,1);}
        if(s.length()==2 && s.charAt(0)!= s.charAt(1)){return s;}
        for(int i=0;i<s.length();i++)
        {
            int j=s.length()-1;
            while(i<j){
                if(s.charAt(i)==s.charAt(j) && isPalindrome(s.substring(i,j+1))){
                    map.put(j-i+1, s.substring(i,j+1));
                    //i=j-1;
                    break;
                }
                j--;
            }
        }

        System.out.println(map);

        int longKey = 0;

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > longKey) {
                longKey = entry.getKey();
            }
        }

        if(map.isEmpty()){return s.substring(0,1);}

        return map.get(longKey);
        
    }

    public boolean isPalindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(j>i){
            if(s.charAt(j)!=s.charAt(i)){return false;}
            i++;
            j--;
        }
        return true;
    }
}