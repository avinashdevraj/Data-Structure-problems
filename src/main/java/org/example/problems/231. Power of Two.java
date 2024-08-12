1st-solution
class Solution {
    public boolean isPowerOfTwo(int n) {
        int low=0,high=32;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(pow(2,mid)==n) return true;
            if(pow(2,mid)>n){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;

    }
    int pow(int a,int b){
        if(b==0) return 1;
        if(b==1) return a;
        int hp=pow(a,b/2);
        if(b%2==0) return hp*hp;
        else return hp*hp*a;
    }
}


2nd-solution

class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}

3rd-solution

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        while(n%2==0) n/=2;
        return n==1;
    }
}