class Solution {
    int maxLen=0;
    int start=0;
    int end=0;
    public String longestPalindrome(String s) {
        for(int st=0;st<s.length();st++){
            for(int e=st;e<s.length();e++){
                if(check(s,st,e)){
                    if(e-st+1>maxLen){
                        maxLen=e-st+1;
                        start=st;
                        end=e;
                    }
                }
            }
        }
        return s.substring(start,end+1);
    }
    public boolean check(String s,int i,int j){
        while(i<j){
            char a = s.charAt(i);
            char b = s.charAt(j);
            if(a!=b){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
