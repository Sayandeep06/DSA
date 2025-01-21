class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String st: strs){
            char[] ch = st.toCharArray();
            Arrays.sort(ch);
            String str = String.valueOf(ch);

            if(map.containsKey(str)){
                map.get(str).add(st);
            }else{
                map.put(str,new ArrayList<>());
                map.get(str).add(st);
            }
       } list.addAll(map.values());
       return list;
    }
}