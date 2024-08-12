class Solution {
    public int minimumLength(String s) {
        int n=s.length();
        int l=0,r=s.length()-1;
        if(n==1) return 1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return n;
            else{
                if(l<r-1 && s.charAt(l+1)==s.charAt(l)){
                    l++;
                    n--;
                }
                else if(s.charAt(r)==s.charAt(r-1) && r>l+1){
                    r--;
                    n--;
                }
                else{
                    n=n-2;
                    l++;
                    r--;
                }
            }
        }
        return n;

    }

}