class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;

        int[] squareSorted=new int[n];
        if(n==1){
            squareSorted[0]=nums[0]*nums[0];
            return squareSorted;
        }
        int idx=-1;
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0) {
                idx=i;
                break;
            }
        }

        int p1,p2;
        if(idx==-1){
            p1=n-1;
            p2=n;
        }
        else{
            p1=idx-1;
            p2=idx;
        }
        while(p1>=0 && p2<n){
            if(Math.abs(nums[p1])<nums[p2]){
                squareSorted[k++]=nums[p1]*nums[p1];
                p1--;
            }
            else{
                squareSorted[k++]=nums[p2]*nums[p2];
                p2++;
            }
        }
        while(p1>=0){
            squareSorted[k++]=nums[p1]*nums[p1];
            p1--;
        }
        while(p2<n){
            squareSorted[k++]=nums[p2]*nums[p2];
            p2++;
        }
        return squareSorted;

    }
}