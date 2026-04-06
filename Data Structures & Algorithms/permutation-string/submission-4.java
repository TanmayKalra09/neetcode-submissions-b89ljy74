class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] a = s1.toCharArray();
        Arrays.sort(a);
        String sa = new String(a);
        if(s1.length()>s2.length()){
            return false;
        }

        for(int i=0;i<=s2.length()-s1.length();i++){
                char[] b = s2.substring(i,i+s1.length()).toCharArray();
                Arrays.sort(b);
                String sb = new String(b);
                if(sa.equals(sb)){
                    return true;
                }
            }
        
        return false;
    }
}
