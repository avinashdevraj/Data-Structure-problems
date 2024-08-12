class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        int len=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        System.out.print(map);
        int l=0;
        for(int r=0;r<n;r++){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.get(nums[r])>k){
                map.put(nums[l],map.getOrDefault(nums[l],0)-1);
                l++;
            }
            len=Math.max(len,r-l+1);
        }

        return len;
    }
}