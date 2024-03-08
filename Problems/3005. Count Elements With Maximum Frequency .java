class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int maxfrequncy=0;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            maxfrequncy=Math.max(maxfrequncy,map.getOrDefault(nums[i],0));

        }
        int elementcount=0;
        for(Integer x:map.keySet()){
            if(map.get(x)==maxfrequncy){
                elementcount+=map.get(x);
            }
        }
        return elementcount;

    }
}