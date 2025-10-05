class Solution {
    public int candy(int[] ratings) {
        int tcount=0;
        int n=ratings.length;
        int[] cand=new int[n];
        for (int i = 0; i < n; i++) {
            cand[i] = 1;
        }
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                cand[i]=cand[i-1]+1;
            }
        }
        for(int i=n-1;i>0;i--){
            if(ratings[i-1]>ratings[i]){
                cand[i-1]=Math.max(cand[i]+1,cand[i-1]);
            }
            tcount+=cand[i-1];
        }
        return tcount+cand[n-1];
    }
}