class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int ans=n;
        long val=0;
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            sum-=nums[i];
            if(sum>nums[i]) return (sum+nums[i]);
            else{
                ans--;
                if(ans<3) break;
            }
        }

        return -1;
    }
}