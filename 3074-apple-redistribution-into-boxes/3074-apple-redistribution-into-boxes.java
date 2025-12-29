class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int n=apple.length;
        int m= capacity.length;
        Arrays.sort(capacity);
        Arrays.sort(apple);
        int c=0;
        int sum1 = Arrays.stream(apple).sum();
       for(int i=m-1;i>=0;i--){
        if(sum1>0){
        sum1=sum1-capacity[i];
        c+=1;
       }
       }
       return c;
    }
}