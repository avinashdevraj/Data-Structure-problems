class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n=s.length();
        int onecount=0;
        int zerocount=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                onecount++;
            }
        }
        zerocount=n-onecount;
        StringBuilder ans=new StringBuilder();
        for(int i=1;i<onecount;i++){
            ans.append("1");
        }
        for(int i=1;i<=zerocount;i++){
            ans.append(0);
        }
        ans.append('1');
        return ans.toString();

    }
}