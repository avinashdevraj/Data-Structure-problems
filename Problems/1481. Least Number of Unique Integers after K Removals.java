class Solution {
    class Node{
        int x;
        int count;
        Node(int x,int count){
            this.x=x;
            this.count=count;
        }
    }
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        // System.out.println(5^5);
        Queue<Node> q=new PriorityQueue<Node>((a,b)->(a.count-b.count));
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int y:map.keySet()){
            //System.out.print(y+" "+map.get(y)+" ");
            q.add(new Node(y,map.get(y)));
        }
        while(k>0 && q.size()>0){
            Node n=q.remove();
            if(n.count!=1)
                q.add(new Node(n.x,n.count-1));
            k--;
        }


        return q.size();
    }

}

