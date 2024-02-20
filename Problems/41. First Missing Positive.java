class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            while(nums[i]!=i+1 && nums[i]>0 && nums[i]<=n){
                int val=nums[i];
                if(nums[i]==nums[val-1]) break;
                swap(nums[i],nums[val-1],i,val-1,nums);
            }
        }


        for(int i=0;i<n;i++){
            if(nums[i]!=i+1)
                return i+1;

        }
        return n+1;
    }
    void swap(int a,int b,int i,int j,int[] nums){
        nums[i]=b;
        nums[j]=a;
    }
}
