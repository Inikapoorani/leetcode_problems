class Solution {
    public int lastStoneWeightII(int[] stones) {
        int n=stones.length;
        int sum=0,target=0,b=0;
        for(int i=0;i<n;i++){
            sum+=stones[i];
        }
        target=sum/2;
        boolean[] dp=new boolean[target+1];
            for(int i=0;i<n;i++){
                dp[0]=true;
                for(int j=target;j>=stones[i];j--){
                    int a=j-stones[i];
                    if(dp[a]==true){
                        dp[j]=true;
                    }
                }
            }
            for(int j=target;j>=0;j-- ){
                if(dp[j]==true){
                    b=j;
                    break;
                }
            }
            return (sum-(b*2));
    }
}