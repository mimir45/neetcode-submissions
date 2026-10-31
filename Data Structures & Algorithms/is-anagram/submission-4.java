class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false ;

        int[] chars = new int[26];

        char[] tChars = t.toCharArray();
        char[] sChars = s.toCharArray();

        for(int i = 0 ; i< sChars.length; i++){
            chars[sChars[i]-'a']++;
            chars[tChars[i]-'a']--;

        }

        for(int i : chars){
            if(i != 0){
                return false;
            }
        }

        return true;

    

    }
}
