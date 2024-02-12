class Solution {
    public int mostFrequentEven(int[] nums) {
        boolean containEven=false;
        int ans=-1;
        if(nums.length==0) return -1;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int x:nums){
            if(x%2==0){
                containEven=true;
                map.put(x,map.getOrDefault(x,0)+1);
            }
        }
        int max=-999;
        for(int key:map.keySet()){
            if(max==map.get(key)){
                if(key<=ans) ans=key;
            }
            if(map.get(key)>max){
                max=Math.max(max,map.get(key));
                ans=key;
            }
        }
        if(!containEven) return -1;
        return ans;
    }
}

//------------------------------ OR-----------------------------

class Solution {
    public int mostFrequentEven(int[] nums) {
        int n=nums.length;
        int cur=-1,count=0,ans=-1,countmax=0;
        Arrays.sort(nums);
        for(int x:nums){

            if((x&1)==0){
                if(cur==x){
                    count++;
                }
                else if(count>countmax){
                    countmax=count;
                    ans=cur;
                    cur=x;
                    count=1;
                }
                else{
                    cur=x;
                    count=1;
                }

            }
        }
        if(count>countmax) ans=cur;
        return ans;
    }
}