class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> resultList=new ArrayList<Integer>();

        int n=nums1.length,m=nums2.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:nums2){
            if(map.getOrDefault(num,0)>0){
                resultList.add(num);
                map.remove(num);
            }
        }
        int[] ans=new int[resultList.size()];
        for(int i=0;i<resultList.size();i++){
            ans[i]=resultList.get(i);
        }
        return ans;
    }
}