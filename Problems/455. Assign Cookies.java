class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=g.length;
        int m=s.length;
        int count=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        while(i<n && j<m){
            if(s[j]>=g[i]){
                count++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return count;

    }
}