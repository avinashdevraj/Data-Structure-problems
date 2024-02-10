class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> ans=new ArrayList<Integer>();
        int n=nums.length;
        if(n==0) return ans;
        Arrays.sort(nums);
        int[] dp=new int[n];
        int[] index=new int[n];
        int maxi=0;
        Arrays.fill(dp,1);
        Arrays.fill(index,-1);
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0 && dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                    index[i]=j;
                    if(dp[i]>dp[maxi]) maxi=i;
                }

            }
        }
        while(maxi>=0){
            ans.add(nums[maxi]);
            maxi=index[maxi];
        }


        //     for(int x:dp)
        // System.out.print(x+" ");
        Collections.reverse(ans);
        return ans;
    }
}