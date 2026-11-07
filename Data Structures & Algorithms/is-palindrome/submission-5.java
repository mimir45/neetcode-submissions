class Solution {
    public boolean isPalindrome(String s) {
    String normalizedInput = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int l = 0;
        int r = normalizedInput.length()-1;
        while(l<=r){
            if(normalizedInput.charAt(l)!= normalizedInput.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
