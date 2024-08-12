class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n=tokens.length;
        int score=0;
        Arrays.sort(tokens);
        int p1=0,p2=n-1;
        while(p1<=p2){
            if(tokens[p1]<=power){
                power-=tokens[p1];
                score++;
                p1++;
            }
            else{
                if(score>0 && p1!=p2){
                    power+=tokens[p2];
                    p2--;
                    score--;
                }
                else break;
            }

        }
        return score;




    }
}