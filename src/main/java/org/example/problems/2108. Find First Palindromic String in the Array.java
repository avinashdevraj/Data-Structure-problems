class Solution {
    public String firstPalindrome(String[] words) {
        int n=words.length;
        for(int i=0;i<n;i++){
            if(checkpal(words[i])) return words[i];
        }
        return "";

    }
    boolean checkpal(String s){
        int l=0,r=s.length()-1;
        while(l>=0 && r<s.length() && l<=r) {
            if(s.charAt(l)!=s.charAt(r))
                return false;
            l++;
            r--;

        }
        return true;
    }
}