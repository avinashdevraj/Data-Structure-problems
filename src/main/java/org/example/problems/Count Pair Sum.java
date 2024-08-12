public class Solution {
    public int solve(ArrayList<Integer> B, int A) {
        int n=B.size();
        int count=0,mod=1000000007;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int x=map.getOrDefault(B.get(i),0);
            x++;
            map.put(B.get(i),x);
        }
        for(int i=0;i<n;i++){
            int a=B.get(i),b=A-a;
            if(a!=b){
                if(map.getOrDefault(b,0)>=1) {
                    count+=map.getOrDefault(b,0);
                    map.put(a,map.getOrDefault(a,0)-1);

                }
            }
            else{
                if(map.getOrDefault(b,0)>1){
                    count+=map.getOrDefault(b,0)-1;
                    map.put(a,map.getOrDefault(a,0)-1);

                }
            }
        }
        return (count)%mod;

    }
}
