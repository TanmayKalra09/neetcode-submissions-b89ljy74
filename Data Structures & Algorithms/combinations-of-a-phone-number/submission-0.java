class Solution {
    public List<String> letterCombinations(String digits) {
         List<String> list = new ArrayList<>();
        if(digits.isEmpty()){
            return list;
        }
        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        StringBuilder ans = new StringBuilder();
        backtrack(digits,list,0,ans,map);
        return list;

    }
    private void backtrack(String digits, List<String> list,
    int index,StringBuilder ans,HashMap<Character,String> map){

    if(index==digits.length()){
        list.add(ans.toString());
        return;
    }

    String l = map.get(digits.charAt(index));
    for(char c : l.toCharArray()){
        ans.append(c);
        backtrack(digits,list,index+1,ans,map);
        ans.deleteCharAt(ans.length()-1);
    }
    }
}
