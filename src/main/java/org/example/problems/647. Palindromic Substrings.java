class Solution {
    int count;
    public int countSubstrings(String s) {
        int n=s.length();
        count=0;
        for(int i=0;i<n;i++){
            int evencount=checkpal(s,i,i+1);

            int oddcount=checkpal(s,i-1,i+1);
            count=count+evencount+oddcount+1;
        }
        return count;

    }
    int checkpal(String s,int i,int j){
        int count=0;
        while(i>=0 && j<s.length() && s.charAt(i--)==s.charAt(j++)){
            count++;
        }
        return count;
    }

}