class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int l1=0,l2=0,r1=n-1,r2=m-1;
        while(l1<=r1 && l2<=r2){
            if(nums1[l1]==nums2[l2]) return nums1[l1];
            if(nums1[l1]<nums2[l2]){
                l1++;
            }
            else{
                l2++;
            }
        }
        return -1;

    }
}