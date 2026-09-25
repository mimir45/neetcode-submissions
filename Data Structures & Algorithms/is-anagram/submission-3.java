class Solution {
    public boolean isAnagram(String s, String t) {
         if (s.length() != t.length()) { 
        return false;
    }

    char[] sArr = s.toCharArray();
    char[] tArr = t.toCharArray();
   int[] bucket = new int[26];
   for (int i = 0; i < sArr.length; i++) {
       bucket[sArr[i] - 'a']++;
       bucket[tArr[i] - 'a']--;
   }

   for (int i : bucket) {
       if (i != 0) {
           return false;
       }
   }


return  true;

    }
}
