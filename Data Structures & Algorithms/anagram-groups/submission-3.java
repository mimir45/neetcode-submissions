class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(String s : strs){
            int[] bucket = new int[26];
            char[] chars = s.toCharArray();
            for(char c: chars){
                bucket[c-'a']++;
            }
            String key = Arrays.toString(bucket);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
            
        }
        return new ArrayList<>(map.values());
        
    }
}
