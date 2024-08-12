class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if((int)c>='0' && (int)c<=57)  ans.append(c);
            if(c>=97 && c<=122) ans.append(c);
            if(c>=65 && c<=90) ans.append((char)(c+32));   //type-casting to character else it take asci value of character in c+32 ;
        }
        return check(ans.toString());

    }
    boolean check(String str){
        // System.out.print(str);
        StringBuilder x=new StringBuilder();
        x.append(str);
        String rev=x.reverse().toString();
        if(str.equals(rev)) return true;
        return false;

    }
}